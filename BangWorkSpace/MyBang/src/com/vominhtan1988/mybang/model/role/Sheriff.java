package com.vominhtan1988.mybang.model.role;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.vominhtan1988.mybang.Resources;
import com.vominhtan1988.mybang.model.Role;

public class Sheriff extends Role{
	
	public Sheriff(){
		super("Sheriff","Canh sat", new Sprite(Resources.getInstance().r_sherriff));
	}

}
