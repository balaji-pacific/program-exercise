/**
 * 
 */
package com.java.programs.somasa.example;

import java.util.concurrent.BlockingQueue;

/**
 * @author balajisoundarrajan
 *
 */
public class SomasaMasterProducer implements Runnable{
	
	private BlockingQueue<Somasa> somasa;

	public SomasaMasterProducer(BlockingQueue<Somasa> somasaTray) {
		this.somasa = somasaTray;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=100; i++) {
			try {
				System.out.println("Producing Somasa of spizy level " + i);
				somasa.put(new Somasa(Integer.valueOf(i)));
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
