package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Gatling extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Gatling();
	}

	public Gatling() {
		super("Gatling","Gatling",Resources.getInstance().b_gatling,"Base");
	}
	public Gatling(Vector2 location) {
		super("Gatling",location,"Gatling",Resources.getInstance().b_gatling,"Base");
	}
	
}
