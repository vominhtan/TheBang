package com.vominhtan1988.mybang.model;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Point;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.model.cards.CardPhysics;

public abstract class Character extends CardPhysics{	

	public int MaxHealthPoint;
	public String Name;	
	public Character(String name,Vector2 position,int maxHealthPoint,Sprite sprite_face,Sprite sprite_back) {	
		super(position,sprite_face,sprite_back);			
		this.Name = name;
		this.MaxHealthPoint = maxHealthPoint;		
	}
	@Override
	public void draw(SpriteBatch spriteBatch) {	
		super.draw(spriteBatch);
	}		

}
