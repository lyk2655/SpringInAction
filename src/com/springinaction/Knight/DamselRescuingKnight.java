package com.springinaction.Knight;


public class DamselRescuingKnight {
	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();  //�� RescueDamselQuest �����
	}
	
	public void embarkOnQuest() {
		quest.embark();   // DamselRescuingKnight ֻ��ִ�� RescueDamselQuest ̽������
	}
}
