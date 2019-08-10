package com.zb.service;

import com.zb.pojo.QgUser;

public interface RpcUserService {
    public QgUser findUserLogin(String name , String pwd);

    public QgUser findUserByToken(String token) throws  Exception;

}
