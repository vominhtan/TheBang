package com.vominhtan1988.mybang.model;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.model.cards.CardPhysics;

public abstract class Card extends CardPhysics{	
	public String name;
	public Player owner = null;
	public String version;		
	public Card(String name2, String description,Vector2 position, Sprite sprite_face,Sprite sprite_back, String string) {
		super(position,sprite_face,sprite_back);
		this.name = name2;
		version = string;
	}
	@Override
	public void draw(SpriteBatch spriteBatch) {
		
		super.draw(spriteBatch);
	}

}
