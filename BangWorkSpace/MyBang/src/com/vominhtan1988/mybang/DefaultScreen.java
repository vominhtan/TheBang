package com.vominhtan1988.mybang;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

public abstract class DefaultScreen implements Screen{
//	private int width = 800;
//	private int height = 480;
//	OrthographicCamera cam;

	protected Game game;

	public DefaultScreen(Game game) {
		this.game = game;
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height) {		
		int _width = width;
		int _height = height;
		if (width == 480 && height == 320) {
			MyCamera.cam = new OrthographicCamera(700, 466);
			_width = 700;
			_height = 466;
		} else if (width == 320 && height == 240) {
			MyCamera.cam = new OrthographicCamera(700, 525);
			_width = 700;
			_height = 525;
		} else if (width == 400 && height == 240) {
			MyCamera.cam = new OrthographicCamera(800, 480);
			_width = 800;
			_height = 480;
		} else if (width == 432 && height == 240) {
			MyCamera.cam = new OrthographicCamera(700, 389);
			_width = 700;
			_height = 389;
		} else if (width == 960 && height == 640) {
			MyCamera.cam = new OrthographicCamera(800, 533);
			_width = 800;
			_height = 533;
		}  else if (width == 1366 && height == 768) {
			MyCamera.cam = new OrthographicCamera(1280, 720);
			_width = 1280;
			_height = 720;
		} else if (width == 1366 && height == 720) {
			MyCamera.cam = new OrthographicCamera(1280, 675);
			_width = 1280;
			_height = 675;
		} else if (width == 1536 && height == 1152) {
			MyCamera.cam = new OrthographicCamera(1366, 1024);
			_width = 1366;
			_height = 1024;
		} else if (width == 1920 && height == 1152) {
			MyCamera.cam = new OrthographicCamera(1366, 854);
			_width = 1366;
			_height = 854;
		} else if (width == 1920 && height == 1200) {
			MyCamera.cam = new OrthographicCamera(1366, 800);
			_width = 1280;
			_height = 800;
		} else if (width > 1280) {
			MyCamera.cam = new OrthographicCamera(1280, 768);
			_width = 1280;
			_height = 768;
		} else if (width < 800) {
			MyCamera.cam = new OrthographicCamera(800, 480);
			_width = 800;
			_height = 480;
		} else {
			MyCamera.cam = new OrthographicCamera(width, height);
		}
		MyCamera.updateCamera(_width, _height);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}	
}
