package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

public class validateSaleDiscount implements validate {

    @Override
    public boolean Check(ProductMainClass product) {
        if (product.sizeDiscount < 0) {
            return false;
        }
        
    }
}
