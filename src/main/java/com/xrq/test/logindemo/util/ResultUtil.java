package com.xrq.test.logindemo.util;

import com.xrq.test.logindemo.dto.Result;

public class ResultUtil {

    public static Result exist(Object object)
    {
        Result result=new Result();
        result.setSuccess(true);
        result.setData(object);
        return result;
    }

    public static Result permissionDenied()
    {
        Result result=new Result();
        result.setSuccess(true);
        result.setData("无权限");
        return result;
    }

    public static Result noexist()
    {
        Result result=new Result();
        result.setSuccess(false);
        result.setData("用户不存在");
        return result;
    }

    public static Result error()
    {
        Result result=new Result();
        result.setSuccess(false);
        result.setData("输入有误");
        return result;
    }
}
