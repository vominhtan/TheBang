package com.vominhtan1988.mybang;

import java.util.ArrayList;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyCamera extends SpriteBatch{

	public static OrthographicCamera cam;
	public static void updateCamera(int wight,int height){
		cam.position.x = wight/2;
		cam.position.y = height/2;		
		cam.update();
		for (ICameraEventListener listener : listeners) {
			listener.CameraEventHandler(new CameraEvent());
		}
	}	
	public static ArrayList<ICameraEventListener> listeners = new ArrayList<ICameraEventListener>();
	public static void addCameraEventListener(ICameraEventListener listener){
		listeners.add(listener);
	}	
	
	
}
