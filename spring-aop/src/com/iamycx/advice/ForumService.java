package com.iamycx.advice;

import java.sql.SQLException;

public class ForumService {
	public void removeForum(int forumId) {
		// do sth...
		throw new RuntimeException("�����쳣��");
	}
	public void updateForum(Forum forum) throws Exception{
		// do sth...
		throw new SQLException("���ݸ��²����쳣��");
		
	}
}