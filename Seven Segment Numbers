// Prints any integer in seven segment numbers form

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] number = new String[10][5];
        
        number[0][0] = " ___ ";
        number[0][1] = "|   |";
        number[0][2] = "|   |";
        number[0][3] = "|   |";
        number[0][4] = "|___|";
        
        number[1][0] = "     ";
        number[1][1] = "    |";
        number[1][2] = "    |";
        number[1][3] = "    |";
        number[1][4] = "    |";
        
        number[2][0] = " ___ ";
        number[2][1] = "    |";
        number[2][2] = " ___|";
        number[2][3] = "|    ";
        number[2][4] = "|___ ";
        
        number[3][0] = " ___ ";
        number[3][1] = "    |";
        number[3][2] = " ___|";
        number[3][3] = "    |";
        number[3][4] = " ___|";
        
        number[4][0] = "     ";
        number[4][1] = "|   |";
        number[4][2] = "|___|";
        number[4][3] = "    |";
        number[4][4] = "    |";
        
        number[5][0] = " ___ ";
        number[5][1] = "|    ";
        number[5][2] = "|___ ";
        number[5][3] = "    |";
        number[5][4] = " ___|";
        
        number[6][0] = " ___ ";
        number[6][1] = "|    ";
        number[6][2] = "|___ ";
        number[6][3] = "|   |";
        number[6][4] = "|___|";
        
        number[7][0] = " ___ ";
        number[7][1] = "    |";
        number[7][2] = "    |";
        number[7][3] = "    |";
        number[7][4] = "    |";
        
        number[8][0] = " ___ ";
        number[8][1] = "|   |";
        number[8][2] = "|___|";
        number[8][3] = "|   |";
        number[8][4] = "|___|";
        
        number[9][0] = " ___ ";
        number[9][1] = "|   |";
        number[9][2] = "|___|";
        number[9][3] = "    |";
        number[9][4] = " ___|";
        
        System.out.print("Choose an integer: ");
        int num = Math.abs(input.nextInt());
        String s = "" + num;
        int[] digits = new int[s.length()];
        for (int i = 0; i < digits.length; i++)
            digits[i] = Integer.parseInt("" + s.charAt(i));
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < digits.length; j++) {
                System.out.print(number[digits[j]][i] + " ");
            }
            System.out.println();
        }
    }
}
