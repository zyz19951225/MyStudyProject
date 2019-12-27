package demo.dao;

import demo.entity.TestUser;
import demo.entity.TestUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TestUserMapper {
    int countByCriteria(TestUserCriteria example);

    int deleteByCriteria(TestUserCriteria example);

    int deleteByPrimaryKey(Integer fruitId);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    List<TestUser> selectByCriteriaWithRowbounds(TestUserCriteria example, RowBounds rowBounds);

    List<TestUser> selectByCriteria(TestUserCriteria example);

    TestUser selectByPrimaryKey(Integer fruitId);

    int updateByCriteriaSelective(@Param("record") TestUser record, @Param("example") TestUserCriteria example);

    int updateByCriteria(@Param("record") TestUser record, @Param("example") TestUserCriteria example);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}