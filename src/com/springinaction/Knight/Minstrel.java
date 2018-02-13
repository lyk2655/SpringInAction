package com.springinaction.Knight;

import java.io.PrintStream;

/**
 * @author linyk3
 * 吟游诗人时中世纪的音乐记录器
 * 使用吟游诗人这个服务类来记载骑士的所有事迹
 */
public class Minstrel {
	private PrintStream printStream;
	
	public Minstrel(PrintStream printStream) {
		this.printStream = printStream;
	}
	public void singBeforeQuest() {
		printStream.println("Fa la la, the knight is so brave!");
	}
	
	public void singAfterQuest() {
		printStream.println("Tee hee hee, the brave knight did embark on a quest!");
	}
}
