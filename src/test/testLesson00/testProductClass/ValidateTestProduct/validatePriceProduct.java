package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

public class validatePriceProduct implements validate {
    @Override
    public boolean Check(ProductMainClass product) {
        return product.productPrice > 0;
    }
}
