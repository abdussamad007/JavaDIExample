package com.java.di.example;

/**
 * 
 * @author abdus mondal
 *
 */
public class MainConstructorExample {
public static void main(String[] args) {
	SpellChecker spellChecker = new SpellChecker();
	
	TextEditor tx = new TextEditor();
	
	tx.setSpellChecker(spellChecker);
	
	tx.processSpelcheck();
}
}
