package Esercizi.uni;

import java.util.Arrays;

public class EsercitazioneArray4 {

	
		//variabili utilizzate nel programma
		
		static private int max; 
		static private int min;
		
		
		public static void main (String[] args) {
		
		int[] test = new int [] {10,2,12,5,6,1,5,0,13};
		System.out.println ("Array originale " + Arrays.toString(test));
		
		metodo1 (test);
		metodo2 (test);

	} //end main
	
		//primo metodo
		
		public static void metodo1 (int[]temp) {
			
			long timeStart = System.currentTimeMillis();
			
			min=max=temp[0];
			
			for (int i =1; i<temp.length; i++ ) {
				
				if (temp[i]>max) {
					max=temp[i];
				}//end if
				
				if (temp[i]<max){
					min=temp[i];
					
				}//end if
					
			}//end for
			
			System.out.println("Metodo 1");
			System.out.println("MAX = "+ max);
			System.out.println("MIN = "+ min);
			
			long timeEnd = System.currentTimeMillis();
			System.out.println("Delta t in ms = " + (timeEnd - timeStart) );
		
		} //end metodo 1
		
		//secondo metodo
		
		public static void metodo2 (int[]temp) {
			
			long timeStart = System.currentTimeMillis();
			
			Arrays.sort(temp);
			
			System.out.println("Metodo 2");
			System.out.println("MAX = " + temp[temp.length-1]);
			System.out.println("MIN = " + temp[temp[0]]);
		
			long timeEnd = System.currentTimeMillis();
			System.out.println("Delta t in ms = " + (timeEnd - timeStart) );
			
			
		
		} //end metodo 2
		
}// end class
