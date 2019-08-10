package com.zb.service;

import com.zb.pojo.QgOrder;

public interface RpcOrderService {
    /**
     * 添加订单
     * @param qgOrder
     * @return
     */
    public int inserOrder(QgOrder qgOrder);

    /**
     * 删除订单， 执行事务回滚时，由消息中间件调用
     * @param id
     * @return
     */
    public int deleteOrder(String id);

}
