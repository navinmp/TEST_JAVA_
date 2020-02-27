package com.aot.security.repository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aot.security.model.GroupMembers;
@Repository
@Transactional
public interface GroupMembersRepository extends CrudRepository<GroupMembers, Integer> {
	
	public List<GroupMembers> findAllByUserId(int userId);
	public List<GroupMembers> findAllByGroupId(int groupId);
	public List<GroupMembers> findAllByGroupIdAndUserId(int groupId,int userId );
	

}
