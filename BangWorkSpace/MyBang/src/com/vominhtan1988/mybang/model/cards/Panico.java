package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Panico extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Panico();
	}

	public Panico() {
		super("Panico!","Panico",Resources.getInstance().b_panico,"Base");
	}
	public Panico(Vector2 location) {
		super("Panico!",location,"Panico",Resources.getInstance().b_panico,"Base");
	}
	
}
