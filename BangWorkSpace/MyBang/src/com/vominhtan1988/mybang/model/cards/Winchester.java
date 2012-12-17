package com.vominhtan1988.mybang.model.cards;

import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;

public class Winchester extends EquipmentCard implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return new Winchester();
	}

	public Winchester() {
		super("Winchester","Winchester",Resources.getInstance().b_winchester,"Base");
	}
	public Winchester(Vector2 location) {
		super("Winchester",location,"Winchester",Resources.getInstance().b_winchester,"Base");
	}
	
}
