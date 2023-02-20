package test;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //2D Array :- Array inside an array
        String Arr2[][] = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Arr2[i][j] = scanner.nextLine();

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Arr2[i][0]);
            }

        }
    }
}

