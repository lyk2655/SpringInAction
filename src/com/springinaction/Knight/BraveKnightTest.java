package com.springinaction.Knight;

import org.junit.Test;
import static org.mockito.Mockito.*;  


/**
 * @author linyk3
 * �����嵥 1.4 ����BraveKnight
 * ʹ��mock���Mocito����һ��Quest �ӿڵ�mockʵ��. 
 */
public class BraveKnightTest {
	
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class); //���� mock quest. ����mockʵ��һ��Quest,�����ɲ���BraveKnight
		BraveKnight knight = new BraveKnight(mockQuest); //ע�� mock quest
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();  //Ҫ��Mockito�����֤Quest��mockʵ����embark()���� ������������һ��
	}
}
