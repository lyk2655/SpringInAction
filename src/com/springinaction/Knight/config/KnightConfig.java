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
 * Spring ʹ�� Java ���� ��װ�� bean
 * ͨ���������������Bean֮�����ϵ.
 * ���ｫquest ע�� Knight, ��System.outע��Quest
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
	
	//��һ�γ��Խ�BraveKnight���Minstrel��������
	@Bean
	public Minstrel minstrel() {
		return new Minstrel(System.out);
	}
	
}
