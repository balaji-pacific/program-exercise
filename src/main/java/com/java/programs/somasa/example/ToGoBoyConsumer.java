/**
 * 
 */
package com.java.programs.somasa.example;

import java.util.concurrent.BlockingQueue;

/**
 * @author balajisoundarrajan
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
				System.out.println("Taking outSomasa with spizy level : " + somasa.take().getSpizyLevel());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
