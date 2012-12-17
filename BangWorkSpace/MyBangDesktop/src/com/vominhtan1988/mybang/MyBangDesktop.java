package com.vominhtan1988.mybang;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class MyBangDesktop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title ="The Bang!";
		config.fullscreen = true;
		config.width =1280;
		config.height =800;
		config.useGL20 = true;
		new LwjglApplication(new MyBang(),config);
		
	}

}
