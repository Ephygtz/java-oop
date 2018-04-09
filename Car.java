public class Car {
    //data members/fields
    String brand = null;
    String model = null;
    String color = null;
    //method
    public void setBrand(String newBrand){
        this.brand = newBrand;
        System.out.println("Your Brand is : " + brand);
    }
    public void setColor(String newColor){
        this.color = newColor;
    }

    public static void main(String[] args) {
        //The syntax of creating an object of a certain class
        //ClassName objectName = new ClassName();
        Car saloon = new Car();
        Car bmw = new Car();
        saloon.setBrand("Nissan");
        saloon.setColor("Grey");
        bmw.setBrand("BMW");
        bmw.setColor("Yellow");

        System.out.println(saloon.brand);
        System.out.println(saloon.color);
        System.out.println(bmw.brand);
        System.out.println(bmw.color);


    }

}
