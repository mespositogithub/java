package Esercizi.uni;

import java.util.Arrays;

public class EsercitazioneArray2 {

	public static void main(String[] args) {

		int[] test = new int [] {1,2,1,5,6,1,5};
		
		System.out.println("array con duplicati " + Arrays.toString(test));
		
		Arrays.sort(test);
		
		System.out.println("array senza duplicati " + Arrays.toString(removeDuplicates(test)));
		
		
		
	}//end main

	
	public static int[] removeDuplicates (int[] numbersWithDuplicates) {
		
		int[] resoult = new int[numbersWithDuplicates.length];
		int previus = numbersWithDuplicates[0];
		resoult[0]=previus;
		
		for (int i = 1; i< numbersWithDuplicates.length ; i++) {
			
			int num=numbersWithDuplicates[i];
			if (previus != num) {
				resoult[i]=num;
			}//end if
			previus=num;
			
		}//end for
		return resoult;
	
	}//end removeDuplicates
	
}//end class
