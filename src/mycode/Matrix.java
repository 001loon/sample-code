package mycode;

public class Matrix {

	public static void main (String [] args) {
		//populate array
		int [][] testMatrix ={
				{-1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		//call matrixProduct
		int num = matrixProduct(testMatrix);
		System.out.println("largest product = " + num);
	}
	
	public static int matrixProduct(int[][] matrix) {
	    if (matrix.length == 0 || matrix[0].length == 0) return 0;
	        
	    // Create cache of min and max product to a given cell
	    int[][] maxCache = new int[matrix.length][matrix[0].length];
	    int[][] minCache = new int[matrix.length][matrix[0].length];
	    System.out.println("maxCache and minCache created");
	    System.out.println("start processing matrix to fill caches:  bottom right of max cache is largest product"); 
	    
	    // Fill caches. We start at the top  left and iteratively find the greatest
	    // at smallest path to each subsequent cell by considering the greatest and
	    // smallest path to the cells above and to the left of the current cell
	    for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[0].length; j++) {
	               
	            // If you're in the top left corner, just copy to cache
	            if (i == 0 && j == 0) {
	            	System.out.println("i and j = 0");
	                maxCache[i][j] = matrix[i][j];
	                System.out.println("    maxCache[i][j] = " + maxCache[i][j]);
	                minCache[i][j] = matrix[i][j];
	                System.out.println("    minCache[i][j] = " +  minCache[i][j]);
	                continue;
	            }

	            int maxVal = Integer.MIN_VALUE;
	            int minVal = Integer.MAX_VALUE;
	            // If we're not at the top, consider the value above
	            if (i > 0) {
	            	System.out.println("i is greater than 0 ::  i = " + i);

	                int tempMax = Math.max(matrix[i][j] * maxCache[i-1][j], matrix[i][j] * minCache[i-1][j]);
	                System.out.println("   tempMax = " + tempMax);
	                maxVal = Math.max(tempMax, maxVal);
	                System.out.println("   maxVal = " + maxVal);
	                int tempMin = Math.min(matrix[i][j] * maxCache[i-1][j], matrix[i][j] * minCache[i-1][j]);
	                System.out.println("   tempMin = " + tempMin);
	                minVal = Math.min(tempMin, minVal);
	                System.out.println("   minVal = " + minVal);
	            }
	            // If we're not on the left, consider the value to the left
	            if (j > 0) {
	            	System.out.println("j is greater than 0 ::  j = " + j);
	                int tempMax = Math.max(matrix[i][j] * maxCache[i][j-1], matrix[i][j] * minCache[i][j-1]);
	                System.out.println("   tempMax = " + tempMax);
	                maxVal = Math.max(tempMax, maxVal);
	                System.out.println("   maxVal = " + maxVal);
	                int tempMin = Math.min(matrix[i][j] * maxCache[i][j-1], matrix[i][j] * minCache[i][j-1]);
	                System.out.println("   tempMin = " + tempMin);
	                minVal = Math.min(tempMin, minVal);
	                System.out.println("   minVal = " + minVal);
	            }
	            maxCache[i][j] = maxVal;
	            System.out.println("   maxCache[" + i + "][" + j + "] = " + maxCache[i][j]);
	            minCache[i][j] = minVal;
	            System.out.println("   minCache[" + i + "][" + j + "] = " + minCache[i][j]);
	        }
	    }
	        
	    // Return the max value at the bottom right
	    System.out.println("max value at bottom right ::");
	    System.out.println("   maxCache.length - 1 = " + (maxCache.length - 1));
	    System.out.println("   maxCache[0].length - 1 = " + (maxCache[0].length - 1));
	    return maxCache[maxCache.length - 1][maxCache[0].length - 1];
	}
}
