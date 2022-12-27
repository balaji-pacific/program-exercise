/**
 * 
 */
package com.java.programs.somasa.example;

/**
 * @author balajisoundarrajan
 *
 */
public class Somasa {
	
	private Integer spizyLevel;
	
	
	public Somasa(Integer spInteger) {
		this.spizyLevel = spInteger;
	}

	/**
	 * @return the spizyLevel
	 */
	public Integer getSpizyLevel() {
		return spizyLevel;
	}

	/**
	 * @param spizyLevel the spizyLevel to set
	 */
	public void setSpizyLevel(Integer spizyLevel) {
		this.spizyLevel = spizyLevel;
	}

	@Override
	public String toString() {
		return "Somasa [spizyLevel=" + spizyLevel + "]";
	}
	
	

}
