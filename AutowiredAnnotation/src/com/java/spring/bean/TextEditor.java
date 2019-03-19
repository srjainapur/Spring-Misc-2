package com.java.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private SpellChecker spellChecker;
	
	@Autowired
	private GrammerChecker grammerCheck;
	
	private ImageChecker imageChecker;
	
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	@Autowired
	public TextEditor(ImageChecker pImageChecker) {
		System.out.println("Inside TextEditor constructor." );
		imageChecker = pImageChecker; 
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	public void grammerCheck() {
		grammerCheck.grammerCheck();
	}
	
	public void checkImage() {
		imageChecker.checkImage();
	}
}
