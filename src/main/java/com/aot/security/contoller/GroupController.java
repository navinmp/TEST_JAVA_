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

import com.aot.security.model.Groups;
import com.aot.security.service.GroupService;

@RestController
public class GroupController {

	@Autowired
	GroupService groupService;

	@PostMapping("/groups")
	public Groups saveGroup(@RequestBody Groups groups)
	{

		return groupService.saveGroup(groups);	
	}

	@PutMapping("/groups")
	public Groups updateGroup(@RequestBody Groups groups)
	{

		return groupService.updateGroup(groups);	
	}

	@DeleteMapping("/groups/{id}")
	public void deleteUser(@PathVariable Integer id) {
		groupService.deleteGroup(id);
	}

	@GetMapping("/groups")
	public Object getAllUser(@RequestHeader HttpHeaders requestHeader) {
		List<Groups> groups = (List<Groups>) groupService.findallGroups();
		if (groups == null || groups.isEmpty()) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return groups;
	}




}
