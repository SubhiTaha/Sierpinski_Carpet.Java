public class Practical20 {
    //    2D array of strings to store the carpet
    static String[][] carpet;
    //size stores the dimension size of the carpet
    static int size;

    public Practical20(int s) {
        //this function creates the 2d array of size and initialize it with stars
        this.size = s;
        carpet = new String[size][size];
        int i = 0;
        int j = 0;
        while (i < s) {
            j = 0;
            while (j < s) {
                this.carpet[i][j] = " * ";
                j++;
            }
            i++;
        }

    }

    public static void makeEmpty(int current_size, int x, int y) {
//        function is use to empty the middle block to make carpet
        int i = y + current_size / 3;
        int j = 0;
        while (i <= y + 2 * (current_size / 3) - 1) {
            j = x + current_size / 3;
            while (j <= x + 2 * (current_size / 3) - 1) {
                carpet[i][j] = "   ";
                j++;
            }
            i++;
        }
    }

    public static void create(String[][] carpet, int x, int y, int current_size) {
        //emptry the center block
        makeEmpty(current_size, x, y);

//        if size is less than one return
        if (current_size <= 1) {
            return;
        }
        int i = 0;
        int j = 0;
        //loops to go through all the 9 blocks
        while (i < current_size) {
            j = 0;
            while (j < current_size) {
//                recursive function to move to the 3n-1x3n-1 block
                create(carpet, i + y, j + x, current_size / 3);
                j += (current_size / 3);
            }
            i += (current_size / 3);
        }

    }

    public static void print(int size) {
//        loops through all the array and prints it
        int i = 0;
        int j = 0;
        String output = "";
        while (i < size) {
            j = 0;
            output = "";
            while (j < size) {
                output += carpet[i][j];
                j++;
            }
            System.out.println(output);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Carpet is created and initialized with stars");
        Practical20 board = new Practical20(27);
        print(27);


        System.out.println("Converting it into sierpinski carpet");
        create(carpet, 0, 0, 27);
        print(27);
    }

}
