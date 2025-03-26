package Esercizi.uni;

import java.util.Arrays;

public class EsercitazzioneArray4b {

	//variabili utilizzate dal programma
	
	static private int max;
	static private int min;
	static private int SIZE=1000000;
	
	
	public static void main(String[] args) {
		
		System.out.println("Size: " + SIZE);
		
		int[] test= new int[SIZE];
		
		for (int i=0; i< SIZE; i++) {
			
			test[i]=(int)(Math.random()*SIZE/2-1);
			
		}//end for
		
		metodo1(test);
		metodo2(test);
		
	}//end main

	
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
	
	
	
}//end class
