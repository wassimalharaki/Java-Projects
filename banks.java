// Find unsafe banks in a bank tsunami where banks facing tough economic times may not be able to pay their loans

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of banks and minimum total assets: ");
        int n = input.nextInt(), limit = input.nextInt();
        int[][] info = new int[n][2];
        double[][] borrowers = new double [n][n];
        for (int i = 0; i<info.length; i++) {
            info[i][0] = input.nextInt();
            info[i][1] = input.nextInt();
            for (int j = 0; j<info[i][1]; j++) {
                borrowers[i][input.nextInt()] = input.nextDouble();
            }
        }
        String s = "";
        while (true) {
            double[] assets = calculateAssets(borrowers, info);
            int unsafeBanksNow = 0;
            for (int i = 0; i<assets.length; i++) {
                if (assets[i] < limit) {
                    s += i + " ";
                    unsafeBanksNow++;
                    info[i][0] += limit;
                    for (int j = 0; j<borrowers.length; j++)
                        borrowers[j][i] = 0;
                }
            }
            if (unsafeBanksNow == 0)
                break;
        }
        System.out.println("Unsafe banks are " + s);
    }
    public static double[] calculateAssets(double[][] array1, int[][] array2) {
        double[] assets = new double[array1.length];
        for (int i = 0; i<array1.length; i++) {
            assets[i] += array2[i][0];
            for (int j = 0; j<array1[i].length; j++)
                assets[i] += array1[i][j];
        }
        return assets;
    }
}
