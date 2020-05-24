import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrDetailBO;
import io.github.mizhicn.mallshop.pruduct.convert.service.ProductAttrConvertService;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductAttrDO;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {

        List<ProductAttrDO> plist = new ArrayList();
        plist.add(new ProductAttrDO(1,"a", 1));
        List<ProductAttrDetailBO> convert = ProductAttrConvertService.INSTANCE.convert(plist);
        System.out.println(convert);

    }

}
