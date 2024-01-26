package com.anthonyguthrie.zdailycode_007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zdailycode007Application {

	public static void main(String[] args) {
		SpringApplication.run(Zdailycode007Application.class, args);
		System.out.println("App running...");

		Integer i0 = Integer.valueOf(args[0]);
		Integer i1 = Integer.valueOf(args[1]);

		System.out.println("Sum of arg0: " + i0 + " and arg1: " + i1 + " = " + (i0 + i1));
	}

}
