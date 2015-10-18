package praktikum7;

public class asker {

	/**
	 * Kirjuta programm, mis küsib kasutajalt nimesid. Kui kasutaja sisestab tühja rea, lõpeb nimede küsimine ning küsitakse iga nime kohta vastava inimese vanus.
	 * Peale andmete sisestust iga inimese kohta käiv objekt "tervitab" (greet() meetodiga): "Tere, minu nimi on Mati, olen 15-aastane." Inimesed, kes on nooremad kui 3-4 aastat, tervitavad "Buu buu".
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humans h = new Humans();
		h.gatherCrowd();
		h.greet();
	}

}
