package com.coll.dao;

import java.util.List;

import com.coll.model.Friend;

public interface FriendDAO {

	public boolean addFriend(Friend friend);
	public boolean deleteFriend(Friend friend);
	public Friend getFriend(int friendid);
	public List<Friend> getFriends(String username);
	
}
