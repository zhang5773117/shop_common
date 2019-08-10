package com.zb.mapper;
import com.zb.pojo.QgOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QgOrderMapper {

	public QgOrder getQgOrderById(@Param(value = "id") Long id)throws Exception;

	public List<QgOrder>	getQgOrderListByMap(Map<String,Object> param)throws Exception;

	public Integer getQgOrderCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertQgOrder(QgOrder qgOrder)throws Exception;

	public Integer updateQgOrder(QgOrder qgOrder)throws Exception;

	public Integer deleteQgOrder(@Param(value = "id") String id)throws Exception;

}
