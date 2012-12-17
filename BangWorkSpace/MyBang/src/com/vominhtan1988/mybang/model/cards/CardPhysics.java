package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;

public abstract class CardPhysics extends Sprite{
	private Vector2 prePosition;
	private Vector2 targetPosition;

	private Vector2 velocity0 = Vector2.Zero;
	private Vector2 acceleration = Vector2.Zero;

	private float moving_time = 0.7f;
	private float t = 0;
	private float V0 = 0,a = 0;

	private float preAngle,targetAngle;
	private float angle0,_angle;
	private float angle_accelerator;

	private boolean reached = true;
	private boolean angleReached = true;
	private Vector2  p = new Vector2();	
	
	private Sprite face;
	private Sprite back;
	
	public BoundingBox collisionBox = new BoundingBox();
	
	private boolean isFaceUp = false;
	public void setIsFaceUp(boolean isFaceUp){
		if (isFaceUp == this.isFaceUp) return;
		this.isFaceUp = isFaceUp;
		if (isFaceUp)
		{
			this.set(face);
			//this.setTexture(face.getTexture());
			
		}
		else 
		this.set(back);		
		//this.setTexture(back.getTexture());
	}
	public void setTargetPosition(Vector2 targetPosition,float arg_angle) {
		this.prePosition = this.targetPosition;
		this.targetPosition = targetPosition;		
		Vector2 subvetor = targetPosition.cpy().sub(prePosition).mul(-1);
		float angle  = subvetor.angle();				
		// Tinh khoang cach AB
		float distance = this.targetPosition.dst(prePosition);
		// lấy mốc thời gian T0 = 0
		t = 0;
		// Tính V0
		V0 = 2*distance / moving_time;		
		velocity0 = new Vector2(V0,0f);
		velocity0.setAngle(targetPosition.cpy().sub(prePosition).div(10).angle());
		// Tính gia tốc 
		a = V0 / moving_time;		
		acceleration = new Vector2(a, 0);
		acceleration.rotate(angle);
		System.out.println("preAngle:" + preAngle);
		this.preAngle = this.targetAngle;
		this.targetAngle = arg_angle;
		// Tinh goc quay
		targetAngle = targetAngle % 360;
		float totalAngle = 0;	
		if ( targetAngle >180){
			targetAngle = targetAngle-360;
		}		
		else if (targetAngle<-180){targetAngle = targetAngle + 360;}
		if (preAngle >180){
			preAngle = preAngle-360;
		}
		else if (preAngle<-180){preAngle = preAngle + 360;}
		if (targetAngle-preAngle>180){
			totalAngle = ((targetAngle-preAngle) - 360) % 360;
		}
		else if (targetAngle-preAngle<-180){
			totalAngle = ((targetAngle-preAngle) + 360) % 360;
		}
		else {
			totalAngle = (targetAngle-preAngle) % 360;
		}		
		//tinh angle0
		angle0 = 2*totalAngle/moving_time;
		// gia toc
		angle_accelerator = angle0/moving_time;

		reached = false;		
		angleReached = false;
	}

	public CardPhysics(Vector2 position,Sprite sprite_face,Sprite sprite_back) {
		super(sprite_back);
		this.isFaceUp = false;
		this.face = sprite_face;
		this.back = sprite_back;
		this.prePosition = position;
		this.targetPosition = position;
		this.p = position;
		this.preAngle = this.getRotation();
		this.targetAngle = this.getRotation();
		this.setX(position.x);
		this.setY(position.y);
		collisionBox.set(new Vector3(this.getVertices()[0], this.getVertices()[1], -10),new Vector3(this.getVertices()[10], this.getVertices()[11], 10));
		this.reached = false;		
	}
	@Override
	public void draw(SpriteBatch spriteBatch) {

		float delta_time = Gdx.graphics.getDeltaTime();
		t += delta_time;
		if (!reached){
			if (t<= moving_time){					
				p = prePosition.cpy().add(velocity0.cpy().mul(t).add((acceleration.cpy().mul(t*t).div(2))));
				//				BitmapFont font = new BitmapFont();
				//				font.draw(spriteBatch,p.toString(),this.getBoundingRectangle().x,this.getBoundingRectangle().y+this.getBoundingRectangle().height);		
				//this.setPosition(p.x,p.y);				
				this.setRotation(_angle);
				this.setX(p.x);
				this.setY(p.y);
				face.setRotation(_angle);
				face.setX(p.x);
				face.setY(p.y);
				back.setRotation(_angle);
				back.setX(p.x);
				back.setY(p.y);
			}
			if (epsilonEqual(p,targetPosition, 1f)){
				prePosition = targetPosition;					
				reached = true;
			}				
		}
		if (!angleReached){
			if (t<= moving_time){									
				_angle = preAngle+(angle0*t)-(0.5f*angle_accelerator*t*t);

			}
			if (epsilonEqual(targetAngle,_angle, 1f)){				
				preAngle = targetAngle;
				_angle = targetAngle;
				angleReached = true;
			}	
			this.setRotation(_angle);
			face.setRotation(_angle);			
			back.setRotation(_angle);			
		}
		this.collisionBox.set(new Vector3(this.getVertices()[0], this.getVertices()[1], -10),new Vector3(this.getVertices()[10], this.getVertices()[11], 10));
		super.draw(spriteBatch);
	}
	private boolean epsilonEqual(Vector2 v1,Vector2 v2,float epsilon){
		float dx = Math.abs(v1.x-v2.x);
		float dy = Math.abs(v1.y-v2.y);

		if (dx<=epsilon && dy<=epsilon){
			return true;
		}		
		return false;

	}
	private boolean epsilonEqual(float x,float x1,float epsilon){
		float dx = Math.abs(x-x1);		
		if (dx<=epsilon){
			return true;
		}
		return false;
	}	
	
}
