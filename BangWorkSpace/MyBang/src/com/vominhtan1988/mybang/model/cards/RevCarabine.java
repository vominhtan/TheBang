package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class RevCarabine extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new RevCarabine();
	}

	public RevCarabine() {
		super("RevCarabine","RevCarabine",Resources.getInstance().b_rev_carabine,"Base");
	}
	public RevCarabine(Vector2 location) {
		super("RevCarabine",location,"RevCarabine",Resources.getInstance().b_rev_carabine,"Base");
	}
	
}
