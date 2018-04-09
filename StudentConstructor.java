public class StudentConstructor {
    //Constructors are special methods that are ccalled
    //when an object is instantiated
    //Contructor initializes the newly created objected
    int id;
    String name;
    //Parameterazed constructor
    StudentConstructor(int i, String n){
        id = i;
        name = n;
    }

    //Non-parameterized constructor
    StudentConstructor(){
        System.out.println("Yeay, Student object created sucessfuly!!");
    }

    //Method
    void display(){
        System.out.println("Your id is = "+id + " : ans your name is= " + name);
    }

    public static void main(String[] args) {
        //Calling parameterized constructor
        StudentConstructor s1 = new StudentConstructor(2345, "Nicho");
        StudentConstructor s2 = new StudentConstructor(348, "Bundotich");
        //Callin non-parameterized constructor
        StudentConstructor s4 = new StudentConstructor();
        System.out.println(s4);
        s1.display();
        s2.display();
        s4.display();
    }
}
