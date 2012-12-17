package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Schofield extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Schofield();
	}

	public Schofield() {
		super("Schofield","Schofield",Resources.getInstance().b_remington,"Base");
	}
	public Schofield(Vector2 location) {
		super("Schofield",location,"Schofield",Resources.getInstance().b_remington,"Base");
	}
	
}
