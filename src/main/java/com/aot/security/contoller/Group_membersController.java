package com.aot.security.contoller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.aot.security.model.GroupMembers;
import com.aot.security.service.GroupMembersService;

@RestController
public class Group_membersController {
	
	@Autowired
	GroupMembersService groupMembersService;
	
	@PostMapping("/group/members")
	public GroupMembers saveGroup(@RequestBody GroupMembers groupMembers)
	{
		
		return groupMembersService.saveGroupMembers(groupMembers);	
	}
	
	@PutMapping("/group/members")
	public GroupMembers updateGroup(@RequestBody GroupMembers groupMembers)
	{
		
		return groupMembersService.updateGroupMembers(groupMembers);
	}
	
	@DeleteMapping("/group/members/{id}")
	public void deleteUser(@PathVariable Integer id) {
		groupMembersService.deleteGroupMembers(id);
	}
	
	@GetMapping("/group/members")
	public Object getAllUser(@RequestHeader HttpHeaders requestHeader) {
		List<GroupMembers> groupMembers = (List<GroupMembers>) groupMembersService.findAllGroupMembers();
		if (groupMembers == null || groupMembers.isEmpty()) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return groupMembers;
	}
	
	@GetMapping("/group/members/userid/{id}")
	public Object getAllUserByUserId(@RequestHeader HttpHeaders requestHeader,@PathVariable Integer id) {
		List<GroupMembers> groupMembers = (List<GroupMembers>) groupMembersService.findAllByUserId(id);
		
		if (groupMembers == null || groupMembers.isEmpty()) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return groupMembers;
	}
	
	@GetMapping("/group/members/groupid/{id}")
	public Object getAllUserByGroupId(@RequestHeader HttpHeaders requestHeader,@PathVariable Integer id) {
		List<GroupMembers> groupMembers = (List<GroupMembers>) groupMembersService.findAllByGroupId(id);
		
		if (groupMembers == null || groupMembers.isEmpty()) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return groupMembers;
	}
	@GetMapping("/group/members/{groupid}/{userid}")
	public Object getAllUserByGroupIdAndUserId(@RequestHeader HttpHeaders requestHeader,@PathVariable Integer groupId,Integer userId) {
		List<GroupMembers> groupMembers = (List<GroupMembers>) groupMembersService.findAllByGroupIdAndUserId(groupId, userId);
		
		if (groupMembers == null || groupMembers.isEmpty()) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return groupMembers;
	}
	

}
