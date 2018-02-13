/*�����嵥 1.3*/
package com.springinaction.Knight;

public class BraveKnight implements Knight{
	private Quest quest;
	
	private Minstrel minstrel; //��һ�γ��Խ�Minstrel ��� Braveknight �������
	
	/*��DamselRescuingKnight��ͬ,BravaKnightû�����д���̽������,�����ڹ����ʱ���̽��������Ϊ��������������.
	��������ע��ķ�ʽ֮һ: ������ע��
	�����̽��������Quest,��̽����Ľӿ�,����BraveKnight ������Ӧ����̽������, RescueDamselQuest, SlayDragonQuest ��
	BraveKnight û�����κ��ض���Questʵ�ַ������
	*/
	public BraveKnight(Quest quest, Minstrel minstrel) {   //Quest ��ע�����
		this.quest = quest;            
		this.minstrel = minstrel;
	}                                  
	
	public void embarkOnQuest() {
		//��ʱBraveKnight ����Ҫ���� Minstrel ��
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}
}
