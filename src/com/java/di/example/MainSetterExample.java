package com.java.di.example;

/**
 * Example of Setter Injection
 * @author Abdus mondal
 *
 */
public class MainSetterExample {
public static void main(String[] args) {
	TextEditor textEditor = new TextEditor();
	SpellChecker spellChecker = new SpellChecker();
	
	textEditor.setSpellChecker(spellChecker);
	
	textEditor.processSpelcheck();
}
}
