package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Duello extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Duello();
	}

	public Duello() {
		super("Duello","Duello",Resources.getInstance().b_duello,"Base");
	}
	public Duello(Vector2 location) {
		super("Duello",location,"Duello",Resources.getInstance().b_duello,"Base");
	}
	
}
