package com.springinaction;


public class DamselRescuingKnight {
	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();  //与 RescueDamselQuest 紧耦合
	}
	
	public void embarkOnQuest() {
		quest.embark();   // DamselRescuingKnight 只能执行 RescueDamselQuest 探险任务
	}
}
