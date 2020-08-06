package cn.smbms.service.user;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import cn.smbms.pojo.User;

public class UserServiceTest {
	private UserService userService;
	@Before
	public void setUp() throws Exception {
		userService = new UserServiceImpl();
	}

	@Test
	public void testAdd() {
		User user = new User();
		user.setUserCode("111");
		user.setUserName("222");
		boolean result = userService.add(user);
		//result = false;
		//断言
		Assert.assertTrue("增加失败", result);
		
		
	}
	
	@Test 
	public void testGetUserList(){
		List<User> userList = new ArrayList<User>();
		userList = userService.getUserList("",0,1,5);
		Assert.assertEquals(7, userList.size());
	}

}
