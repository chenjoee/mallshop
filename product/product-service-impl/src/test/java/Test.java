import io.github.mizhicn.mallshop.pruduct.App;
import io.github.mizhicn.mallshop.pruduct.api.bo.ProductAttrDetailBO;
import io.github.mizhicn.mallshop.pruduct.convert.ProductAttrConvertService;
import io.github.mizhicn.mallshop.pruduct.dataobject.ProductAttrDO;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
