package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Appaloosa extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Appaloosa();
	}

	public Appaloosa() {
		super("Appaloosa","Appaloosa",Resources.getInstance().b_appaloosa,"Base");
	}
	public Appaloosa(Vector2 location) {
		super("Appaloosa",location,"Appaloosa",Resources.getInstance().b_appaloosa,"Base");
	}
	
}
