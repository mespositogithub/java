package Esercizi.uni;
import java.util.Arrays;


public class EsercitazioneArray3 {
	
	private static final int NA = -1; // valore costante fisso utilizzato nel programma
	
		
	
	public static void main(String[] args) {
	
	int [] test = new int[] {1,2,1,5,2,1,6};
	
	// determina la lunghezza dell'array
	int size = test.length; 	
	
	// crea array temporanero
	int[] temp = new int[size];
	
	// assegna ad ogni elemento un valore negativo
	for (int i=0; i<size-1; i++ ) {
		temp[i]=NA;
			
	} //end for
	
	
	// scorre l'array dato
	for (int i=0; i<size-1;i++) {
		int val=test[i];
		temp[val]=val; //ad ogni elemento di indice val si assegna il valore val
	}//end for
		
	
	System.out.println("Array originale: "+ Arrays.toString(test));
	System.out.println("Array temporaneo: "+ Arrays.toString(temp));
	
	// si trovano i valori mancanti
	
	for (int i=0;i<size-1;i++) {
		if (temp[i]==NA) {
			System.out.println("il numero :" +i+ " è mancante");
		}//end if
		
		
	}//end for
	
	
	} // end main

} // end class
