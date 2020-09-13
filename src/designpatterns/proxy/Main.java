package designpatterns.proxy;

public class Main {
	public static void main(String[] args) {
		Friend friend = new Friend(new Girl("达达"));
		friend.confession();
	}
}
