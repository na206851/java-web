package lesson00;

public class Cylinder extends ParamOfGeometricShapes {
    double baseRadius;
    double heightCylinder;

    public Cylinder(double baseRadius, double heightCylinder) {
        this.baseRadius = baseRadius;
        this.heightCylinder = heightCylinder;
    }

    public Cylinder() {
    }

    public void setHeightCylinder(double heightCylinder) {
        this.heightCylinder = heightCylinder;
    }

    public double getHeightCylinder() {
        return heightCylinder;
    }

    public double getBaseRadius() {
        return baseRadius;
    }

    public void setBaseRadius(double baseRadius) {
        this.baseRadius = baseRadius;
    }


    @Override
    public double baseArea() {  //метод для вычисления площади основания цилиндра
        return Math.PI * Math.pow(getBaseRadius(), 2);
    }

    @Override
    public double crossSectionalAreaFlatness(int heightFlatness) { //метод для вычисления площади поперечного сечения
        return baseArea();
    }

    @Override
    public double surfaceSquare() {     //метод для вычисления полной площади поверхности цилиндра
        double baseSquare = baseArea();
        double squareLateralSurface = 2 * Math.PI * getHeightCylinder();
        return baseSquare + squareLateralSurface;
//        return 2 *Math.PI
    }

    @Override
    public double volumeFigure() {      //method for search volume cylinder
        return Math.PI * getBaseRadius() * getHeightCylinder();
    }
}
