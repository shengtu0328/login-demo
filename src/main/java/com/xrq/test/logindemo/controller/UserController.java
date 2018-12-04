package com.xrq.test.logindemo.controller;


import com.xrq.test.logindemo.dto.Result;
import com.xrq.test.logindemo.entity.User;
import com.xrq.test.logindemo.entity.UserOrder;
import com.xrq.test.logindemo.enums.Permission;
import com.xrq.test.logindemo.repository.UserOrderRepository;
import com.xrq.test.logindemo.repository.UserRepository;
import com.xrq.test.logindemo.util.OrderVUtil;
import com.xrq.test.logindemo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserOrderRepository userOrderRepository;

    @ResponseBody
    @RequestMapping(value = {"/getUser"}, method = RequestMethod.GET)
    public Result getUser(String name, String version, String keyword) {


        User user = userRepository.findByName(name);
        if (user != null) {
            if (Permission.ADMITTED.getState() == user.getPermission()) {
                List<UserOrder> userOrderList1 = userOrderRepository.findByName(keyword);
                List<Object> userOrderList = userOrderRepository.findByName(keyword).stream()
                        .map(userOrder -> OrderVUtil.getUserV(userOrder, version))
                        .collect(Collectors.toList());
                return ResultUtil.exist(userOrderList);
            } else {
                return ResultUtil.permissionDenied();
            }
        } else {
            return ResultUtil.noexist();
        }

    }


}
