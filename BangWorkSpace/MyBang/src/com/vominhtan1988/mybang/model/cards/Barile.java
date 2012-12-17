package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Barile extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Barile();
	}

	public Barile() {
		super("Barile","Barile",Resources.getInstance().b_barile,"Base");
	}
	public Barile(Vector2 location) {
		super("Barile",location,"Barile",Resources.getInstance().b_barile,"Base");
	}
	
}
