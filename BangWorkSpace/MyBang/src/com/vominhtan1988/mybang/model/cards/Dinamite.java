package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Dinamite extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Dinamite();
	}

	public Dinamite() {
		super("Dinamite","Dinamite",Resources.getInstance().b_dinamite,"Base");
	}
	public Dinamite(Vector2 location) {
		super("Dinamite",location,"Dinamite",Resources.getInstance().b_dinamite,"Base");
	}
	
}
