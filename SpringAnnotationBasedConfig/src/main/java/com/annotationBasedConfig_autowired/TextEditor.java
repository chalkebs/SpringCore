package com.annotationBasedConfig_autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor 
{
	private SpellChecker spellChecker;
    
	@Autowired
	public void setSpellChecker( SpellChecker spellChecker )
	{
		System.out.println("1");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker( ) 
	{
		System.out.println("2");
		return spellChecker;
	}
	
	public void spellCheck() 
	{
	System.out.println("3");
      spellChecker.checkSpelling();
	}
}
