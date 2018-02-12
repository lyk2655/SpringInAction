package com.springinaction.Knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author linyk3
 * 使用Java 配置来装配Bean,生成上下文,并按照KnightConfig类来装载注入
 */
public class knightMain {
	public static void main(String args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(com.springinaction.Knight.config.KnightConfig.class);
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
	}
}
