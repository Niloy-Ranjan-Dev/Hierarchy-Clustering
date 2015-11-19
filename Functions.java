package agglomerative;

/**
 *
 * @author nrdev
 */
public class Functions {
    public static double distance, sum, minimum = 999999999.9;
       public static int xIndex, yIndex; 

       
       public static double dist(double x1, double x2, double y1, double y2){
        sum = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        distance = Math.sqrt(sum);
 //       System.out.println(distance);
        return distance;
       }
   
   
   public static double minimiumFinding(double[][] d3){
       for(int i = 0; i < d3.length; i++){
           for(int j = 0; j < d3.length; j++){
               if(minimum > d3[i][j]){
                   minimum = d3[i][j];
                   xIndex = i; 
                   yIndex = j; 
               }
           }
       }
       return minimum;
   }
   
   public static double [][] replaceMinimum(double min, double[][] d2){
       minimum = 999999999.9;
       for(int i = 0; i < d2.length; i++){
           for(int j = 0; j < d2.length; j++){
               if(d2[i][j] == min){
                d2[i][j] = minimum;
               }
           }
       }
       
       return d2;
   }
   
   public static double [][] swap(double[][] d2){
       int length = d2.length;
//       start
//       swap
        for(int i = 0; i < length; i++){
           if(d2[i][xIndex] > d2[i][yIndex] ){
               d2[i][xIndex] = d2[i][yIndex];
           }
           if(d2[xIndex][i] > d2[yIndex][i]){
               d2[xIndex][i] = d2[yIndex][i];
           }
        }
        
        for(int i = 0; i < length; i++){
                d2[i][yIndex] = 999999999.9;
                d2[yIndex][i] = 999999999.9;
        }
//       finish     
       return d2;
   }
}
