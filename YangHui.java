
public class YangHui {
	public static void y1(){
		
		int[][] arr = new int[10][];
		arr[0] = new int[1];
		arr[0][0] = 1;
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = new int[i+1];
			arr[i][0] = 1;
			for (int j = 1; j < arr[i].length-1; j++) {
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
			arr[i][i] = 1;
		}
		for(int i = 0; i < arr.length; i++){
			
			for (int j = arr.length - i; j > 0; j--) {
				System.out.print("  ");
			}
			
			for(int j = 0 ;j < arr[i].length; j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		/*
               		1  
                  1  1  
                1  2  1  
              1  3  3  1  
            1  4  6  4  1  
          1  5  10  10  5  1  
        1  6  15  20  15  6  1     
      1  7  21  35  35  21  7  1  
    1  8  28  56  70  56  28  8  1  
  1  9  36  84  126  126  84  36  9  1 
		
		*/
		System.out.println();
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + "  ");
			}
			System.out.println();
		}
		/*
		 * 1  
1  1  
1  2  1  
1  3  3  1  
1  4  6  4  1  
1  5  10  10  5  1  
1  6  15  20  15  6  1  
1  7  21  35  35  21  7  1  
1  8  28  56  70  56  28  8  1  
1  9  36  84  126  126  84  36  9  1  
		 * */
		
	}
	
	public static void main(String[] args) {
		
		y1();
		
	}
	
}
