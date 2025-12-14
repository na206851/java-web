package testLesson00.testProductClass.ValidateTestProduct;

import lesson00.ProductMain.ProductMainClass;
import testLesson00.testProductClass.ValidateInterface.validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class validateDateDelivery implements validate {

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

    @Override
    public String getError() {
        return "ошибка в методе DateDelivery";
    }
}
