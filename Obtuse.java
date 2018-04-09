public class Obtuse {
    int length, width;

    public void insert(int l, int w){
        this.length = l;
        this.width = w;
    }
    public void calculateArea(){
        System.out.println("The area is : " + length * width);
    }

    public static void main(String[] args) {
        Obtuse obj1 = new Obtuse();
        Obtuse obj2 = new Obtuse();
        Obtuse obj3 = new Obtuse();

        obj1.insert(23, 67);
        obj2.insert(785,64);
        obj3.insert(654,890);

        obj1.calculateArea();
        obj2.calculateArea();
        obj3.calculateArea();



    }




}
