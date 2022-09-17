
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		//VARİABLES-Değişkenler
		int ogrenciSayi = 15;
		String mesaj ="Ogrenci sayisi: ";
		System.out.println(mesaj + ogrenciSayi);
		System.out.println("Ogrenci sayim : "+ ogrenciSayi);
		byte sayi1 = 9;
		System.out.println(sayi1);
		double sayi2 = 10.53 ;
		System.out.println(sayi2);
		boolean dogruMu = false;
	    System.out.println(dogruMu);
		
		//İf Blokları
	    int sayi = 20;
	    
	    if (sayi<20) {
		System.out.println("Sayi 20 de kucuktur");
		 }
	    else if	(sayi==20) {
		System.out.println("Sayi 20 ye esittir");
		    }
	    else  {
	    System.out.println("Sayi 20 den buyuktur");
	    }	
	   
	    //Demo
	    int sayia =10;
	    int sayib =20;
	    int sayic =32;
	    int enBuyuk =sayia;
	    
	    if (enBuyuk<sayib) {
	    	enBuyuk = sayib;
	    }	
	    if (enBuyuk<sayic) {
	    	enBuyuk = sayic;
	    }
	    System.out.println("En buyuk =" +enBuyuk);
	   
	    //Switch Blokları
	    char grade = 'C';
	    
	    switch(grade) {
	      case 'A':
	    	  System.out.println("Mukemmel!");
	    	  break;
	      case 'B':
	    	  System.out.println("Gectiniz!");
	    	  break;
	      case 'C':
	    	  System.out.println("Ortalama ile gectiniz!");
	    	  break;
	      case 'D':
	    	  System.out.println("Bute kaldiniz!");
	    	  break;
	      case 'E':
	    	  System.out.println("Kaldiniz!");
	    	  break;
	      default:
	    		  System.out.println("Gecersız not gırdınız");
	    }
	    
	    //DÖNGÜLER
	    for(int i=2;i<=10;i+=2) {
	    System.out.println(i);
	    }
	    System.out.println("For Dongu bitti");
	    
	    int i=2;
	    while(i<10) {
	    	System.out.println(i);
	    	i+=1;
	    }
	    System.out.println("While Dongu bitti");
	    
	    //DİZİLER
	    
	    String ogrenci1="Buse";
	    String ogrenci2="Pelin";
	    String ogrenci3="Cansu";
	    
	    System.out.println(ogrenci1);
	    System.out.println(ogrenci2);
	    System.out.println(ogrenci3);
	    
	    System.out.println("--------------");
	    
	    String[] ogrenciler = new String[3];
	    ogrenciler[0]="Buse";
	    ogrenciler[1]="Pelin";
	    ogrenciler[2]="Cansu";
	    
	    for(int i1=0;i1<ogrenciler.length;i1++) {
	    	System.out.println(ogrenciler[i1]);
	    }
	    
	    System.out.println("--------------");
	    
	    for(String ogrenci:ogrenciler) {
	    	System.out.println(ogrenci);
	    }
	    
	    String[][] sehirler = new String[3][3];
	    
	    sehirler[0][0]= "istanbul";
	    sehirler[0][1]= "Bursa";
	    sehirler[0][2]= "Bilecik";
	    sehirler[1][0]= "Ankara";
	    sehirler[1][1]= "Konya";
	    sehirler[1][2]= "Kayseri";
	    sehirler[2][0]= "Diyarbakir";
	    sehirler[2][1]= "Urfa";
	    sehirler[2][2]= "Antep";
	    
	    for(int b = 0;b<=2;b++) {
	    	System.out.println("-----------");
	    	for (int j=0;j<=2;j++) {
	    		System.out.println(sehirler[b][j]);
	    	}
	    
	    }
	    
	    String note="Bugun hava cok guzel.";
	    System.out.println(note);
	    
	    System.out.println("Eleman sayisi : "+ note.length() );
	    System.out.println("5.eleman sayisi : " +note.charAt(4));
	    System.out.println(note.concat (" Yasasin!"));
	    System.out.println(note.startsWith("B"));
	    System.out.println(note.endsWith("."));
	    System.out.println(note.indexOf("a"));
	    System.out.println(note.lastIndexOf("a"));
	    
	    String yeniMesaj =note.replace(' ', '-');
	    System.out.println(yeniMesaj);
	    System.out.println(note.substring(2,5));
	    
	    for(String kelime : note.split(" ")) {
	    	System.out.println(kelime);
	    }
	    
	    System.out.println(note.toLowerCase());
	    System.out.println(note.toUpperCase());
	    
	    int number = 25;
	    int remainder =number % 2;
	    System.out.println(remainder);
	    
	    
	    
	    
	    
	    
	    
	    
	}
}	
	     	   
	
	    
	    
	    
	  
	    
	    


