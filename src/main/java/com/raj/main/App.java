package com.raj.main;

import org.apache.camel.main.Main;

import com.raj.routes.SimpleRoute;

public class App {
	public static void main(String... args) throws Exception {
		// LOGGER.info("Inside MainApp");
		Main main = new Main();
		main.addRouteBuilder(new SimpleRoute());
		main.run(args);
	}
}
