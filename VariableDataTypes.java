public class VariableDataTypes {
    //VAriable is a name of a reserved area allocated in memory
    // - Local : a variable declared inside a method
    // - Instance : a variable declared inside the class but outside the  method
    // - Static : a variable declared as static and cannot be local
    int data = 70;  //Instance variable
    static String name = "Ephy"; //Static variable

    void method(){
        double age = 30.5; //Local variable
    }

    //DATA Types
    // - Two types of data types
    // - Primitive data type
        // - boolean, int, char, byte, short, int, long, float, double
    //Non-primitive/Complex data types
        // - String, Array
    //SYntax for defining a variable
    // type variableName = value;

    public static void main(String[] args) {

        int number = 45;
        number = 5678;
        System.out.println("The value of number is " + number);
        String name = "Ephy";
        System.out.println("My Name is :" +name);
        double salary = 4000.98;
        double salary2 = 456.098;
        double salry3 = 78.09, salary4 =7865.08, salary6 = 543.98;
    }


}
