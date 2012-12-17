package com.vominhtan1988.mybang.model;

import java.util.Vector;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;
import com.vominhtan1988.mybang.model.cards.CardPhysics;

public abstract class Role extends CardPhysics{
	public String Desciption;
	public String Name;
	public Role(String name,String Desciption,Sprite sprite) {
		super(new Vector2(0,0),sprite,Resources.getInstance().rolecardBack);
		this.Name = name;
		this.Desciption = Desciption;		
	}
}
