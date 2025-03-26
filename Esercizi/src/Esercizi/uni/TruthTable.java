package Esercizi.uni;

public class TruthTable {

	public static void main(String[] args) {
		boolean a, b;
		a = false;
		// stampa intestazione
				
		System.out.println("a"+ "\t"+ "b"+"\t"+"a&&b"+"\t"+"a||b"+"\t"+"!a");
		
		do {
			b = false;
			do {
				// stampa i valori delle espressioni booleane
				System.out.println(a+ "\t"+ b+"\t"+(a&&b)+"\t"+(a||b)+"\t"+(!a));
				b=!b;
				
			} while (b); //end do interno
			a=!a;
		} while (a);//end do esterno
		
	}//end main

}//end class
