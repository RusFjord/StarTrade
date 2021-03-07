package ru.ulteam8.startrade;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import ru.ulteam8.startrade.screens.PlayScreen;

public class StarTradeGame extends Game {

	public static final int V_WIDTH = 800;
	public static final int V_HEIGHT = 600;

	private SpriteBatch batch;
	private PlayScreen screen;
	
	@Override
	public void create () {
		this.batch = new SpriteBatch();
		this.screen = new PlayScreen(this.batch);
		setScreen(this.screen);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
