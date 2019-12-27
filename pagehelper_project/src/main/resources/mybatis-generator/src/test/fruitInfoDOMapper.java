package test;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import test.fruitInfoDO;
import test.fruitInfoDOCriteria;

public interface fruitInfoDOMapper {
    int countByCriteria(fruitInfoDOCriteria example);

    int deleteByCriteria(fruitInfoDOCriteria example);

    int deleteByPrimaryKey(Integer fruitId);

    int insert(fruitInfoDO record);

    int insertSelective(fruitInfoDO record);

    List<fruitInfoDO> selectByCriteriaWithRowbounds(fruitInfoDOCriteria example, RowBounds rowBounds);

    List<fruitInfoDO> selectByCriteria(fruitInfoDOCriteria example);

    fruitInfoDO selectByPrimaryKey(Integer fruitId);

    int updateByCriteriaSelective(@Param("record") fruitInfoDO record, @Param("example") fruitInfoDOCriteria example);

    int updateByCriteria(@Param("record") fruitInfoDO record, @Param("example") fruitInfoDOCriteria example);

    int updateByPrimaryKeySelective(fruitInfoDO record);

    int updateByPrimaryKey(fruitInfoDO record);
}