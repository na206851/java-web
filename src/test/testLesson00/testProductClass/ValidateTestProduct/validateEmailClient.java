package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.util.regex.Pattern;

public class validateEmailClient implements validate {
    Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");

    @Override
    public boolean Check(ProductMainClass product) {
        if (product.emailClient.trim().isEmpty()) {
            return false;
        }
        return pattern.matcher(product.emailClient).matches();
    }

    @Override
    public String getError() {
        return "ошибка в методе EmailClient";
    }
}
