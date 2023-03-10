/**
 * 
 */
package com.java.programs.somasa.example;

import java.util.concurrent.BlockingQueue;

/**
 * @author Balaji Soundarrajan
 *
 */
public class ToGoBoyConsumer implements Runnable{
	
	private BlockingQueue<Somasa> somasa;
	
	public ToGoBoyConsumer(BlockingQueue<Somasa> somasaTray) {
		this.somasa = somasaTray;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Taking out Somasa with spizy level " + somasa.take().getSpizyLevel() + " from the tray");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
