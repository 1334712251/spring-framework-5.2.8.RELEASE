package com.example;

public class UserServerImpl implements UserServer{



	@Override
	public User gerUserById() {
		User user = new User();
		user.setName("张三");
		user.setSex("男");
		user.setAge(18);


		return user;
	}
}
