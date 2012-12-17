package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Mustang extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Mustang();
	}

	public Mustang() {
		super("Mustang","Mustang",Resources.getInstance().b_mustang,"Base");
	}
	public Mustang(Vector2 location) {
		super("Mustang",location,"Mustang",Resources.getInstance().b_mustang,"Base");
	}
	
}
