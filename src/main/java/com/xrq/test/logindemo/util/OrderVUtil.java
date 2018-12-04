package com.xrq.test.logindemo.util;

import com.xrq.test.logindemo.dto.OrderV1;
import com.xrq.test.logindemo.dto.OrderV2;
import com.xrq.test.logindemo.entity.UserOrder;
import com.xrq.test.logindemo.enums.Version;

public class OrderVUtil {

    public static Object getUserV(UserOrder userOrder, String version) {
        if (Version.V1.getNumber().equals(version))
            return new OrderV1(userOrder.getId(), userOrder.getName());
        else if(Version.V2.getNumber().equals(version))
            return new OrderV2(userOrder.getId(), userOrder.getName(), userOrder.getMoney());
        else
            return null;
    }
}
