package Esercizi.uni;

public class EsercitazioneRicorsione3 {

// identificazione dei paletti
	
	static int n1,n2,n3 = 0;
	
	
	public static void main(String[] args) {
		
		// numero dei dischi
		
		int dischi = 4;
		n1=dischi; //si posizionano i dischi sul paletto n1
		System.out.println(n1+" "+ n2+" "+n3+" ");
		TorreHanoi (dischi,1,2,3);
		
	}//end main

	// esegue ricorsivamente i passi
	
	public static void TorreHanoi (int nDischi, int pioloOrigine, int pioloAppoggio, int pioloDestinazione) {
		if (nDischi == 1) {
		System.out.println("Sposto dal piolo " + pioloOrigine + " al piolo " + pioloDestinazione);
			switch (pioloOrigine) {
			
			case 1:
				n1=n1-1;
				break;
			
			case 2:
				n2=n2-1;
				break;
				
			case 3:
				n3=n3-1;
			
			}//end switch
			
			switch (pioloDestinazione) {
			
			case 1:
				n1=n1+1;
				break;
			
			case 2:
				n2=n2+1;
				break;
				
			case 3:
				n3=n3+1;
				
			}//end switch
			
			System.out.println(n1+" " + n2+" "+n3);
			
		
		}//end if
		
		else {
			TorreHanoi (nDischi-1, pioloOrigine, pioloDestinazione, pioloAppoggio);
			TorreHanoi (1, pioloOrigine, pioloAppoggio, pioloDestinazione);
			TorreHanoi (nDischi-1, pioloAppoggio,pioloOrigine, pioloDestinazione );
			
		} //end else
		
	} //end TorreHanoi
	
}
