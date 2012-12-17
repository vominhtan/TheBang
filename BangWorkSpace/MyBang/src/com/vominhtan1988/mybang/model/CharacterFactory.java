package com.vominhtan1988.mybang.model;

import java.util.ArrayList;

import com.badlogic.gdx.utils.Array;
import com.vominhtan1988.mybang.model.character.BartCassidy;
import com.vominhtan1988.mybang.model.character.BlackJack;
import com.vominhtan1988.mybang.model.character.WillyTheKid;

public class CharacterFactory {
	
	private ArrayList<Character> characters;

	public ArrayList<Character> getCharacters() {
		if (characters==null ){
			characters = new ArrayList<Character>();
			characters.add(new WillyTheKid());
			characters.add(new BlackJack());
			characters.add(new BartCassidy());
			characters.add(new WillyTheKid());
			characters.add(new BlackJack());
			characters.add(new BartCassidy());
			characters.add(new BartCassidy());
		}
		return characters;
	}

	private CharacterFactory(){}
	private static CharacterFactory Instance;
	public static CharacterFactory getInstance() {
		if (Instance== null){
			Instance = new CharacterFactory();
		}
		return Instance;

	}
}

