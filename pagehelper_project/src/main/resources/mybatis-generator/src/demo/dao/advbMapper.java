package demo.dao;

import demo.entity.advb;
import demo.entity.advbCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface advbMapper {
    int countByCriteria(advbCriteria example);

    int deleteByCriteria(advbCriteria example);

    int deleteByPrimaryKey(Integer fruitId);

    int insert(advb record);

    int insertSelective(advb record);

    List<advb> selectByCriteriaWithRowbounds(advbCriteria example, RowBounds rowBounds);

    List<advb> selectByCriteria(advbCriteria example);

    advb selectByPrimaryKey(Integer fruitId);

    int updateByCriteriaSelective(@Param("record") advb record, @Param("example") advbCriteria example);

    int updateByCriteria(@Param("record") advb record, @Param("example") advbCriteria example);

    int updateByPrimaryKeySelective(advb record);

    int updateByPrimaryKey(advb record);
}