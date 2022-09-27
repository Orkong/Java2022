package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		String ortaMetin = "Ilginizi cekebilir";
		String altMetin = "vade süresi";		
		
		System.out.println(ortaMetin);
		
		int vade = 12 ;
		
		double dolarDün = 18.25;
		double dolarBugün = 18.30;
		
		boolean dolarNeDüstüMü = true; //true ve false kullanılır.
		
		String okYönü = "";
		
	
		if (dolarBugün<dolarDün) {
			okYönü = "down.svg";
			System.out.println(okYönü);
		}	
		else if(dolarBugün>dolarDün)  {
			okYönü = "up.svg";
		    System.out.println(okYönü);
		}
		else	{
			okYönü = "equal.svg";
		    System.out.println(okYönü);
		}
		
		//array
		
		String[] krediler = {"Hizli Kredi","Maasini Alanlar","Mutlu Emekli"} ;
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
	}

}
