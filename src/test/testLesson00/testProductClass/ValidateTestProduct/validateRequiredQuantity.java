package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

public class validateRequiredQuantity implements validate {

    @Override
    public boolean Check(ProductMainClass product) {
        if (product.requiredQuantity <= 0) {
            return false;
        }
        return product.requiredQuantity <= product.quantityInStock;
    }

    @Override
    public String getError() {
        return "error in method RequiredQuantity";
    }
}
