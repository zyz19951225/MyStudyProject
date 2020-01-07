package com.example.demo.dao;

import com.example.demo.dataobject.CountryDO;
import com.example.demo.dataobject.CountryDOCriteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface CountryDOMapper {
    int countByCriteria(CountryDOCriteria example);

    int deleteByCriteria(CountryDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CountryDO record);

    int insertSelective(CountryDO record);

    List<CountryDO> selectByCriteriaWithRowbounds(CountryDOCriteria example, RowBounds rowBounds);

    List<CountryDO> selectByCriteria(CountryDOCriteria example);

    CountryDO selectByPrimaryKey(Integer id);

    int updateByCriteriaSelective(@Param("record") CountryDO record, @Param("example") CountryDOCriteria example);

    int updateByCriteria(@Param("record") CountryDO record, @Param("example") CountryDOCriteria example);

    int updateByPrimaryKeySelective(CountryDO record);

    int updateByPrimaryKey(CountryDO record);
}