import java.util.LinkedList;

import artikal.Artikli;
import interfejs.MagacinInterfejs;

public class Magacini  implements MagacinInterfejs{

	
	LinkedList<Artikli> artikli = new LinkedList<Artikli>();

	@Override
	public void dodavanjeArtikla(Artikli a) {
		for (int i=0; i<artikli.size(); i++)
			if (artikli.contains(a))
				throw new RuntimeException("Ovaj artikal se vec nalazi u listi");
				artikli.add(a);
			
		
	}

	@Override
	public void brisanjeArtikla(Artikli a, int kolicina) {
		for (int i=0; i<artikli.size(); i++) {
			if (artikli.contains(a)) 
				a.setKolicina(a.getKolicina()-kolicina);
		
		}
	}

	@Override
	public String nadjiArtikal(int sifra) {
		String ar=null;
		
		for (int i=0; i<artikli.size(); i++) 
			if (artikli.get(i).getSifra()==sifra) {
			 ar = artikli.get(i).getNaziv();
			}			
		return ar;
	
	}
	

}
