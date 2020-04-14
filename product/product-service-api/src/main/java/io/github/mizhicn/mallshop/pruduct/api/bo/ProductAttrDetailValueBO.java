package io.github.mizhicn.mallshop.pruduct.api.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@Accessors(chain = true)
public class ProductAttrDetailValueBO implements Serializable {

    private Integer id;

    private String name;

    private Integer status;

    private Date createTime;

}
