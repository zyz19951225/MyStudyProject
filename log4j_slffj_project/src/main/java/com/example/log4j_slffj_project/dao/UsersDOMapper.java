package com.example.log4j_slffj_project.dao;

import com.example.log4j_slffj_project.dataobject.UsersDO;
import com.example.log4j_slffj_project.dataobject.UsersDOCriteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
public interface UsersDOMapper {
    int countByCriteria(UsersDOCriteria example);

    int deleteByCriteria(UsersDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UsersDO record);

    int insertSelective(UsersDO record);

    @Select("select * from users")
    List<UsersDO> selectAll();

    @Select("select * from users where id = ${userId}")
    UsersDO selectUserById(int userId);

    List<UsersDO> selectByCriteriaWithRowbounds(UsersDOCriteria example, RowBounds rowBounds);

    List<UsersDO> selectByCriteria(UsersDOCriteria example);

    UsersDO selectByPrimaryKey(Integer id);

    int updateByCriteriaSelective(@Param("record") UsersDO record, @Param("example") UsersDOCriteria example);

    int updateByCriteria(@Param("record") UsersDO record, @Param("example") UsersDOCriteria example);

    int updateByPrimaryKeySelective(UsersDO record);

    int updateByPrimaryKey(UsersDO record);
}