/*�����嵥 1.3*/
package com.springinaction.Knight;

public class BraveKnight implements Knight{
	private Quest quest;
	
	/*��DamselRescuingKnight��ͬ,BravaKnightû�����д���̽������,�����ڹ����ʱ���̽��������Ϊ��������������.
	��������ע��ķ�ʽ֮һ: ������ע��
	�����̽��������Quest,��̽����Ľӿ�,����BraveKnight ������Ӧ����̽������, RescueDamselQuest, SlayDragonQuest ��
	BraveKnight û�����κ��ض���Questʵ�ַ������
	*/
	public BraveKnight(Quest quest) {   //Quest ��ע�����
		this.quest = quest;            
	}                                  
	
	public void embarkOnQuest() {
		quest.embark();
	}
}
