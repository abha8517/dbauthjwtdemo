package com.example.dbauthjwtdemo.repository;

import com.example.dbauthjwtdemo.model.DAOUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<DAOUser, Long> {
    DAOUser findByUsername(String username);
}