package com.aot.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "group_members")
public class GroupMembers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 25)
	private int id;
	@Column(name = "groupId")
	private int groupId;
	@Column(name = "userId")
	private int userId;
	@Column(name = "groupRole", length = 20)
	private String groupRole;
	@Column(name = "enabled")
	private short enabled;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getGroupRole() {
		return groupRole;
	}
	public void setGroupRole(String groupRole) {
		this.groupRole = groupRole;
	}
	public short getEnabled() {
		return enabled;
	}
	public void setEnabled(short enabled) {
		this.enabled = enabled;
	}


}
