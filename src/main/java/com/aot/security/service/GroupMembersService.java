package com.aot.security.service;

import java.util.List;

import com.aot.security.model.GroupMembers;

public interface GroupMembersService {
	
  public  GroupMembers saveGroupMembers(GroupMembers groupMembers);
  public  GroupMembers updateGroupMembers(GroupMembers groupMembers);
  public  void deleteGroupMembers(int id);
  public List<GroupMembers> findAllGroupMembers();
  public List<GroupMembers> findAllByUserId(int userId);
  public List<GroupMembers> findAllByGroupId(int groupId);
  public List<GroupMembers> findAllByGroupIdAndUserId(int groupId,int userId );
  
}
