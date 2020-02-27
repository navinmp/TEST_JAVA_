package com.aot.security.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aot.security.model.Groups;
import com.aot.security.repository.GroupsRepository;
import com.aot.security.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	GroupsRepository groupsRepository;
	@Override
	public Groups saveGroup(Groups groups) {
		// TODO Auto-generated method stub
		return groupsRepository.save(groups);
	}

	@Override
	public Groups updateGroup(Groups groups) {
		// TODO Auto-generated method stub
		return groupsRepository.save(groups);
	}

	@Override
	public void deleteGroup(int id) {
		// TODO Auto-generated method stub
		groupsRepository.delete(id);
	}

	@Override
	public List<Groups> findallGroups() {
		// TODO Auto-generated method stub
		return (List<Groups>) groupsRepository.findAll();
	}

}
