package projlab;

import java.util.Scanner;

public class Main {
	private int tab; //tab-ok szama.
	
	public static void stabiljegtablara_lepes() {}
	public static void instabiljegtablara_lepes() {}
	public static void instabiljegtabla_atfordul() {}
	public static void lukba_lepes() {}
	public static void lukban_meghal() {}
	public static void lukbol_megprobal_kilepni() {}
	public static void etelt_hasznal() {}
	public static void lapatot_hasznal() {}
	public static void kotelet_hasznal() {}
	public static void buvarruhat_hasznal() {}
	public static void raketalaaktreszt_kias() {}
	public static void eszkimo_kepesseg() {}
	public static void sarkkutato_kepesseg_stabil() {}
	public static void sarkkutato_kepesseg_instabil() {}
	public static void sarkkutato_kepesseg_luk() {}
	public static void ho_takarit() {}
	public static void hovihar_uresepuletben() {}
	public static void hovihar_igluban() {}
	public static void gyozelem() {}
	
	
	public static void main(String args[]) {
		String tesztek[] = {"Eszkim� a szomsz�dos stabil j�gt�bl�ra l�p.",
				"Eszkim� a szomsz�dos instabil j�gt�bl�ra l�p.",
				"Eszkim� a szomsz�dos instabil j�gt�bl�ra l�p �s j�gt�bla �tfordul.",
				"Eszkim� a szomsz�dos lukba l�p.",
				"Eszkim� lukban van �s meghal.",
				"Eszkim� megpr�b�l lukb�l kil�pni.",
				"Eszkim� ki�s egy �telt �s haszn�lja.",
				"Eszkim� a lap�tot haszn�lja.",
				"Eszkim� a k�telet haszn�lja.",
				"Eszkim� a b�v�rruh�t haszn�lja.",
				"Eszkim� ki�s egy r�k�taalkatr�szt.",
				"Eszkim� k�pess�get haszn�l.",
				"Sarkkutat� k�pess�get haszn�l egy stabil j�gt�bl�n.",
				"Sarkkutat� k�pess�get haszn�l egy instabil j�gt�bl�n.",
				"Sarkkutat� k�pess�get haszn�l egy lukon.",
				"Eszkim� egy r�teg havat eltakar�t.",
				"Egy eszkim�t elkap a h�vihar �res �p�letben.",
				"Egy eszkim�t elkap a h�vihar igluban.",
				"Eszkim� ki�ssa az utols� rak�taalkatr�szt �s nyernek.",
				"Kil�p�s."};
		
		boolean exit = false;
		Scanner input = new Scanner(System.in); //Sz�m beolvas�s�hoz haszn�lom.
		while(!exit) {
			System.out.println("V�lasszon egy tesztet:\n");
			for(int i = 1; i < 21; i++)
				System.out.println(i + " " + tesztek[i - 1]);
			int teszt = input.nextInt();
			
			if(teszt != 20)					//Mert itt nincs teszt csak kil�p�nk
				System.out.println("A v�lasztott teszt: " + tesztek[teszt]);
			
			switch(teszt) {
			  	case 1:
			  		stabiljegtablara_lepes();
			  		break;
			  	case 2:
			  		instabiljegtablara_lepes();
			  		break;
			  	case 3:
			  		instabiljegtabla_atfordul();
			  		break;
			  	case 4:
			  		lukba_lepes();
			  		break;
			  	case 5:
			  		lukban_meghal();
			  		break;
			  	case 6:
			  		lukbol_megprobal_kilepni();
			  		break;
			  	case 7:
			  		etelt_hasznal();
			  		break;
			  	case 8:
			  		lapatot_hasznal();
			  		break;
			  	case 9:
				    kotelet_hasznal();
			  		break;
			  	case 10:
			  		buvarruhat_hasznal();
			  		break;
			  	case 11:
				    raketalaaktreszt_kias();
			  		break;
			  	case 12:
			  		eszkimo_kepesseg();
			  		break;
			  	case 13:
			  		sarkkutato_kepesseg_stabil();
			  		break;
			  	case 14:
				    sarkkutato_kepesseg_instabil();
			  		break;
			  	case 15:
			  		sarkkutato_kepesseg_luk();
			  		break;
			  	case 16:
			  		ho_takarit();
			  		break;
			  	case 17:
			  		hovihar_uresepuletben();
			  		break;
			  	case 18:
			  		hovihar_igluban();
			  		break;
			  	case 19:
			  		gyozelem();
			  		break;
			  	case 20:
			  		exit = true;;
			  		break;
			}
		}
		input.close();
	}
	
}
