package io.github.mizhicn.mallshop.pruduct.dataobject;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("product_category")
public class ProductCategoryDO {

    private Integer id;

    private Integer pid;

    private String name;

    private String description;

    private String picUrl;

    private Integer sort;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private Integer deleted;



}
