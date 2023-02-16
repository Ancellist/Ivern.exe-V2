package src;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] sus) {
        int[][] Arr = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элемент массива");
        for (int j = 0; j < Arr.length; j++) {
            for (int i = 0; i < Arr[j].length; i++) {
                Arr[j][i] = sc.nextInt();
            }
        }

        int temp;
        int n = Arr.length;
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i < n / 2; i++) {
                temp = Arr[j][n - i - 1];
                Arr[j][n - i - 1] = Arr[j][i];
                Arr[j][i] = temp;
            }
        }

        for (int j = 0; j < Arr.length; j++) {
            for (int i = 0; i < Arr[j].length; i++) {
                System.out.print(Arr[j][i]);
            }
            System.out.println();
        }

        for (int j = 0; j <= 2; j++) {
            for (int i=0; i<=2; i++){
                System.out.print(Arr[j][i]);
                j++;
            }
            }

        }
    }
