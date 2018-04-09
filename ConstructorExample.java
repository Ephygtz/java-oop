public class ConstructorExample {
    //Constructors are special methods that are
    //called when an object is instantieted
    //Constructor initializes the newly created object
    int id;
    String name;



    //default-non-parameterized constructor
    ConstructorExample(){
        System.out.println("Yeay, Object succesfully created!!");
    }
    //Parameterized constructor
    ConstructorExample(int i, String n){
        id = i;
        name =n;
    }

    //Method
    void display(){
        System.out.println("Your Student ID is = " + id + " name is " +name);
    }


    public static void main(String[] args) {
        //Calling non-parameterized constructor
       ConstructorExample nonParm = new ConstructorExample() ;
        System.out.println(nonParm);
        ConstructorExample obj2 = new ConstructorExample();
        System.out.println(obj2);

        //Calling the parameterized constructor
        ConstructorExample student1 = new ConstructorExample(1234, "Abdulahi");
        ConstructorExample student2 = new ConstructorExample(34, "Damascene");

        student1.display();
        student2.display();


    }
}
