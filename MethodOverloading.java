public class MethodOverloading {
    //Method overloading is a feature that allows a class
    //to have two or more methods having the same name
    //if their argument lists are different
    /*The argument list could differ by
        i) Number of parameters
        ii) Data type of the parameters
        iii) Sequence of paremeter list

     */
    //Overloading based on number of param
    public void display(char d){
        System.out.println(d);
    }
    public void display(char d, String name){
        System.out.println("My name is " + name + " and i got : " + d + "marks");
    }
    //Overloading by difference in data types
    public void display(int age){
        System.out.println("You were born in the year " + (2018 - age));
    }

    //Overloading by sequence of data type passed
    public void display(int num, String city){
        System.out.println("First definition");
    }
    public void display(String city, int num ){
        System.out.println("second definition");
    }

    public static void main(String[] args) {
        //ClassName objectName = new ClassName();
        MethodOverloading overload = new MethodOverloading();
        overload.display('D');
        overload.display('e', "Codebeast");
        overload.display(27);
        overload.display(23,"tr");
        overload.display("ty",45);
    }


    //ToDo
    /*
        create a method and overload it such that,
        if i call the method with two type doubles,
        return the division of the two doubles,
        if i call the method with three ints, return
        the multiplication of the three numbers, and
        if i call the method with a string argument,
        return "Hello World from JAVA"
     */



}
