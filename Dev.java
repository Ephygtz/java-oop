public class Dev extends Employees {
    int bonus = 200000;

    public static void main(String[] args) {
        Dev dev = new Dev();
        System.out.print("Coder salary is " + dev.salary);
        System.out.print(" Coder bonus is " + dev.bonus);

        int gross = (int)dev.salary + dev.bonus;
        System.out.print(" and the gross salary is  " + gross);

    }
}
