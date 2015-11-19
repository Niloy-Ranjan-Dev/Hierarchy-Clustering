package agglomerative;

import java.util.Arrays;

/**
 *
 * @author nrdev
 */
public class Agglomerative {
    public static void main(String[] args) {
       double[] x = {1, 1.5, 5, 3, 4, 3};
       double[] y = {1, 1.5, 5, 4, 4, 3.5};
       double minimum;
       int locationX, locationY;
       int length = x.length, xIndex = 0, yIndex = 0, icr = 0;
       int xValue[] = new int[length + 1], yValue[] = new int[length + 1], index[] = new int[10000];
       double d[][] = new double[length][2], d2[][] = new double[length][length], d3[][] = new double[length][length];
       String[] temp = new String[10000];
       
//       Initializing d matrix
       for(int i = 0; i < length; i++){
           d[i][0] = x[i];
           d[i][1] = y[i];
       }
       
      for(int i = 0; i < index.length; i++){
          index[i] = -78;
      }
      
      
//       Calculating distance
       for(int i = 0; i < length; i++){
           for(int j = 0; j < length; j++){
             d2[i][j] = Functions.dist(d[i][0], d[j][0], d[i][1], d[j][1]);
           }
       }
       
       minimum = Functions.minimiumFinding(d2);

       do{
         d2 = Functions.replaceMinimum(minimum, d2);

         minimum = Functions.minimiumFinding(d2);
         xValue[xIndex] = Functions.xIndex; xValue[xIndex] += 1;
         yValue[yIndex] = Functions.yIndex; yValue[yIndex] += 1;


         d2 = Functions.swap(d2);

         Arrays.sort(index);
         locationX = Arrays.binarySearch(index, xValue[xIndex]);
         locationY = Arrays.binarySearch(index, yValue[yIndex]);
       
//         System.out.println("locationX: " + locationX + "\n locationY: " + locationY);
       
         if((locationX < 0) && (locationY < 0)){
            index[icr] = xValue[xIndex]; 
            icr++;
            index[icr] = yValue[yIndex];
            temp[xValue[xIndex]] = "(D" + xValue[xIndex] + ", D" + yValue[yIndex] + ")";
            temp[yValue[yIndex]] = "(D" + xValue[xIndex] + ", D" + yValue[yIndex] + ")";
         }
         else if((locationX >= 0) && (locationY < 0)){
            index[icr] = yValue[yIndex];
            temp[xValue[xIndex]] = "(" + temp[xValue[xIndex]] + ", D" + yValue[yIndex] + ")";
            temp[yValue[yIndex]] = "D" + yValue[yIndex];
         }
         else if((locationX < 0) && (locationY >= 0)){
            index[icr] = xValue[xIndex];
            temp[xValue[yIndex]] = "(" + temp[yValue[yIndex]] + ", D" + xValue[xIndex] + ")";
            temp[yValue[xIndex]] = "D" +  xValue[xIndex];
         }
         else{
            temp[xValue[xIndex]] = "(" +temp[xValue[xIndex]] + " , " + temp[yValue[yIndex]] + ")";
            temp[yValue[yIndex]] = "(" + temp[xValue[xIndex]] + ", " + temp[yValue[yIndex]] + ")";
         }           
         length--;
         xIndex++;
         yIndex++;
         icr++;
       }while(length > 1);
           System.out.println(temp[1]);
    }
}
