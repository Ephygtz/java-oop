public class DataTypes {
    public static void main(String[] args) {
     /*
        type varName  = aValue;
      */
     String name = new String("ephraim");
     String myGirlfriendsName = " ";
     System.out.println("My name is " + name + " and my girlfriends name is " + myGirlfriendsName + " !!!");

     boolean underAge = false;
     if(underAge){
         System.out.println("Not allowed to partake");
     } else {
         System.out.println("What drink will you have");
     }

     boolean b;
     boolean toBe = false;
     b = toBe || !toBe;
     if(b){
         System.out.println("To be!!");
     } else {
         System.out.println("Not to be!!");
     }
    }
}
