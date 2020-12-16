/*
* Author : farahmansour
*Date : 16-Dec-2020
*Dans ce programme, j'ai corrigé quelques erreurs qui auparvant l'ont empeché de fonctioinner.
*/

public class Erreurs1{

		public static void main(String[] args){ 
		// 1. Il faut ajouter "static".
			System.out.println(saluerAmi("John"));
			//2. Il faut la sortir du main - tu ne peux pas avoir une méthode dans l'autre main méthode. On pourrait faire de John un variable string nom.
		}
		
		/*
		 * Méthode permettant de saluer un ami en
		 * utilisant son nom
		 */	
		public static String saluerAmi (String a)
			{
					String message="Bonjour mon ami " + a;
					// 3. Ajouter une espace pour que ca soit plus claire.
					return message;
			}
}