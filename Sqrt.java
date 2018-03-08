package first;

public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sqrtDown(100));
		System.out.println(sqrtUp(100));
	}
	public static int sqrtDown(int n){
		int low = 0;
		int high = n;
		int mid = 0;
		boolean flag = true;
		while(flag){
			mid = (low+high)>>1;
			if(mid*mid <= n && (mid+1)*(mid+1)>n )
				flag = false;
			else if(mid*mid < n && (mid+1)*(mid+1)<= n)
				low = mid+1;
			else if(mid*mid >n && (mid-1)*(mid-1)<= n){
				mid--;
				flag = false;
			}
			else if(mid*mid >n && (mid-1)*(mid-1)>n)
				high=mid-1;
		}
		return mid;
	}
	public static int sqrtUp(int n){
		int low = 0;
		int high = n;
		int mid = 0;
		boolean flag = true;
		while(flag){
			mid = (low+high)>>1;
			if(mid*mid < n && (mid+1)*(mid+1)>n ){
				mid++;
				flag = false;
			}
			else if(mid*mid < n && (mid+1)*(mid+1)<n)
				low = mid+1;
			else if(mid*mid >=n && (mid-1)*(mid-1)<= n){
				if((mid-1)*(mid-1)==n)
					mid-=1;
				flag = false;
			}
			else if(mid*mid >n && (mid-1)*(mid-1)>n)
				high=mid-1;
		}
		return mid;
	}


}