package dev.sumihiran.eventflow.bootstrap;

import org.springframework.boot.SpringApplication;

public class TestEventFlowAdaptor {

	public static void main(String[] args) {
		SpringApplication.from(EventFlowAdaptor::main).with(TestcontainersConfiguration.class).run(args);
	}

}
