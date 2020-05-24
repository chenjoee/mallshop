package io.github.mizhicn.mallshop.pruduct.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductCategoryDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductCategoryMapper extends BaseMapper<ProductCategoryDO> {


    List<ProductCategoryDO>  selectListByPidAndStatusOrderBySort(@Param("pid") Integer pid,
                                                                 @Param("status") Integer status);




}
