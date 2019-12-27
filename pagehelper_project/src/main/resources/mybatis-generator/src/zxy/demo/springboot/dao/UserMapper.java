package zxy.demo.springboot.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import zxy.demo.springboot.entity.User;
import zxy.demo.springboot.entity.UserCriteria;

public interface UserMapper {
    int countByCriteria(UserCriteria example);

    int deleteByCriteria(UserCriteria example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByCriteriaWithRowbounds(UserCriteria example, RowBounds rowBounds);

    List<User> selectByCriteria(UserCriteria example);

    User selectByPrimaryKey(String userId);

    int updateByCriteriaSelective(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByCriteria(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}