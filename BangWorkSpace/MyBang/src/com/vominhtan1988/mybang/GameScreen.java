package com.vominhtan1988.mybang;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.vominhtan1988.mybang.background.BackgroundFXRenderer;
import com.vominhtan1988.mybang.model.Card;
import com.vominhtan1988.mybang.model.GameInstance;
import com.vominhtan1988.mybang.model.Player;
import com.vominhtan1988.mybang.model.Role;
import com.vominhtan1988.mybang.model.cards.Bang;

public class GameScreen extends DefaultScreen implements InputProcessor{
	BackgroundFXRenderer backgroundFX = new BackgroundFXRenderer();
	SpriteBatch gameBatch;
	//OrthographicCamera cam;
	private int width = 1280;
	private int height = 800;
	float time = 0;
	public GameScreen(Game game) {
		super(game);

		Gdx.input.setInputProcessor(this);
		MyCamera.cam = new OrthographicCamera(width, height);		
		MyCamera.updateCamera(width, height);	
		Gdx.input.setInputProcessor(this);
	}
	@Override
	public void resize(int width, int height) { 
		super.resize(width, height);		
		gameBatch.getProjectionMatrix().set(MyCamera.cam.combined);				
	}
	@Override
	public void show() {
		super.show();
		gameBatch = new SpriteBatch();		
		gameBatch.getProjectionMatrix().set(MyCamera.cam.combined);		
	}
	@Override
	public void render(float delta) {
		delta = Math.min(0.06f, Gdx.graphics.getDeltaTime());
		
		time += delta;

		if (time < 1f)
			return;
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		backgroundFX.render();
				
		for (Player player : GameInstance.getInstance().players) {
			player.draw(delta);
		}				
		GameInstance.getInstance().deck.draw(delta);
	}

	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		GameInstance.getInstance().deck.touchDown(screenX, screenY, pointer, button);
		GameInstance.getInstance().players.get(0).touchDown(screenX, screenY, pointer, button);
		GameInstance.getInstance().players.get(1).touchDown(screenX, screenY, pointer, button);
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
