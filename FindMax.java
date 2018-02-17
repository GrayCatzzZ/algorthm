import java.util.Scanner;
/*
* 用于在数组中找到最大整数和次大整数
*
* */
public class FindMax {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("please enter ten integer");
        for (int i = 0; i <10 ; i++) {
            Scanner scanner = new Scanner(System.in);
            arr[i] = scanner.nextInt();
        }
        max2(arr);
    }
    /*
    * 找出一个数组中最大值，和次大值；
    * arr为输入数组
    */
    public static void max2(int[] arr){
        //最大值的下标设为x1=0
        int x1 = 0;
        //次大值的下标设为x2=1
        int x2 = 1;
        if (arr[x1]<arr[x2]) {
            int temp = x1;
            x1 = x2;
            x2 = temp;
        }
        for(int i=2;i<arr.length;i++){
            if(arr[x2]<arr[i]){
                x2 = i;
                if(arr[x1]<arr[i]){
                    x2=x1;
                    x1=i;
                }
            }
        }
        System.out.println("max is "+arr[x1]);
        System.out.println("second max is "+arr[x2]);
    }
}
