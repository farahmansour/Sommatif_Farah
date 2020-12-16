/*
* Author : farahmansour
*Date : 16-Dec-2020
*Dans ce code, j'ai utilié une méthode qui m'a permis de connaitre la moyenne de nombres impaires contentu dans un tableau de 20 élements genérés au hassard.
*Ce programme a été très interssant à faire. Au début j'avais quelques difficultés avec les variables ainsi qu'avec les boucles néanmoins en observant des anciens 
*codes et en construisant ce programe étapé par étape j'ai pu le faire. 
*/

public class sommatif_ex2
	{
		public static void main(String[] args)
			{
				int[] myTab= new int[20];
				int nombresImpaires = 0;	
				double somme = 0;
								
								
				for(int i=0; i<20; i++)
				{
					myTab[i]=(int)(Math.random()*(i+1));
				}
				
				for (int i: myTab)
				{
					int num = myTab[i];
					if (isPair(num) == false){
						somme = somme + num; 
						nombresImpaires = nombresImpaires + 1;
					}
				}
				
				System.out.println("quantité de nombres impaires: " + nombresImpaires);
				System.out.println("somme des nombres impaires: " + somme + "..." + "La moyenne des nombres impaires est " + (somme/nombresImpaires));
				}
				
				static boolean isPair(int nbr){
					if(nbr%2==0)
						return true;
					else
						return false;
					}
			}