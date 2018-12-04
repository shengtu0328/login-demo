package com.xrq.test.logindemo.repository;

import com.xrq.test.logindemo.entity.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserOrderRepository extends JpaRepository<UserOrder, Integer> {

    public List<UserOrder> findByName(String name);

}
