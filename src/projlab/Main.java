package projlab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static int tabs = -1;
	public static void print(String s) { System.out.println("\t".repeat(tabs) + s); }
	public static void log(Object obj, String method) { System.out.println("\t".repeat(tabs) + "--> " + names.get(obj) + "." + method); }
	public static Map<Object, String> names = new HashMap<Object, String>();
	public static String nameOf(Object o) { return names.get(o); }
	
	interface UseCase {
		public String getName();
		public void run();
	}

	static class StabilJegtablaraLepes implements UseCase {
		public String getName() { return "Eszkim� a szomsz�dos stabil j�gt�bl�ra l�p."; }
		public void run() {
			Eszkimo e = new Eszkimo(); names.put(e, "Eszkim�");
			Stabil_Jegtabla sj1 = new Stabil_Jegtabla(); names.put(sj1, "JelenlegiJ�gt�bla");
			Stabil_Jegtabla sj2 = new Stabil_Jegtabla(); names.put(sj2, "C�lJ�gt�bla");
			sj1.setSzomszed(1, sj2);
			sj2.setSzomszed(2, sj1);
			sj1.AddJatekos(e);
			e.lepes(1);
			names.clear();
		}
	}

	static class InstabilJegtablaraLepes implements UseCase {
		public String getName() { return "Eszkim� a szomsz�dos instabil j�gt�bl�ra l�p."; }
		public void run() {
			Eszkimo e = new Eszkimo(); names.put(e, "Eszkim�");
			Stabil_Jegtabla sj = new Stabil_Jegtabla(); names.put(sj, "JelenlegiJ�gt�bla");
			Instabil_Jegtabla isj = new Instabil_Jegtabla(); names.put(isj, "C�lJ�gt�bla");
			sj.setSzomszed(1, isj);
			isj.setSzomszed(2, sj);
			sj.AddJatekos(e);
			e.lepes(1);
		}
	}
	
	// Add further Use-Cases here
	
	static class Kilepes implements UseCase {
		public String getName() { return "Kil�p�s."; }
		public void run() {
			scanner.close();
			System.exit(0);
		}
	}
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		
		List<UseCase> useCases = new ArrayList<UseCase>();
		
		useCases.add(new StabilJegtablaraLepes());
		useCases.add(new InstabilJegtablaraLepes());
		useCases.add(new Kilepes());
		
		while(true) {
			System.out.println("V�lasszon use-case-t!\n");
			for (int i = 0; i < useCases.size(); i++) {
				System.out.println((i + 1) + " " + useCases.get(i).getName());
			}
			int selected = scanner.nextInt();
			System.out.println("\n" + useCases.get(selected - 1).getName() + "\n" + "-".repeat(50));
			useCases.get(selected - 1).run();
			System.out.println("-".repeat(50));
		}
		
	}
}
