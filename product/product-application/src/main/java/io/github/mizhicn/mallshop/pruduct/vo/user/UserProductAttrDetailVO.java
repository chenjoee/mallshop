package io.github.mizhicn.mallshop.pruduct.vo.user;

import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrDetailValueBO;
//import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

//@ApiModel("商品规格详细")
@Data
@Accessors(chain = true)
public class UserProductAttrDetailVO {

    private Integer id;

    private String name;

    private Integer status;

    private Date createTime;

    private List<ProductAttrDetailValueBO> values;

}
