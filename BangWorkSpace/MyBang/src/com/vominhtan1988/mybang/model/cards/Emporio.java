package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Emporio extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Emporio();
	}

	public Emporio() {
		super("Emporio","Emporio",Resources.getInstance().b_emporio,"Base");
	}
	public Emporio(Vector2 location) {
		super("Emporio",location,"Emporio",Resources.getInstance().b_emporio,"Base");
	}
	
}
