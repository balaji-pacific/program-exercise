/**
 * 
 */
package com.java.programs.somasa.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Balaji Soundarrajan
 *
 */
public class SomasaShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BlockingQueue<Somasa> somasaTray = new LinkedBlockingQueue<Somasa>();
		
		Thread producer = new Thread(new SomasaMasterProducer(somasaTray));
		Thread consmer = new Thread(new ToGoBoyConsumer(somasaTray));

		producer.start();
		consmer.start();
	}

}
