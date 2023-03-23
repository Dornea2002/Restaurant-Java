public class Restaurant {
    public static void main(String[] args) {

        Mancare mancare1 = new Mancare("Piure de cartofi cu snitel de pui", 12.55, 7, 230.8, TipProdus.MANCARE, 550);
        Mancare mancare2 = new Mancare("Ciorba de burta", 14.30, 5, 140.57, TipProdus.MANCARE, 420);
        Mancare mancare3 = new Mancare("Cartofi prajiti si piept de pui", 15.60, 9, 532.19, TipProdus.MANCARE, 475);

        Desert desert1 = new Desert("Tiramisu", 12, 4, 302.66, TipProdus.DESERT, false);
        Desert desert2 = new Desert("Tort", 65.43, 6, 786, TipProdus.DESERT, true);
        Desert desert3 = new Desert("Cremes", 14.22, 2, 123, TipProdus.DESERT, false);

        Bautura bautura1 = new Bautura("Coca-Cola", 6.78, 18, 57.98, TipProdus.BAUTURA, 0);
        Bautura bautura2 = new Bautura("Bere", 15.99, 25, 33.4, TipProdus.BAUTURA, 10);
        Bautura bautura3 = new Bautura("Vin", 15.99, 14, 65.21, TipProdus.BAUTURA, 50);

        Comanda comanda=new Comanda(1);

        comanda.adaugaProdus(mancare1);
        comanda.adaugaProdus(mancare2);
        comanda.adaugaProdus(mancare3);

        comanda.adaugaProdus(desert1);
        comanda.adaugaProdus(desert2);
        comanda.adaugaProdus(desert3);

        comanda.adaugaProdus(bautura1);
        comanda.adaugaProdus(bautura2);
        comanda.adaugaProdus(bautura3);

        comanda.gasesteProdus(bautura1);

        comanda.afiseazaToateProdusele();

        comanda.stergeProdus(desert1);

        comanda.afiseazaToateProdusele();

        System.out.println("\nValoarea bauturilor: " + comanda.calculeazaValoareaBauturilor());

        System.out.println("\nNumar deserturi colorate: " + comanda.numaraDeserturiColorate());

        System.out.println("\nTotal comanda: " + comanda.totalComanda());

        System.out.println("\nProdus dieta: " + comanda.gasesteProdusDieta());

        comanda.sortareProduseCalorice();

        System.out.println("\nProduse sortate crescator in functie de kcal:");

        comanda.afiseazaToateProdusele();
    }
}
