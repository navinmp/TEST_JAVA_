package com.aot.security.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aot.security.model.GroupMembers;
import com.aot.security.repository.GroupMembersRepository;
import com.aot.security.service.GroupMembersService;

@Service
public class GroupMembersServiceImpl implements GroupMembersService{

	@Autowired
	GroupMembersRepository groupMembersRepository;

	@Override
	public GroupMembers saveGroupMembers(GroupMembers groupMembers) {
		// TODO Auto-generated method stub
		return groupMembersRepository.save(groupMembers);
	}

	@Override
	public GroupMembers updateGroupMembers(GroupMembers groupMembers) {
		// TODO Auto-generated method stub
		return groupMembersRepository.save(groupMembers);
	}

	@Override
	public void deleteGroupMembers(int id) {
		// TODO Auto-generated method stub

		groupMembersRepository.delete(id);	
	}

	@Override
	public List<GroupMembers> findAllGroupMembers() {
		// TODO Auto-generated method stub
		return (List<GroupMembers>) groupMembersRepository.findAll();
	}

	@Override
	public List<GroupMembers> findAllByUserId(int userId) {
		// TODO Auto-generated method stub
		return groupMembersRepository.findAllByUserId(userId);
	}

	@Override
	public List<GroupMembers> findAllByGroupId(int groupId) {
		// TODO Auto-generated method stub
		return groupMembersRepository.findAllByGroupId(groupId);
	}

	@Override
	public List<GroupMembers> findAllByGroupIdAndUserId(int groupId, int userId) {
		// TODO Auto-generated method stub
		return groupMembersRepository.findAllByGroupIdAndUserId(groupId, userId);
	}




}
