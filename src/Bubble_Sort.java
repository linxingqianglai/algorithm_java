import java.lang.reflect.Array;
import java.util.Scanner;



public class Bubble_Sort {

	public Bubble_Sort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	private void BubbleSort(int array[])
	{
		for(int i=array.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp;
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		return ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			num[i]=s.nextInt();
		}
		Bubble_Sort bubble_Sort=new Bubble_Sort();
		bubble_Sort.BubbleSort(num);
		s.close();
		

	}

}
