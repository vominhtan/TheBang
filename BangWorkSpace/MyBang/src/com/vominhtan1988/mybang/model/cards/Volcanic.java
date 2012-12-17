package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Volcanic extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Volcanic();
	}

	public Volcanic() {
		super("Volcanic!","Volcanic",Resources.getInstance().b_volcanic,"Base");
	}
	public Volcanic(Vector2 location) {
		super("Volcanic!",location,"Volcanic",Resources.getInstance().b_volcanic,"Base");
	}
	
}
