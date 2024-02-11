public class MatrisOrnegi {
    public static void main(String[] args) {

        int[][] matris = new int[4][3];
        for (int i = 0; i < matris.length; i++) {
            System.out.println();
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j] = (int) (Math.random() * 1000);
                System.out.printf("%5d", matris[i][j]);
            }
        }
        int max = matris[0][0], min = matris[0][1], minSutun = 0, minSatir = 0, maxSutun = 0, maxSatir = 0;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                if (max < matris[i][j]) {
                    max = matris[i][j];
                    maxSatir = i;
                    maxSutun = j;
                }
                if (min > matris[i][j]) {
                    min = matris[i][j];
                    minSatir = i;
                    minSutun = j;
                }
            }
        }
        System.out.println("\nmin sayı= " + matris[minSatir][minSutun] + " Sütun: " + (minSutun+1) + " Satır: " + (minSatir+1));
        System.out.println("\nmax sayı= " + matris[maxSatir][maxSutun] + " Sütun: " + (maxSutun+1) + " Satır: " + (maxSatir+1));
    }
}

