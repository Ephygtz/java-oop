public class Methods extends Car{
    //Methods is a group of java statements that
    //perform some operations on some data and
    // and may or may not return a result
    /* Syntax
         accessModifier retunType nameOfMethod(Parameter list){
            //Method body
         }
         public static int methodName(int a, int b){
         //body
         }
         publi static - modifier
         int - returnType

     */
    //overloading
    void result(int a, int b){
        System.out.println("Sum is : " + a + b);
    }
    void result(double a, double b, double c){
        System.out.println("Division is: " + a /b /c );
    }
    //Method without a returntype
    public static void main(String[] args) {
        //Calling my method
        Methods obj = new Methods();
        obj.result(23,45);
        obj.result(34.09,45.09,23.09);
        noReturnType("My name");
        String concatenetad = concat("Hi there", "How's your day going");
        System.out.println(concatenetad);
        System.out.println("The result of deleting is" + divide(23.87,890));
    }

    public static void noReturnType(String text){
        System.out.println("Hi there " + text);
    }

    public static String concat(String one, String two){
        return one + "  " + two;
    }

    public static double divide(double num1, double num2){
        double result = num1 / num2;
        return result;
    }






}
