package homework_week_8;

public class Programme_14WhileLoopDiamondPattern {
    public static void main(String[] args) {
        int n = 14; // Number of rows for the diamond(change this to adjust the size)
        int i = 1;
        int space = n / 2;

        //Upper half of the diamond
        while(i <= n){
            int j = 1;
            // Print spaces before stars
            while(j <= space){
                System.out.print(" ");
                j++;
            }
            j = 1;
            //Print stars
            while(j <=2 * i -1){
                System.out.print("*");
                j++;
            }

            // Move to the next line
            System.out.println();
            space--;
            i += 2;
            }

            // Lower half of the diamond
            space = 1;
            i = n - 2;
            while(i >= 1){
                int j =1;
                //Print spaces before stars
                while(j <= space){
                    System.out.print(" ");
                    j++;
                }
                j = 1;
                // Print stars
                while( j <= i){
                    System.out.print("*");
                    j++;
                }

                //Move to the next line
                System.out.println();
                space++;
                i -= 2;
        }
    }
}
