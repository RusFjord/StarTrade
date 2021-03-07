package ru.ulteam8.startrade.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import ru.ulteam8.startrade.StarTradeGame;

public class PlayScreen implements Screen {

    private SpriteBatch batch;
    private OrthographicCamera camera;
    private Viewport viewport;

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    public PlayScreen(SpriteBatch batch) {
        this.batch = batch;
        this.camera = new OrthographicCamera();
        this.viewport = new FitViewport(StarTradeGame.V_WIDTH, StarTradeGame.V_HEIGHT, camera);
        TmxMapLoader mapLoader = new TmxMapLoader();
        map = mapLoader.load("star-map.tmx");
        renderer = new OrthogonalTiledMapRenderer(map);
        camera.position.set(viewport.getScreenWidth(), viewport.getScreenHeight(), 0);
    }

    @Override
    public void show() {

    }

    private void update(float delta) {
        renderer.setView(camera);
    }

    @Override
    public void render(float delta) {

        //this.update(delta);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        renderer.setView(camera);
        renderer.render();

        //batch.setProjectionMatrix(camera.combined);
    }

    @Override
    public void resize(int width, int height) {
        camera.viewportWidth = width;
        camera.viewportHeight = height;
        camera.update();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
