
public class FindMax {

	/**
	 * @param args
	 */
	
	public  static int  Find_Max_Crossing_Subarray(int[] array,int low,int mid,int heigh)
	{
		int sum=0;
		int left_sum=-1111;
		System.out.println("array["+low+"]"+"="+array[low]);
		for(int i=mid;i>=low;i--)
		{
			sum+=array[i];
			if(sum>left_sum)
			{
				left_sum=sum;
			}
		}
		sum=0;
		int right_sum=-1111;
		for(int i=mid+1;i<=heigh;i++)
		{
			sum+=array[i];
			if(sum>right_sum)
			{
				right_sum=sum;
			}
		}
		System.out.println("left_sum+right_sum="+left_sum+right_sum);
		return left_sum+right_sum;
	}
	
	public static int Find_Max(int[] array,int low,int heigh)
	{
		//System.out.println("low="+low);
		if(low==heigh) return array[low];
		else
		{
			int max1=Find_Max(array, low,(low+heigh)/2);
			int max2=Find_Max(array,(low+heigh)/2+1,heigh);
			int max3=Find_Max_Crossing_Subarray(array, low,(low+heigh)/2,heigh);
			if(max1>max2&&max1>max3)return max1;
			else if(max2>max3 && max2>max1) return max2;
			return  max3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
		System.out.println(Find_Max(array, 0,array.length-1));
	} 

}
