package lesson00;

public class Pyramid extends ParamOfGeometricShapes {
    int countCorner;
    int lengthReb;
    int heightPyramid;

    public void setCountCorner(int countCorner) {
        this.countCorner = countCorner;
    }

    public void setLengthReb(int lengthReb) {
        this.lengthReb = lengthReb;
    }

    public void setHeightPyramid(int heightPyramid) {
        this.heightPyramid = heightPyramid;
    }

    public int getHeightPyramid() {
        return heightPyramid;
    }

    public int getLengthReb() {
        return lengthReb;
    }

    public int getCountCorner() {
        return countCorner;
    }

    @Override
    public double baseArea() {
        return countCorner * Math.pow(lengthReb, 2) * (4 * Math.tan(Math.PI / countCorner)) / 2;
    }

    @Override
    public double crossSectionalAreaFlatness(int heightFlatness) {
        //        double perimeterPyramid = bottomBase() * getCountCorner();//потенциально ненужное вычисление нужно подумать
        double height = getHeightPyramid() - heightFlatness;
        double sectionalSquare = Math.pow(height / getHeightPyramid(), 2) * baseArea();
        return sectionalSquare;
    }

    public double bottomBase() {        //основание треугольника в пирамиде     //потенциально ненужный метод
        return Math.pow(getLengthReb(), 2) - Math.pow(getHeightPyramid(), 2);
    }
    //    Площадь произвольного правильного многоугольника можно вычислить по формуле:
    //    S = (n * a^2) / (4 * tan(π/n)), где 'n' - количество сторон, а 'a' - длина стороны.
    //    Можно также использовать формулу S = (1/2) * P * r, где 'P' - периметр, а 'r' - радиус вписанной окружности.

    @Override
    public double surfaceSquare() {
        return baseArea();
    }

    public double perimeterPyramid() {
        return getCountCorner() * Math.pow(getLengthReb(), 2) - Math.pow(getHeightPyramid(), 2);
    }

    public double lateralSquare() { //разобраться понять что за метод и на
        // будущее писать комментарии к каждому дополнительному методы
        double a = perimeterPyramid() / getCountCorner() / 2;//нижний отрезок стороны основания треугольника
        double b = getLengthReb();
        return 1;
    }


    @Override
    public double volumeFigure() {      //обьем фигуры
        double constPyramid = (double) 1 / 3;
        return constPyramid * baseArea() * getHeightPyramid();
    }
}
