package com.java.di.example;

/**
 * 
 * @author abdus mondal
 *
 */
public class TextEditor {
	
private SpellChecker spellChecker;

// approach 1
// this is not a DI 
//create the SpellChecker when we create the TextEditor object
TextEditor(){
	spellChecker = new SpellChecker();
}

//constructor injection
TextEditor(SpellChecker spellChecker){
	this.spellChecker = spellChecker;
}

//spellChecker.checkSpelling()
// oyu need to call the checkSpelling()
//setter injection
public void setSpellChecker(SpellChecker spellChecker) {
	this.spellChecker = spellChecker;
}




public void processSpelcheck(){
	spellChecker.checkSpelling();
}

}
