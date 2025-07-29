package lesson00;

public class Cone extends ParamOfGeometricShapes {
    double radiusBased;
    double heightTaper;

    public Cone() {
    }

    public Cone(double radiusBased) {
        this.radiusBased = radiusBased;
    }

    public Cone(double radiusBased, double heightTaper) {
        this.radiusBased = radiusBased;
        this.heightTaper = heightTaper;
    }

    public void setRadiusBased(double radiusBased) {
        this.radiusBased = radiusBased;
    }

    public void setHeightTaper(double heightTaper) {
        this.heightTaper = heightTaper;
    }

    public double getRadiusBased() {
        return this.radiusBased;
    }

    public double getHeightTaper() {
        return this.heightTaper;
    }

    @Override
    public double baseArea() {
        return Math.floor(Math.PI * Math.pow(getRadiusBased(), 2) * 100) / 100;
    }

    @Override
    public double crossSectionalAreaFlatness(int heightFlatness) {
        return 0;
    }
//
//    @Override
//    public double crossSectionalAreaFlatness() {    //неправильная формула , нжуно учитывать то на какой высоте сечение
//        return getRadiusBased() * getHeightTaper();
//    }

    @Override
    public double surfaceSquare() {
        double coneGeneratrix = coneGeneratrix();
        double squareBase = baseArea();
        double squareLateral = Math.PI * getRadiusBased() * coneGeneratrix;
        return squareLateral + squareBase;
    }

    private double coneGeneratrix() {
        return Math.sqrt((Math.pow(getRadiusBased(), 2) + Math.pow(getHeightTaper(), 2)));
    }

    @Override
    public double volumeFigure() {
        return Math.pow(getRadiusBased(), 2) * getHeightTaper() * Math.PI * ((double) 1 / 3);
    }

    public static void main(String[] args) {
        Cone test = new Cone(2, 3);

    }
}
