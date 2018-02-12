package com.springinaction.Knight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.Knight.BraveKnight;
import com.springinaction.Knight.Knight;
import com.springinaction.Knight.Quest;
import com.springinaction.Knight.SlayDragonQuest;


/**
 * @author linyk3
 * Spring ʹ�� Java ���� ��װ�� bean
 */
@Configuration
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		// TODO Auto-generated method stub
		return new SlayDragonQuest(System.out);
	}
	
	
}
