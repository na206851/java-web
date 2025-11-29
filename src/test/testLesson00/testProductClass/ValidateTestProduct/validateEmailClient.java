package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.util.regex.Pattern;

public class validateEmailClient implements validate {
    Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$");

    public static void main(String[] args) {
        validateEmailClient test = new validateEmailClient();
        ProductMainClass client = new ProductMainClass("test", 10, 15, 2, 1,
                "Vasya", "1@gmail.com", "+79834321221");
        System.out.println(test.Check(client));
    }

    @Override
    public boolean Check(ProductMainClass product) {
        if (product.emailClient.trim().isEmpty()) {
            return false;
        }
        return pattern.matcher(product.emailClient).matches();
    }
}
