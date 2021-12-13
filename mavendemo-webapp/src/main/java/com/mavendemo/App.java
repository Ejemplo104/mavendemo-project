package com.mavendemo;

import org.apache.log4j.Logger;

public class App {


	private static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println("Printed to standard output this program");

		LOGGER.debug(calculator.add(1, 2));
		LOGGER.debug(calculator.substract(1, 2));
		LOGGER.debug(calculator.multiply(1, 2));
		LOGGER.debug(calculator.divide(1, 2));

	}

}
