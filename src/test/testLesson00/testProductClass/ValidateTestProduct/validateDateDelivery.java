package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class validateDateDelivery implements validate {
    public static void main(String[] args) {
        ProductMainClass test = new ProductMainClass("cok", 10, 20, 5, 1, "vasya", "nikita@gmail.com", "adfas", "10.12.2025");
        validateDateDelivery testDateDelivery = new validateDateDelivery();
        System.out.println(testDateDelivery.Check(test));
    }

    @Override
    public boolean Check(ProductMainClass product) throws RuntimeException {
        if (product.dateDelivery == null || product.dateDelivery.trim().isEmpty()) {
            return false;
        }
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateDelivery = LocalDate.parse(product.dateDelivery, pattern);
        boolean res = LocalDate.now().isBefore(dateDelivery);
        if (res == false) {
            return false;
        }
        return true;

    }
}
