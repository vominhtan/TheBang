package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Indiani extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Indiani();
	}

	public Indiani() {
		super("Indiani","Indiani",Resources.getInstance().b_indiani,"Base");
	}
	public Indiani(Vector2 location) {
		super("Indiani",location,"Indiani",Resources.getInstance().b_indiani,"Base");
	}
	
}
