package com.java.constructor.di;

public class TextEditor {
	private SpellChecker spellChecker;

	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor." );
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpell();		
	}
}
