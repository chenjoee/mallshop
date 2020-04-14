package io.github.mizhicn.mallshop.pruduct.api.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductAttrDetailBO implements Serializable {

    private Integer id;

    private String name;

    private Integer status;

    private Date createTime;

    private List<ProductAttrDetailValueBO> values;


}
