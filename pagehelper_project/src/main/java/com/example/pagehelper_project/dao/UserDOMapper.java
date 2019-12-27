package com.example.pagehelper_project.dao;

import com.example.pagehelper_project.dataobject.UserDO;
import com.example.pagehelper_project.dataobject.UserDOCriteria;
import java.util.List;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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

    List<UserDO> selectAll();

    @Select("SELECT * FROM USERS")
    Page<UserDO> findAll();

    int updateByCriteriaSelective(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    int updateByCriteria(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);


}