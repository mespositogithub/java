package Esercizi.uni;

public class EsercitazioneRicorsione2c {

	public static void main(String[] args) {
		
		int n1 = 0; //fn-1
		int n2 = 1; //Fn-2
		
		int occorrenze = 12 ; // numero dei valori da calcolare
		
		int idx = 2 ; // indice 
		
		fibonacci (idx,occorrenze,n1,n2);

	} // end main

	// esempio di metodo ricorsivo
	
	private static void fibonacci (int id,int count, int n1, int n2) {
		
		if (n1 == 0 && n2 == 1) {
			System.out.println("F(0)="+n1);
			System.out.println("F(1)="+n2);
			
		} //end if
		
		if (count > 2) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println("F("+id+")="+n3);
			id=id+1;
			fibonacci(id,count-1,n1,n2);
					
					
		}//end if
		
	} // end fibonacci
	
	
} // end class
