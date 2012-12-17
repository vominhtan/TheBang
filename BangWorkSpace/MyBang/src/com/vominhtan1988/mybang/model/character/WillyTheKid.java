package com.vominhtan1988.mybang.model.character;
import java.util.concurrent.LinkedBlockingDeque;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.vominhtan1988.mybang.Resources;
import com.vominhtan1988.mybang.model.Character;

public class WillyTheKid extends Character{
	
	LinkedBlockingDeque<Float> angles = new LinkedBlockingDeque<Float>();	
	public WillyTheKid() {
		super("Willy The Kid",new Vector2(0,0), 4, Resources.getInstance().c_willy_the_kid, Resources.getInstance().characterBack);
	}	

}
