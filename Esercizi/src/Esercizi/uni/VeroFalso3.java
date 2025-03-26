package Esercizi.uni;

import java.util.Scanner;

public class VeroFalso3 {

	static int a;
	static int b;
	static int c;
	static int d;
	
	
	public static void main(String[] args) {
	
		char ch1 = 'a';
		char ch2 = 'b';
		boolean valoreBol;
		
		getValori();
		
		stampaIntestazione (ch1,ch2);
		
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

	
	public static void stampaIntestazione(char c1, char c2) {
		
		System.out.println("Dati i seguenti valori per le variabili:");
		System.out.println("a" + "\t" + "c" + "\t" + "d" + "\t" + "ch1" + "\t" + "ch2");
		System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + c1 + "\t" + c2);
		System.out.print("\n");
		//System.out.println("");
		
	}//end stampaIntestazione		

	//Permette di acquisire i valori di a,b,c,d
	public static void getValori() {
		//crea un oggetto scanner che abbia lo stato input come fonte di dati
		Scanner scan = new Scanner(System.in);
		
		//prende i valori dalla tastiera
		/*
		eccezioni non gestite
		 */
		
		System.out.println("Inserire il valore di a:");
		a=scan.nextInt();
		System.out.println("Inserire il valore di b:");
		b=scan.nextInt();
		System.out.println("Inserire il valore di c:");
		c=scan.nextInt();
		System.out.println("Inserire il valore di d:");
		d=scan.nextInt();
		
	}//end getValori
	
	
}// end class
