public class TwoDimensionalArrayExample2 {
    public static void main(String[] args) {
        int [][] numbers={{50,60,40,38},{45,70,36,50},{78,89,50,60}};
        String [] workers={"John","Maria","Tom"};
        String [] months={"January","February","March","April"};
        //Finding the highest number in a two-dimensional array of "numbers".
        int maxNumber= numbers[0][0];
        int rowIndex=0;
        int columnIndex=0;
        for (int i=0;i<numbers.length;i++){ //Here we use a nested for loop.
            for(int j=0;j<numbers[0].length;j++){
                if(maxNumber<numbers[i][j]){
                    maxNumber=numbers[i][j];
                }
                rowIndex=i; //The row with the highest number in the two-dimensional string.
                columnIndex=j; //The column with the highest number in the two-dimensional string.
            }
        }
        System.out.println(maxNumber);
        System.out.println(workers[rowIndex]);
        System.out.println(months[columnIndex]);
    }
}