package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class ManCato extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new ManCato();
	}

	public ManCato() {
		super("ManCato!","ManCato",Resources.getInstance().b_mancato,"Base");
	}
	public ManCato(Vector2 location) {
		super("ManCato!",location,"ManCato",Resources.getInstance().b_mancato,"Base");
	}
	
}
