package io.github.mizhicn.mallshop.pruduct.dataobject;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("product_category")
public class ProductCategoryDO {

    private Integer id;



}
