package edu.handong.csee.java.lab13.prob1;

public class Main {//main class.

	public static void main(String[] args) {//main method.
		Friend friend1 = new Friend();//instantiation.
		SchoolFriend friend2 = new SchoolFriend();//instantiation.
		ClassFriend friend3 = new ClassFriend();//instantiation.

		InstanceOf.WhatFriend(friend1);//runs WhatFriend() in class "InstanceOf" with parameter "friend1" 
		InstanceOf.WhatFriend(friend2);//runs WhatFriend() in class "InstanceOf" with parameter "friend2"
		InstanceOf.WhatFriend(friend3);//runs WhatFriend() in class "InstanceOf" with parameter "friend3"
	}

}
