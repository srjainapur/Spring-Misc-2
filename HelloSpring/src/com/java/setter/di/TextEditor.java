package com.java.setter.di;

public class TextEditor {
	private SpellChecker sChecker;
	
	public void setsChecker(SpellChecker sChecker) {
		this.sChecker = sChecker;
	}
	
	public SpellChecker getsChecker() {
		return sChecker;
	}
	
	public void spellCheck() {
		sChecker.checkSpelling();
	}
}
