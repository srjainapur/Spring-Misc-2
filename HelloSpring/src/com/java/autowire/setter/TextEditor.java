package com.java.autowire.setter;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired(required=false)
	private SpellChecker spellChecker;
	
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
