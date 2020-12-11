import java.util.Arrays;

/*
* Author : farahmansour
*Date : 10-Dec-2020
*/

public class Exercise_3
	{

				public static int nombrepeitit(int[] s, int total) 
					{
						int num;
						for (int i = 0; i < total; i++) 
						{

						for (int j = i + 1; j < total; j++) 
						{

						if (s[i] < s[j]) 
						{
						num = s[i];
						s[i] = s[j];
						s[j] = num;
						}
						}
						}

						return s[0];
						}

						public static void main(String args[]){

						int coolerArray[]; 
						int []s= {122,44,22,18,11,89};

						coolerArray = Arrays.stream(s).filter(d -> d != nombrepeitit(s,4)).toArray();
						System.out.println(Arrays.toString(coolerArray));

						}
						}
