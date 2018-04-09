public class Bike extends Vehicle {
    String modelType;

    public void setDetails(){
        //Access the Vehicle class member field
        vehicleType = "Bike";
        modelType = "Sports";
        System.out.println("You have a vehicle of type " + vehicleType + " and model " + modelType);
    }

    public static void main(String[] args) {
        //ClassName objectName = new ClassName();
        Bike bike = new Bike();
        bike.setDetails();
    }

}
