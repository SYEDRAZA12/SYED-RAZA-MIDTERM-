package math;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        Scanner sc = new Scanner(System.in);


        System.out.println("How Many Rows You Want In Your Pyramid?");

        int noOfRows = sc.nextInt();

        int rowCount = 1;

        System.out.println("Here Is Your Pyramid");

        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }



            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("* ");
            }

            System.out.println();


            rowCount++;
        }
    }
}