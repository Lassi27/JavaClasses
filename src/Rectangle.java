public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.length * this.width;;
        return area;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt((length * length) + (width * width));
        return diagonal;

    }

    public String isSquare(){
        if(length == width){
            return "this is a square";
        }
        return "this is not a square";
    }

    public String printrecInfo(){
        return
                "this Rectangle has" +
                        this.getLength()+ "for its length,  " +
                        this.getWidth()+ "for its width,  " +
                        this.getArea()+ "for its area, "+
                        this.getDiagonal() + "for its diagonal, " +
                        this.isSquare() ;
    }
}