package com.example.log4j_slffj_project.dao;

import com.example.log4j_slffj_project.dataobject.UserDO;
import com.example.log4j_slffj_project.dataobject.UserDOCriteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface UserDOMapper {
    int countByCriteria(UserDOCriteria example);

    int deleteByCriteria(UserDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByCriteriaWithRowbounds(UserDOCriteria example, RowBounds rowBounds);

    List<UserDO> selectByCriteria(UserDOCriteria example);

    UserDO selectByPrimaryKey(Integer id);

    int updateByCriteriaSelective(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    int updateByCriteria(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}