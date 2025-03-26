package Esercizi.uni;

public class VeroFalso {

	static int a = 10;
	static int b = 13;
	static int c = 10;
	static int d = 13;
	
	static char ch1 = 'a';
	static char ch2 = 'b';
	

	public static void main(String[] args) {
	
		boolean valoreBol;
		stampaIntestazione();
		
		System.out.println("Calcolo il valore delle seguenti espressioni booleane:");
		
		
		valoreBol = (a < b) && (c < d);
		System.out.println("(a<b) && (c<d): "+ valoreBol);
		
		valoreBol = (a == b)|| (c + d == 4);
		System.out.println("(a == b) || (c + 2 == 4): "+ valoreBol);
		
		valoreBol = (ch1 <= ch2);
		System.out.println("(ch1 <= ch2): "+ valoreBol);
		
		valoreBol = (a+d==3) && (ch1<ch2) || (c>a);
		System.out.println("(a+d==3) && (ch1<ch2) || (c>a) "+ valoreBol);
		
		
	} // end main

	//stampa i valori delle variabili
	public static void stampaIntestazione() {
	
	System.out.println("Dati i seguenti valori per le variabili:");
	System.out.println("a" + "\t" + "c" + "\t" + "d" + "\t" + "ch1" + "\t" + "ch2");
	System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + ch1 + "\t" + ch2);
	System.out.print("\n");
	//System.out.println("");
	
	}//end stampaIntestazione		

}//end class
