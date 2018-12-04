package com.xrq.test.logindemo.repository;

import com.xrq.test.logindemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    public List<User> findByNameAndPassword(String Name,String password);

    public List<User> findByName(String Name);

}
