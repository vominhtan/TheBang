package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Prigione extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Prigione();
	}

	public Prigione() {
		super("Prigione","Prigione",Resources.getInstance().b_prigione,"Base");
	}
	public Prigione(Vector2 location) {
		super("Prigione",location,"Prigione",Resources.getInstance().b_prigione,"Base");
	}
	
}
