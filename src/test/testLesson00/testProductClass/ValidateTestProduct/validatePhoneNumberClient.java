package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.util.regex.Pattern;

public class validatePhoneNumberClient implements validate {
    public static final Pattern patternNumberClient = Pattern.compile("^\\+79\\d{9}$");

    public static void main(String[] args) {

        ProductMainClass product = new ProductMainClass("asdf", 10, 15, 3, 1, "name", "na@gmail.com", "+79834321221");
        if (product.phoneNumberClient == null || product.phoneNumberClient.trim().length() != 12) {
            System.out.println(false + " false in first case");
        }
        System.out.println(patternNumberClient.matcher(product.phoneNumberClient).matches());


    }

    @Override
    public boolean Check(ProductMainClass product) {
        if (product.phoneNumberClient == null || product.phoneNumberClient.trim().length() != 12) {
            return false;
        }
        return patternNumberClient.matcher(product.phoneNumberClient).matches();
    }
}