package projlab;

public class Instabil_Jegtabla extends Mezo{
	private int teherbiras;
	
	public void atfordul() {
		Main.tabs++;
		Main.print("atfordul()");
		Main.tabs--;
	}
	public int megvizsgal() {return 1;}
	public void jatekosFogadas(Szereplo sz) {
		Main.tabs++;
		Main.print("jatekosFogadas()");
		while(true) {
			Main.print("�tfordul a j�gt�bla a j�t�kos fogad�sakor? (i/n)");
			String ans = Main.scanner.next();
			if (ans.equals("i")) {
				atfordul();
				break;
			} else if (ans.equals("n")) {
				break;
			}
		}
		Main.tabs--;
	}
}
