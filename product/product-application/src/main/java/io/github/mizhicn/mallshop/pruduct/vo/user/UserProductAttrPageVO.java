package io.github.mizhicn.mallshop.pruduct.vo.user;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

//@ApiModel("商品规格明细分页")
@Data
@Accessors(chain = true)
public class UserProductAttrPageVO implements Serializable {

    @ApiModelProperty("总数")
    private Integer count;

    @ApiModelProperty("规格数组")
    private List<UserProductAttrDetailVO> attrs;



}
