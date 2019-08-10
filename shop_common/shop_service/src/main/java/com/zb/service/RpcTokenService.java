package com.zb.service;

import com.zb.pojo.QgUser;

public interface RpcTokenService {

    public String gengateToken(String strUserAgent, QgUser qgUser);

    public void saveToken(String token , QgUser qgUser);


}
