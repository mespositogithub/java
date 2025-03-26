package Esercizi.uni;

public class EsercitazioneArray1 {

	public static void main(String[] args) {
		
		// si istanza un vettore di double
		double[] arrayD = new double[] {3.4,7,3.434,5.2,6.09};
		
		double numToCheck = 5.3;
		
		for (int i=0; i<arrayD.length; i++) { 
			if (numToCheck == arrayD[i]) {
				System.out.println("Trovato numero " + numToCheck + " nella posizione: "+ i);
				printVector(arrayD);
				return;
				
				} //end if
			
			}// end for
		
		System.out.println(numToCheck + " non è stato trovato nell'array contenente i valori:");
		printVector(arrayD);
			

		} //end main

	static void printVector(double[] aD) {
		System.out.print("[");
		
		for (int i = 0; i < aD.length ; i++) {
			System.out.print(aD[i]+" ");
		
		}//end for
		System.out.print("]");
		
	}//end printVector
		
		
} //end class
