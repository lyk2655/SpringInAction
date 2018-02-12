/*程序清单 1.3*/
package com.springinaction.Knight;

public class BraveKnight implements Knight{
	private Quest quest;
	
	/*与DamselRescuingKnight不同,BravaKnight没有自行创建探险任务,而是在构造的时候把探险任务作为构造器参数传入.
	这是依赖注入的方式之一: 构造器注入
	传入的探险类型是Quest,是探险类的接口,所以BraveKnight 可以响应各种探险任务, RescueDamselQuest, SlayDragonQuest 等
	BraveKnight 没有与任何特定的Quest实现发生耦合
	*/
	public BraveKnight(Quest quest) {   //Quest 被注入进来
		this.quest = quest;            
	}                                  
	
	public void embarkOnQuest() {
		quest.embark();
	}
}
