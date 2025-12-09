package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.util.regex.Pattern;

public class validateIDClient implements validate {
    Pattern pattern = Pattern.compile("^[A-Z._%+-]{2,12}$");

    @Override
    public boolean Check(ProductMainClass product) {
        if (product.IDClient.trim().isEmpty()) {
            System.out.println(" crash in first case");
            return false;
        }

        if (product.IDClient.trim().length() > 12) {
            Exception ex = new Exception("name is very long");
        }

        return pattern.matcher(product.IDClient).matches();
    }
}
