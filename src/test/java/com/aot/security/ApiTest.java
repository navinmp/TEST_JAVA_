package com.aot.security;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.aot.security.model.GroupMembers;
import com.aot.security.model.Groups;
import com.aot.security.service.GroupMembersService;
import com.aot.security.service.GroupService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiTest {

	@Autowired
	GroupService groupService;
	
	@Autowired
	GroupMembersService groupMembersService;

	@Test
	public void addGroupTest() {

		Groups groups = new Groups();
		groups.setCreatedUserId(11);
		groups.setName("Group A");
		Assert.isInstanceOf(Groups.class, groupService.saveGroup(groups));

	}
	
	@Test
	public void addGroupMemberTest() {

		GroupMembers groupMembers = new GroupMembers();
		groupMembers.setUserId(1);
		groupMembers.setGroupId(1);
		Assert.isInstanceOf(GroupMembers.class, groupMembersService.saveGroupMembers(groupMembers));

	}

}
