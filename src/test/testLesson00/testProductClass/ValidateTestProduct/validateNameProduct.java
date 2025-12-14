package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

public class validateNameProduct implements validate {
    
    @Override
    public boolean Check(ProductMainClass product) {
        return product.getNameProduct() != null && !product.getNameProduct().trim().isEmpty();
    }

    @Override
    public String getError() {
        return "error in method NameProduct";
    }
}
