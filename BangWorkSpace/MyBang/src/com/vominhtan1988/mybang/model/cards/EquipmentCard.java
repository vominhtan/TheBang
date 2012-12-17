package com.vominhtan1988.mybang.model.cards;

import java.util.Vector;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;
import com.vominhtan1988.mybang.model.Card;

public abstract class EquipmentCard extends Card{

	public EquipmentCard(String name, String description, Sprite sprite_faceup, String string){
		super(name,description,new Vector2(0,0),sprite_faceup,Resources.getInstance().playcardBack,string);
	}
	public EquipmentCard(String name,Vector2 location, String description, Sprite sprite_faceup, String string){
		super(name,description,location,sprite_faceup,Resources.getInstance().playcardBack,string);
	}

}
