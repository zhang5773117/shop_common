package com.zb.mapper;
import com.zb.pojo.QgUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QgUserMapper {

	public QgUser getQgUserById(@Param(value = "id") Long id)throws Exception;

	public List<QgUser>	getQgUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getQgUserCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertQgUser(QgUser qgUser)throws Exception;

	public Integer updateQgUser(QgUser qgUser)throws Exception;


}
