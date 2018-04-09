public class Arrays101 {
    public static void main(String[] args) {
        //Syntax double[] arrayName = new double[size]
        //e.g int[] num = new int[10];
        // String[] names = {'name 1', 'name 2'};

        //Declare and instatiate
        int[] numbers = new int[5];
        //Initialize
        numbers[0] = 45;
        numbers[1] = 890;
        numbers[2] = 87;
        numbers[3] = 12;
        numbers[4] = 675;

        //Acces elements
        System.out.println("The element at index 1 is :" + numbers[1]);
        System.out.println("The element at the last position in my array :" + numbers[numbers.length - 1]);

        //Print elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number is : " + numbers[i]);
        }
        for (int elem : numbers) {
            System.out.print(elem + " ");
        }

        double[] minNumber = {34.09, -45.98, 2.890, 09.54, 654.90, 9.2, 5.4};
        double min = minNumber[0];
        for (double val : minNumber) {
            if (min > val) {
                min = val;
            }
        }
        System.out.println("The minumum number in my array is : " + min);


        //Multi-dimensional array
        // int[][] = new int[3][3];
        // String[][] = {{},{}};
        int[][] square = new int[3][3];
        square[0][0] = 1;
        square[0][1] = 2;
        square[0][2] = 3;
        square[1][0] = 4;
        square[1][1] = 5;
        square[1][2] = 6;
        square[2][0] = 7;
        square[2][1] = 8;
        square[2][2] = 9;

        //Print a 2d array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

        String[][] names = {
                {"Mr.", "Mrs.","Ms."},
                {"Pascal", "Gabby"}
        };
        //Mr. Pascal
        //Ms. Gabby
        System.out.println(names[0][2] + " " + names[1][1]);

        //Add This two matrices
        int[][] bc = {{1,3,4}, {3,4,5}};
        int[][] cb = {{1,3,4}, {3,4,5}};
        /*
            2 6 8
            6 8 10
         */
        int[][] c = new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
//                c[i][j] = bc[i][j]+ cb[i][j];
                System.out.print(bc[i][j] + cb[i][j] + " ");
            }
            System.out.println();
        }




    }



}
