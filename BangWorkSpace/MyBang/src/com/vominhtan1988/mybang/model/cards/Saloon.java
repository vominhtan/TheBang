package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Saloon extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Saloon();
	}

	public Saloon() {
		super("Saloon","Saloon",Resources.getInstance().b_saloon,"Base");
	}
	public Saloon(Vector2 location) {
		super("Saloon",location,"Saloon",Resources.getInstance().b_saloon,"Base");
	}
	
}
