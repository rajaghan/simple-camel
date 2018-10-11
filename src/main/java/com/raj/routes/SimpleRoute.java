package com.raj.routes;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/data/input?noop=true")
		.log("I am here")
		.to("file:/data/output");
	}

}
