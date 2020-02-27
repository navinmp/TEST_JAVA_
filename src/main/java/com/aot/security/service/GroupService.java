package com.aot.security.service;

import java.util.List;

import com.aot.security.model.Groups;

public interface GroupService {
	
	public Groups saveGroup(Groups groups);
	public Groups updateGroup(Groups groups);
	public void deleteGroup(int id);
	public List<Groups> findallGroups();
	
	
}
