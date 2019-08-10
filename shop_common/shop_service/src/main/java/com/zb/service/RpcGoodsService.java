package com.zb.service;

import com.zb.pojo.QgGoodsMessage;

import java.util.List;

public interface RpcGoodsService {
    /**
     * 初始化方法商品信息到redis中
     * @throws Exception
     */
    public void initGoods()throws Exception;

    /**
     * 检查商品的库存s
     * @param goodsId
     * @return
     * @throws Exception
     */
    public int checkGoods(String goodsId) throws  Exception;

    /**
     * 锁定商品执行抢购记录的信息
     * @param goodsId
     * @param userId
     * @return
     * @throws Exception
     */
    public int lockGoods(String goodsId , String userId)throws Exception;

    /**
     * 根据用户编号获取抢购商品记录
     * @param userId
     * @return
     * @throws Exception
     */
    public List<QgGoodsMessage> findGoodsMessageByUser(String userId)throws Exception;

    /**
     * 修改商品的状态
     * @param qgGoodsMessage
     * @return
     */
    public int updateGoodsMessageStatus(QgGoodsMessage qgGoodsMessage);

}
