package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.util.List;

import static java.util.Arrays.asList;

public class Validator {
    public static List<validate> exam;

    public static void main(String[] args) {
        ProductMainClass productMainClass = new ProductMainClass("ФЫФЫВА", 5, 20, 4,
                1, "VASA", "nikita@gmail.com", "+79834321221", "20.12.2025");

        exam = asList(new validateDateDelivery(),
                new validateEmailClient(),
                new validateIDClient(),
                new validateNameProduct(),
                new validatePhoneNumberClient(),
                new validatePriceProduct(),
                new validateRequiredQuantity(),
                new validateSaleDiscount()
        );

        System.out.println(validate(productMainClass));
    }

    public static boolean validate(ProductMainClass product) {
        for (validate check : exam) {
            if (check.Check(product) == false) {
                return false;
            }
        }
        return true;
    }
}
