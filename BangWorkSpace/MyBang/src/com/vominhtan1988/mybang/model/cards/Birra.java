package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Birra extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Birra();
	}

	public Birra() {
		super("Birra","Beer",Resources.getInstance().b_birra,"Base");
	}
	public Birra(Vector2 location) {
		super("Birra",location,"Beer",Resources.getInstance().b_birra,"Base");
	}
	
}