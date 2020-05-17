package io.github.mizhicn.mallshop.pruduct.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductAttrDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductAttrMapper extends BaseMapper<ProductAttrDO> {


    Integer selectCountByNameLike(@Param("name") String name);

    List<ProductAttrDO> selectListByNameLike(@Param("name") String name,
                                                  @Param("offset") Integer offset,
                                                  @Param("limit") Integer limit);

}
