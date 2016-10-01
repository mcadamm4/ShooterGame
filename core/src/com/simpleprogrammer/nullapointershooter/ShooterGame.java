package com.simpleprogrammer.nullapointershooter;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ShooterGame extends ApplicationAdapter {
	SpriteBatch batch;
    AnimatedSprite shipAnimation;
	Texture background;
    Texture ship;


	@Override
	public void create () {
        batch = new SpriteBatch();
	    background = new Texture(Gdx.files.internal("space.jpg"));
	    ship = new Texture(Gdx.files.internal("shipSheet.png"));
        Sprite spaceShipSprite = new Sprite(ship);
		shipAnimation = new AnimatedSprite(spaceShipSprite);
    }

	@Override
	public void render () {
		Gdx.gl.glClearColor(10, 0, 0, 10);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        batch.draw(background, 0, 0);
        shipAnimation.draw(batch);
        shipAnimation.setPosition(900, 10);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
