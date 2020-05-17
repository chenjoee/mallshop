package io.github.mizhicn.mallshop.pruduct.api.bo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Data
@Accessors(chain = true)
public class ProductCategoryBO implements Serializable {

    private Integer id;

    private Integer pid;

    private String name;

    private String description;

    private String picUrl;

    private Integer sort;

    private Integer status;

    private Date date;
}
