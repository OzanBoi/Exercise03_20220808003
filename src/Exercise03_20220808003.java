public class Exercise03_20220808003 {
    /*
     * Change the X's in the both file name and class' name to your own
     * student number and submit your file to the assignment given through
     * Teams.
     *
     * if you do NOT submit your assignment in time, you will receive 0
     * if your file has compiled time errors, and do not compile you will receive 10
     * if your file does compile but a runtime error occurs, you will receive 20
     * You MUST NOT change the method headers and comply with their return types
     *
     * Main method is just there for you to test your program, you will not be evaluated by your main method
     * You can write any method you like, and use them in suitable places, but you will only be graded
     * for your work for the questions
     */
    public static void main(String[] args) {
        /* Question 1
        int[][] array2D = generateArray2D(4, 4, 0, 10);
        display2D(array2D);
        int diagonalSum = sumDiagonal(array2D);
        System.out.println("Sum of the diagonal for the given 2D array is: " + diagonalSum);
        */

        /*
        int[][] employees = generateArray2D(8, 7, 4, 9);
        display2D(employees);
        int[] workingHours = employeeWorkingHours(employees);
        display2D(employees);
        display(workingHours);
        */


        int[][] matrixA = generateArray2D(3, 2, 1, 10);
        int[][] matrixB = generateArray2D(2, 3, 1, 10);
        display2D(matrixA);
        display2D(matrixB);

        int[][] productMatrix = dotProduct(matrixA, matrixB);
        display2D(productMatrix);


        /* Question 4
        double[][] points = generateArray2D(12, 5, -0.3, 0.3);
        display2D(points);
        int[] closestPoints = getClosestPoints(points, 0);
        System.out.println("Indexes of points with closest distance");
        display(closestPoints);
        */

        /* Question 5
        char[][] charArray2D = headsNtails(7);
        display2D(charArray2D);
        */

    }

    // Question 1: Sum the major diagonal in a matrix
    public static int sumDiagonal(int[][] array2D) {
        array2D = new int[4][4];
        int sum = 0;
        for(int i =1 ; i< array2D.length ; i++){
            array2D[i][i] = random(1,10);
           sum += array2D[i][i];
        }
        return sum;

    }

    // Question 2: Compute the weekly hours for each employee
    public static int[] employeeWorkingHours(int[][] employees) {
        int[] hours = new int[8];
        int sum = 0;
        for(int i =1 ; i< employees.length ; i++) {
            try {
                employees[i][i] = random(4, 9);
                sum += employees[i][i];
                hours[i] = sum;
            }catch (Exception ex){

            }
        }

        /*
         * Suppose the weekly hours for all employees are stored in a
         * two-dimensional array. Each row records an employee's seven
         * day work hours with seven columns. Write a method that sorts the
         * employee's according to their sum of working hours for an enteire week
         * in decreasing order. Finally returns the sum of working hours for each
         * employee (sort both returned array and given employees array)
         *
         * Args:
         *      employees (int[8][7]) : the array of employees. Each row contains
         *      the employee's seven day work hours.
         *
         * Returns:
         *      int[8] : the array of sum working hours for each employee in decreasing order.
         */

        // Your code goes here...
return hours;
    }

    // Question 3: multiply two matrices
    public static int[][] dotProduct(int[][] matrixA, int[][] matrixB) {
        /*
         * Write a method to multiply two matrices.
         *
         * Args:
         *      matrixA (int[m][n]) : the two-dimensional array of integers
         *      matrixB (int[n][k]) : the two-dimensional array of integers
         *
         * Returns:
         *      int[m][k] : the two-dimensional array of result dot product of
         *      matrixA and matrixB
         */

        // Your code goes here...


        int[][] multiMatrix=new int[matrixA.length][matrixB[0].length];
        for(int i=0; i<multiMatrix.length;i++){
            for(int k=0; k<matrixA.length; k++){
                for(int j=0; j<matrixB.length; j++){
                    multiMatrix[i][k] += matrixA[i][j]*matrixB[j][k];
                }
            }
        }

        return multiMatrix;

    }

    // Question 4: All closest pairs of points
    public static int[] getClosestPoints(double[][] points, int pointIndex) {
        int[] close = new int[2];
        /*
         * Write a method that returns the array indices of the closest points to the given
         * point index. if m number of points share the same minimum distance to
         * given point index, then your array will have all of those points
         *
         * Args:
         *      points (double[n][d]) : array of n points in d dimensional space
         *      pointIndex (int) : index of a point from points array that we will search for closest m points
         *
         * Returns:
         *      (int[m]) : array of point indices that share the same minimum distance to given point
         */

        // Your code goes here...
 return close;
    }

    // Calculates the euclidean distance between two points in d dimensional space
    public static double distance(double[] pointA, double[] pointB) {
        double twopoints = 0.00;
        pointA = new double[2];
        pointB = new double[2];
        double x = pointB[0]-pointA[0];
        double y = pointB[1]-pointA[1];
        twopoints = (Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
        final double result = Math.round(twopoints * 10.0) / 10.0;
        return result;
    }

    // Question 5: Nine heads and tails
    public static char[][] headsNtails(int number) {
        char[][] heails = new char[3][3];
        /*
         * Nine coins are placed in a 3-by-3 matrix with some face up and
         * some face down. You can represent the state of the coins using a
         * 3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
         *      0 0 0       1 0 1       1 0 0
         *   A: 0 1 0    B: 0 0 1   C:  1 1 1
         *      0 0 0       1 0 0       1 1 0
         *
         *  Each state can also be represented using a binary number: For example,
         *  the preceding A, B and C matrices correspond to the numbers
         *      A: 0 0 0 0 1 0 0 0 0
         *      B: 1 0 1 0 0 1 1 0 0
         *      C: 1 0 0 1 1 1 1 1 0
         *
         *  There are a total of 512 posibilities, so you can use
         *  decimal numbers 0, 1, 2, ..., 511 to represent all states of the matrix.
         *      for A: number == 10
         *      for B: number == 332
         *      for C: number == 318
         *
         * Write a program that accepts a number and returns the corresponding matrix with
         * the characters H and T
         *
         *      if the number == 7;
         *      then the binary of 7 == 0 0 0 0 0 0 1 1 1;
         *      so in matrix format it will be;
         *              0 0 0
         *              0 0 0
         *              1 1 1
         *
         *      finally we can represent it with coins like;
         *              H H H
         *              H H H
         *              T T T
         *
         * Args:
         *      number (int): the number to represent with the characters H and T in matrix format
         *
         * Returns:
         *      (char[3][3]): the corresponding matrix representation of given number with coins
         */

        // Your code goes here...
return heails;
    }

    // Converts the given decimal number to a binary represented with an array
    public static int[] decimalToBinary(int number) {
        int[] bin = new int[9];
        for(int i = 0 ; i < bin.length ; i++) {
            while (number != 0) {
                if (number / 256 >= 1) {
                    bin[8] = 1;
                    number = number % 256;
                } else if (number / 128 >= 1) {
                    bin[7] = 1;
                    number = number % 128;
                } else if (number / 64 >= 1) {
                    bin[6] = 1;
                    number = number % 64;
                } else if (number / 32 >= 1) {
                    bin[5] = 1;
                    number = number % 32;
                } else if (number / 16 >= 1) {
                    bin[4] = 1;
                    number = number % 16;
                } else if (number / 8 >= 1) {
                    bin[3] = 1;
                    number = number % 8;
                } else if (number / 4 >= 1) {
                    bin[2] = 1;
                    number = number % 4;
                } else if (number / 2 >= 1) {
                    bin[1] = 1;
                    number = number % 2;
                } else if (number / 1 >= 1) {
                    bin[0] = 1;
                    number = number % 1;
                } else break;
            }
        }
        return bin;
    }

    /////////////// HELPER METHODS ////////////////////////////

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void display(double[] array) {
        for (double i : array) {
            System.out.printf("%.1f\t", i);
        }
        System.out.println();
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }

    public static void display(char[] array) {
        for (int i : array) {
            System.out.printf("%c\t", i);
        }
        System.out.println();
    }

    public static void display2D(int[][] array2D) {
        for (int[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static void display2D(double[][] array2D) {
        for (double[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static void display2D(char[][] array2D) {
        for (char[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static int[][] generateArray2D(int m, int n, int start, int end) {
        int[][] array2D = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = random(start, end);
            }
        }

        return array2D;
    }

    public static double[][] generateArray2D(int m, int n, double start, double end) {
        double[][] array2D = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = round(random(start, end), 1);
            }
        }

        return array2D;
    }

    public static int random(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }

    public static double random(double start, double end) {
        return start + Math.random() * (end - start + 1);
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}public static int[][] dotProduct(int[][] matrixA, int[][] matrixB) {
    /*
     * Write a method to multiply two matrices.
     *
     * Args:
     *      matrixA (int[m][n]) : the two-dimensional array of integers
     *      matrixB (int[n][k]) : the two-dimensional array of integers
     *
     * Returns:
     *      int[m][k] : the two-dimensional array of result dot product of
     *      matrixA and matrixB
     */

    // Your code goes here...


    int[][] multiMatrix=new int[matrixA.length][matrixB[0].length];
    for(int i=0; i<multiMatrix.length;i++){
        for(int k<matrixA.length; k++){
            for(int j=0; j<matrixB.length; j++){
                multiMatrix[i][k] += matrixA[i][j]*matrixB[j][k];
            }
        }
    }

    return multiMatrix;

}