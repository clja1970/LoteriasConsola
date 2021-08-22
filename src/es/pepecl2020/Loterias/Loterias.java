package es.pepecl2020.Loterias;

public class Loterias
{

	public static void main(String[] args)
	{
		System.out.println("Este programa va a dar los números de la lotería Primitiva\n");
		int i = 0, cantidad = 6, numeros = 49;

		int arra [] = new int [cantidad];

		arra [i] = (int) (Math.random()*numeros);
		
		for (i = 1 ; i<cantidad ; i++)
		{
			arra [i] = (int) (Math.random()*numeros);
			for (int j=0 ; j<i ; j++)
			{
				if (arra [i] == arra [j])
				{
					i--;
				}
			}
		}
		for (int k=0 ; k < cantidad ; k++)
		{
			System.out.println(k+1 + ".-" + arra [k] + "\n");
		}
		System.out.println("complemnetario Uno: -" + (int) (Math.random()*numeros)+"\n");
		System.out.println("complemnetario Dos: -" + (int) (Math.random()*numeros)+"\n");
	}

}
