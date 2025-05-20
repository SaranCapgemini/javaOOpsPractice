public class Car {
    String color;
    String model;
    int year;

    public void displayInfo(){
        System.out.println("Car color: "+color);
        System.out.println("Car model: "+model);
        System.out.println("Car year: "+year);
    }

    
        public static void main(String s[]){
            Car myCar = new Car();
            myCar.color = "Blue";
            myCar.model = "BMW";
            myCar.year = 2014;
            myCar.displayInfo();
        }
}