package com.springinaction.Knight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.Knight.BraveKnight;
import com.springinaction.Knight.Knight;
import com.springinaction.Knight.Minstrel;
import com.springinaction.Knight.Quest;
import com.springinaction.Knight.SlayDragonQuest;


/**
 * @author linyk3
 * Spring 使用 Java 配置 来装配 bean
 * 通过这个配置来控制Bean之间的联系.
 * 这里将quest 注入 Knight, 将System.out注入Quest
 */
@Configuration
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new BraveKnight(quest(),minstrel());
	}
	
	@Bean
	public Quest quest() {
		// TODO Auto-generated method stub
		return new SlayDragonQuest(System.out);
	}
	
	//第一次尝试将BraveKnight类和Minstrel类结合起来
	@Bean
	public Minstrel minstrel() {
		return new Minstrel(System.out);
	}
	
}
