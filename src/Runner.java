public class Runner {
    public static void main(String[]args){
        Car myCar = new Car( 2016, "Audi" , "Mustang");
        System.out.println(myCar.toString());
        myCar.drive(500);
        System.out.println(myCar.toString());

        Rectangle myRectangle= new Rectangle(30,27);
        System.out.println(myRectangle.printrecInfo() );
        Rectangle mySquare= new Rectangle(30,30);
        System.out.println(mySquare.printrecInfo() );


    }

}
