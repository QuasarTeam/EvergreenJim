package com.quasar.EvergreenJim;

import Regions.MonkeyRegion;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable, AssetErrorListener {
	AssetMonkey am = new AssetMonkey();

	public static final String TAG = Assets.class.getName();


	public class AssetMonkey {

		SpriteBatch batch;
		AssetManager am;
		Texture tex;
		Rectangle monkey;
		private MonkeyRegion mr;

		public AssetMonkey() {
			mr = new MonkeyRegion();
			am = new AssetManager();
			batch = new SpriteBatch();
		    monkey = new Rectangle();
		    monkey.x = (mr.r3.xmax + mr.r3.xmin)/2; // 64?
		    monkey.y = (mr.r3.ymax + mr.r3.ymin)/2 - 234; // Corregir esto
		    monkey.width = 64;
		    monkey.height = 64;
		}

		void load() {
			am.load("test.png", Texture.class);
			tex = new Texture(Gdx.files.internal("test.png"));
		}

		public void render() {
			batch.begin();
			batch.draw(tex, monkey.x, monkey.y);
			batch.end();
		}
	}

	@Override
	public void error(String fileName, Class type, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
