// connect four game on java CLI

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        String[][] board = new String[6][7];
        createBoard(board);
        print(board);
        
        while(true) {
            
            redsTurn(board);
            print(board);
            if (checkWin(board)) {
                System.out.println("The red player won");
                break;
            }
            if (checkDraw(board)) {
                System.out.println("Draw");
                break;
            }
            
            yellowsTurn(board);
            print(board);
            if (checkWin(board)) {
                System.out.println("The yellow player won");
                break;
            }
            if (checkDraw(board)) {
                System.out.println("Draw");
                break;
            }
        }
    }
    
    public static void createBoard(String[][] board) {
        
        for (int i = 0; i<board.length; i++)
            for (int j = 0; j<board[i].length; j++)
                board[i][j] = " |";
    }
    
    public static void print(String[][] board) {
        
        for (int i = 0; i<board.length; i++) {
            System.out.print("|");
            for (int j = 0; j<board[i].length; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
    }
    
    public static void redsTurn(String[][] board) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Drop a red disk at column (0-6): ");
        int disk = input.nextInt();
        int row = 5;
        
        while (true) {
            
            if (" |".equals(board[row][disk])) {
                board[row][disk] = "R|";
                break;
            }
            else {
                
                if (row == 0) {
                    System.out.print("Full column, choose another column: ");
                    disk = input.nextInt();
                    row = 5;
                }
                else
                    row--;
            }
        }
    }
    
    public static void yellowsTurn(String[][] board) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Drop a yellow disk at column (0-6): ");
        int disk = input.nextInt();
        int row = 5;
        
        while (true) {
            
            if (" |".equals(board[row][disk])) {
                board[row][disk] = "Y|";
                break;
            }
            else {
                
                if (row == 0) {
                    System.out.print("Full column, choose another column: ");
                    disk = input.nextInt();
                    row = 5;
                }
                else
                    row--;
            }
        }
    }
    
    public static boolean checkWin(String[][] board) {
        
        return checkColumns(board) || checkRows(board) ||
                    checkLeftDiagonals(board) || checkRightDiagonals(board);
    }
    
    public static boolean checkDraw(String[][] board) {
        
        for (int i = 0; i<board.length; i++)
            for (int j = 0; j<board[i].length; j++)
                if (" |".equals(board[i][j]))
                    return false;
        
        return true;
    }
    
    public static boolean checkColumns(String[][] board) {
        
        int i = board.length - 1;
        for (int j = 0; j<board[i].length; j++)
            for (i = board.length - 1; i>=3; i--)
                if (!" |".equals(board[i][j])
                        && (board[i][j].equals(board[i-1][j]))
                        && (board[i-1][j].equals(board[i-2][j]))
                        && (board[i-2][j].equals(board[i-3][j])))
                    return true;
        
        return false;       
    }
    
    public static boolean checkRows(String[][] board) {
        
        for (int i = board.length-1; i>=0; i--)
            for (int j = 0; j<board[i].length-3; j++)
                if (!" |".equals(board[i][j])
                        && (board[i][j].equals(board[i][j+1]))
                        && (board[i][j+1].equals(board[i][j+2]))
                        && (board[i][j+2].equals(board[i][j+3])))
                    return true;
        
        return false;
    }
    
    public static boolean checkRightDiagonals(String[][] board) {
        
        for (int i = board.length-1; i>=3; i--)
            for (int j = 0; j<board[i].length-3; j++)
                if (!" |".equals(board[i][j])
                        && board[i][j].equals(board[i-1][j+1])
                        && board[i-1][j+1].equals(board[i-2][j+2])
                        && board[i-2][j+2].equals(board[i-3][j+3]))
                    return true;
        
        return false;
    }
    
    public static boolean checkLeftDiagonals(String[][] board) {
        
        for (int i = board.length-1; i>=3; i--)
            for (int j = board[i].length-1; j>=3; j--)
                if(!" |".equals(board[i][j])
                        && board[i][j].equals(board[i-1][j-1])
                        && board[i-1][j-1].equals(board[i-2][j-2])
                        && board[i-2][j-2].equals(board[i-3][j-3]))
                    return true;
        
        return false;
    }
}
