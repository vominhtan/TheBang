package com.vominhtan1988.mybang.background;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.vominhtan1988.mybang.Resources;

public class BackgroundFXRenderer {
	SpriteBatch backgroundFXBatch;
	
	SpriteBatch backgroundBatch;
	Sprite background;	

	public BackgroundFXRenderer() {
		
		backgroundFXBatch = new SpriteBatch();
		backgroundFXBatch.getProjectionMatrix().setToOrtho2D(0, 0, 800, 480);
		
		background = Resources.getInstance().background;
		backgroundBatch = new SpriteBatch();
		backgroundBatch.getProjectionMatrix().setToOrtho2D(0, 0, 1024, 1024);
	}


	float stateTime = 0;
	
	public void render() {		
		backgroundBatch.begin();
		background.draw(backgroundBatch);
		backgroundBatch.end();
		
		backgroundFXBatch.begin();
		
		backgroundFXBatch.end();		
	}
	
	public void resize(int width, int height) {
		backgroundFXBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height);
	}
	
	public void dispose() {
		backgroundFXBatch.dispose();
		backgroundBatch.dispose();
	}
	
}
