package com.vominhtan1988.mybang;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.assets.loaders.TextureAtlasLoader;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Resources {
	
	public Sprite background = new Sprite(new Texture(Gdx.files.internal("data/spritepack/background.dat")));
	public Sprite logo = new Sprite(new Texture(Gdx.files.internal("data/spritepack/logo.png")));	
	
	
	public TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("data/spritepack/packhigh.pack"));    
	public Sprite characterBack = atlas.createSprite("characterBack");
	public Sprite playcardBack = atlas.createSprite("playcardBack");
	public Sprite rolecardBack = atlas.createSprite("rolecardBack");
	public Sprite r_sherriff = atlas.createSprite("r_sheriff");
	public Sprite r_deputy = atlas.createSprite("r_deputy");
	public Sprite r_outlaw = atlas.createSprite("r_outlaw");
	public Sprite r_renegade = atlas.createSprite("r_renegade");
	public Sprite b_bang = atlas.createSprite("b_bang");
	public Sprite b_volcanic = atlas.createSprite("b_volcanic");
	public Sprite b_appaloosa = atlas.createSprite("b_appaloosa");
	public Sprite b_barile = atlas.createSprite("b_barile");
	public Sprite b_birra = atlas.createSprite("b_birra");
	public Sprite b_rev_carabine = atlas.createSprite("b_rev_carabine");
	public Sprite b_cat_balou = atlas.createSprite("b_cat_balou");
	public Sprite b_diligenza = atlas.createSprite("b_diligenza");
	public Sprite b_duello = atlas.createSprite("b_duello");
	public Sprite b_dinamite = atlas.createSprite("b_dinamite");
	public Sprite b_emporio = atlas.createSprite("b_emporio");
	public Sprite b_gatling = atlas.createSprite("b_gatling");
	public Sprite b_indiani = atlas.createSprite("b_indiani");
	public Sprite b_prigione = atlas.createSprite("b_prigione");
	public Sprite b_mancato = atlas.createSprite("b_mancato");
	public Sprite b_mustang = atlas.createSprite("b_mustang");
	public Sprite b_panico = atlas.createSprite("b_panico");
	public Sprite b_remington = atlas.createSprite("b_remington");
	public Sprite b_saloon = atlas.createSprite("b_saloon");
	public Sprite b_schofield = atlas.createSprite("b_schofield");
	public Sprite b_wells_fargo = atlas.createSprite("b_wells_fargo");
	public Sprite b_winchester = atlas.createSprite("b_winchester");
	public Sprite c_willy_the_kid = atlas.createSprite("c_willy_the_kid");
	public Sprite c_bart_cassidy = atlas.createSprite("c_bart_cassidy");
	public Sprite c_black_jack = atlas.createSprite("c_black_jack");
	
	public static Resources instance;

	public static Resources getInstance() {
		if (instance == null) {
			instance = new Resources();
		}
		return instance;
	}
	
	public Resources() {
		
		reInit();
	}

	public void reInit() {
		dispose();			
		Preferences prefs = Gdx.app.getPreferences("mybang");		
		atlas = new TextureAtlas(Gdx.files.internal("data/spritepack/packhigh.pack"));
		characterBack = atlas.createSprite("characterBack");
		playcardBack = atlas.createSprite("playcardBack");
		rolecardBack = atlas.createSprite("rolecardBack");
		r_sherriff = atlas.createSprite("r_sheriff");
		r_deputy = atlas.createSprite("r_deputy");
		r_outlaw = atlas.createSprite("r_outlaw");
		r_renegade = atlas.createSprite("r_renegade");
		
		
		c_willy_the_kid = atlas.createSprite("c_willy_the_kid");
		c_bart_cassidy = atlas.createSprite("c_bart_cassidy");
		c_black_jack = atlas.createSprite("c_black_jack");
		
		b_bang = atlas.createSprite("b_bang");
		b_volcanic = atlas.createSprite("b_volcanic");		
		b_appaloosa = atlas.createSprite("b_appaloosa");
		b_barile = atlas.createSprite("b_barile");
		b_birra = atlas.createSprite("b_birra");
		b_rev_carabine = atlas.createSprite("b_rev_carabine");
		b_cat_balou = atlas.createSprite("b_cat_balou");
		b_diligenza = atlas.createSprite("b_diligenza");
		b_duello = atlas.createSprite("b_duello");
		b_dinamite = atlas.createSprite("b_dinamite");
		b_emporio = atlas.createSprite("b_emporio");
		b_gatling = atlas.createSprite("b_gatling");
		b_indiani = atlas.createSprite("b_indiani");
		b_prigione = atlas.createSprite("b_prigione");
		b_mancato = atlas.createSprite("b_mancato");
		b_mustang = atlas.createSprite("b_mustang");
		b_panico = atlas.createSprite("b_panico");
		b_remington = atlas.createSprite("b_remington");
		b_schofield = atlas.createSprite("b_schofield");
		b_winchester = atlas.createSprite("b_winchester");
	}

	private void dispose() {
		atlas.dispose();		
	}

}
