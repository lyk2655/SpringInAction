package com.springinaction.Knight;

import org.junit.Test;
import static org.mockito.Mockito.*;  


/**
 * @author linyk3
 * 程序清单 1.4 测试BraveKnight
 * 使用mock框架Mocito創建一個Quest 接口的mock实现. 
 */
public class BraveKnightTest {
	
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class); //创建 mock quest. 利用mock实现一个Quest,好轻松测试BraveKnight
		Minstrel mockMinstrel = mock(Minstrel.class); 
		BraveKnight knight = new BraveKnight(mockQuest,mockMinstrel); //注入 mock quest,第一次尝试将BraveKnight 和Minstrel 结合起来测试
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();  //要求Mockito框架验证Quest的mock实例的embark()方法 仅仅被调用了一次
	}
}
