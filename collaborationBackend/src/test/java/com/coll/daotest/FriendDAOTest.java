package com.coll.daotest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coll.dao.FriendDAO;
import com.coll.model.Friend;

public class FriendDAOTest {

	static FriendDAO friendDAO;
	
	@BeforeClass
	public static void executefirst() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.coll");
		context.refresh();
		friendDAO=(FriendDAO)context.getBean("friendDAO");
	}
	@Ignore
	@Test
	public void addfriendtest() {
		Friend friend=new Friend();
		friend.setFriendName("raj");
		friend.setFriendusername("raj123");
		friend.setUsername("naveen");
		friend.setStatus("NA");
		assertTrue("problem in adding friend",friendDAO.addFriend(friend));
	}
	@Ignore
	@Test
	public void getfriendtest() {
		assertNotNull("problem in getting user",friendDAO.getFriend(501));
	}
	@Ignore
	@Test
	public void deletefriendtest() {
		Friend friend=friendDAO.getFriend(503);
		assertTrue("problem in adding friend",friendDAO.deleteFriend(friend));
	}
	@Test
	public void getfriendstest() {
		List<Friend> listFriends=friendDAO.getFriends("naveen");
		for(Friend friend:listFriends) {
			System.out.println("friendname:"+friend.getFriendName());
		}
	}
}
