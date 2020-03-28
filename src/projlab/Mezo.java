package projlab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mezo {
	private int horeteg;
	private int id;
	private Map<Integer, Mezo> szomszedos_mezok = new HashMap<Integer, Mezo>();
	private Jatek jatek;
	private List<Targy> belefagyott_targyak = new ArrayList<Targy>();
	private Epitmeny epitmeny;
	protected List<Szereplo> jatekosok = new ArrayList<Szereplo>();
	
	public void jatekosFogadas(Szereplo sz) {
		Main.tabs++;
		Main.log(this, "jatekosFogadas(" + Main.nameOf(sz) +")");
		jatekosok.add(sz);
		sz.setMezo(this);
		Main.tabs--;
	}
	public void jatekosKuldes(Szereplo sz, Mezo cel) {
		Main.tabs++;
		Main.log(this, "jatekosKuldes("+ Main.nameOf(sz) +", "+ Main.nameOf(cel) +")");
		cel.jatekosFogadas(sz);
		Main.tabs--;
	}
	public void kotellelKuld(Mezo cel) {}
	public void targyAtad(Szereplo sz) {
		Main.tabs++;
		Main.log(this, "targyAtad("+ Main.nameOf(sz) + ")");
		Main.tabs--;
	}
	public void hovihar() {}
	public void hoTakarit(int i) {
		Main.tabs++;
		Main.log(this, "hoTakarit(" + i +")");
		Main.tabs--;
	}
	public int megvizsgal() {return 1;}
	public boolean ellenoriz() {return true;}
	public void igluEpit() {}
	public void tovabbad() {}
	public void setSzomszed(int irany, Mezo szomszed) {
		szomszedos_mezok.put(irany, szomszed);
	}
	
	public void addTargy(Targy t) {
		belefagyott_targyak.add(t);
	}
	
	public Mezo getSzomszed(int irany) {
		Main.tabs++;
		Main.log(this, "getSzomszed(" + irany + ") : " + Main.nameOf(szomszedos_mezok.get(irany)));
		Main.tabs--;
		return szomszedos_mezok.get(irany);
	}
	
	/* Ez a met�dus csak a skeletonhoz van, hogy an�lk�l hozz� tudjunk adni szerepl�t
	 * a mez�h�z az inicializ�l�skor, hogy a konzolra logoln�nk a jatekosFogadas() met�dussal. */
	public void AddJatekos(Szereplo sz) {
		jatekosok.add(sz);
		sz.setMezo(this);
	}
	
	
}
