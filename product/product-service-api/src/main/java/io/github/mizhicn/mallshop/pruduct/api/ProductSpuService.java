package io.github.mizhicn.mallshop.pruduct.api;

import io.github.mizhicn.mallshop.pruduct.api.bo.*;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductSpuAddDTO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductSpuPageDTO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductSpuSearchListDTO;
import io.github.mizhicn.mallshop.pruduct.api.dto.ProductSpuUpdateDTO;

import java.util.Collection;
import java.util.List;

public interface ProductSpuService {

    ProductSpuDetailBO getProductSpuDetail(Integer id);

    /**
     * 增量获得商品列表，按照 lastId 递增获得
     *
     * @param lastId 最后查询的编号
     * @param limit 大小
     * @return 商品列表
     */
    List<ProductSpuDetailBO> getProductSpuDetailListForSync(Integer lastId, Integer limit);

    ProductSpuPageBO getProductSpuPage(ProductSpuPageDTO productSpuPageDTO);

    List<ProductSpuBO> getProductSpuSearchList(ProductSpuSearchListDTO productSpuSearchListDTO);

    List<ProductSpuBO> getProductSpuList(Collection<Integer> ids);

    ProductSkuBO getProductSku(Integer id);

    List<ProductSkuDetailBO> getProductSkuDetailList(Collection<Integer> ids);

    ProductSpuDetailBO addProductSpu(Integer adminId, ProductSpuAddDTO productSpuAddDTO);

    void updateProductSpu(Integer adminId, ProductSpuUpdateDTO productSpuUpdateDTO);

    Boolean updateProductSpuSort(Integer adminId, Integer spuId, Integer sort);

}
