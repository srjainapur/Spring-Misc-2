package com.java.autowire.constructor.xml;

public class Performer {
	private Instrument ins;
	
	public Performer(Instrument instrument) {
		this.ins = instrument;
	}
	
	@Override
    public String toString() {
        return "Performer [instrument=" + ins + "]";
    }
}
