package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class CatBalou extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new CatBalou();
	}

	public CatBalou() {
		super("Cat Balou","Cat Balou",Resources.getInstance().b_cat_balou,"Base");
	}
	public CatBalou(Vector2 location) {
		super("Cat Balou",location,"Cat Balou",Resources.getInstance().b_cat_balou,"Base");
	}
	
}
