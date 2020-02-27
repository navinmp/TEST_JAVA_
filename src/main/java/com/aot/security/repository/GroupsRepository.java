package com.aot.security.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aot.security.model.Groups;

@Repository
@Transactional
public interface GroupsRepository  extends CrudRepository<Groups, Integer> {

}
