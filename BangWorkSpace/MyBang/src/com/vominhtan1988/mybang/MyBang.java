package com.vominhtan1988.mybang;
import com.badlogic.gdx.Game;
import com.vominhtan1988.mybang.mainmenu.MainMenu;

public class MyBang extends Game{	
	
	@Override
	public void create() {
		setScreen(new GameScreen(this));		
		
	}

}
