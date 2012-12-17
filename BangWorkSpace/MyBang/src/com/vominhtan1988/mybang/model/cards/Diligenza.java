package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Diligenza extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Diligenza();
	}

	public Diligenza() {
		super("Diligenza","Diligenza",Resources.getInstance().b_diligenza,"Base");
	}
	public Diligenza(Vector2 location) {
		super("Diligenza",location,"Diligenza",Resources.getInstance().b_diligenza,"Base");
	}
	
}
