package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

public class validateNameProduct implements validate {
    
    @Override
    public boolean Check(ProductMainClass product) {
        return product != null && product.toString().trim().isEmpty();
    }
}
