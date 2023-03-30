// Generates a solution to the eight queens game

public class Main {
    public static void main(String[] args) {
        int[] column = new int[8];
        int tries = 0;
        String s = "";
        column[0] = (int) (1+Math.random()*8);
        for (int i = 1; i<=9; i++)
            if (i != column[0])
                s += "| ";
            else
                s += "|Q";
        s += "\n";
        for (int i = 1; i<column.length; i++) {
            while (true) {
                boolean checker = true;
                column[i] = (int) (1+Math.random()*8);
                tries++;
                if (tries == 100)
                    break;
                for (int j = 0; j<i; j++) {
                    if (column[i] == column[j]) {
                        checker = false;
                        break;
                    }
                }
                for (int j = 0; j<i; j++) {
                    if (column[i] == column[j]+i-j) {
                        checker = false;
                        break;
                    }
                }
                for (int j = 0; j<i; j++) {
                    if (column[i] == column[j]-i+j) {
                        checker = false;
                        break;
                    }
                }
                if (checker)
                    break;
            }
            if (tries == 100)
                break;
            for (int j = 1; j<=9; j++)
                if (j != column[i])
                    s += "| ";
                else
                    s += "|Q";
            s += "\n";
        }
        if (tries == 100)
            main(args);
        else
            System.out.println(s);
    }
}
