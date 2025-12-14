package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.util.regex.Pattern;

public class validatePhoneNumberClient implements validate {
    public static final Pattern patternNumberClient = Pattern.compile("^\\+79\\d{9}$");

    @Override
    public boolean Check(ProductMainClass product) {
        if (product.phoneNumberClient == null || product.phoneNumberClient.trim().length() != 12) {
            return false;
        }
        return patternNumberClient.matcher(product.phoneNumberClient).matches();
    }

    @Override
    public String getError() {
        return "ошибка в методе PhoneNumberClient";
    }
}