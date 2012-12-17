package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Bang extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Bang();
	}

	public Bang() {
		super("Bang!","Bắn",Resources.getInstance().b_bang,"Base");
	}
	public Bang(Vector2 location) {
		super("Bang!",location,"Bắn",Resources.getInstance().b_bang,"Base");
	}
	
}
