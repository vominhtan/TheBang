package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Remington extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Remington();
	}

	public Remington() {
		super("Remington","Remington",Resources.getInstance().b_remington,"Base");
	}
	public Remington(Vector2 location) {
		super("Remington",location,"Remington",Resources.getInstance().b_remington,"Base");
	}
	
}
