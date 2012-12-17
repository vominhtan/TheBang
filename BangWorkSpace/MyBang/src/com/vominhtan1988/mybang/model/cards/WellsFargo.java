package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class WellsFargo extends NormalCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new WellsFargo();
	}

	public WellsFargo() {
		super("Wells Fargo","Wells Fargo",Resources.getInstance().b_wells_fargo,"Base");
	}
	public WellsFargo(Vector2 location) {
		super("Wells Fargo",location,"Wells Fargo",Resources.getInstance().b_wells_fargo,"Base");
	}
	
}
