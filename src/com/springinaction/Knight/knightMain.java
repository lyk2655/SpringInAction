package com.springinaction.Knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class knightMain {
	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(com.springinaction.Knight.config.KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
	}
}
