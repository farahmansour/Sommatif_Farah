import java.util.Scanner;

/*
* Author : farahmansour
*Date : 10-Dec-2020
*/

public class Exercice_2
	{

		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				int[] tab = {6, 102, 44, 88, 99, 11, 32, 24, 9, 18, 74, 65 };


				System.out.println("Quel nombre souhaitez-vous connaitre sa présence dans le tableau?");
				int nombre = sc.nextInt();

				int aTrouver = nombre;
				boolean found = false;

				for (int n : tab) {
				if (n == aTrouver) {
				found = true;
				break;
				}
				}

				if(found)
				System.out.println(aTrouver + " se trouve dans le tableau.");
				else
				System.out.println(aTrouver + " ne se trouve pas dans le tableau.");
				}
				

			}

	
