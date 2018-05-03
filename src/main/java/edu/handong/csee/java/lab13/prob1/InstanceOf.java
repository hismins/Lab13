package edu.handong.csee.java.lab13.prob1;



public class InstanceOf {//a class.

	public static void WhatFriend(Friend friend) {//a static void "WhatFriend" gets parameter "friend" which type is "Friend".
		//And it will check where the parameter is included.
		if(friend instanceof ClassFriend)
			((ClassFriend)friend).classFriend();//if "friend" was instance of "ClassFriend", runs friend.classFriend().
		else if(friend instanceof SchoolFriend)
			((SchoolFriend)friend).schoolFriend();//if "friend" was instance of "ClassFriend", runs friend.schoolFriend().
		else
			friend.justFriend();//else, runs friend.justFriend().

	}
}
