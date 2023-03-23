import static java.lang.Double.MAX_VALUE;

public class Comanda {

    public int numarComanda;
    public final int NUMAR_MAXIM_PRODUSE = 10;
    public Produs listaDeProduse[] = new Produs[NUMAR_MAXIM_PRODUSE];
    public int numarProduse = 0;

    public Comanda(int numarComanda) {
        this.numarComanda = numarComanda;
    }

    public int getNumarComanda() {
        return numarComanda;
    }

    public void setNumarComanda(int numarComanda) {
        this.numarComanda = numarComanda;
    }

    public Produs[] getListaDeProduse() {
        return listaDeProduse;
    }

    public void setListaDeProduse(Produs[] listaDeProduse) {
        this.listaDeProduse = listaDeProduse;
    }

    public int getNumarProduse() {
        return numarProduse;
    }

    public void setNumarProduse(int numarProduse) {
        this.numarProduse = numarProduse;
    }

    public void adaugaProdus(Produs produsAdaugare) {
        if (numarProduse < NUMAR_MAXIM_PRODUSE) {
            listaDeProduse[numarProduse] = produsAdaugare;
            numarProduse++;
            System.out.println("\nAti adaugat produsul: " + produsAdaugare.getDenumire() + " in comanda!\n");
        } else System.out.println("\nAti atins numarul maxim de produse adaugate in cos!\n");
    }

    public boolean gasesteProdus(Produs produsGasire) {
        for (Produs i : listaDeProduse) {
            if (i == produsGasire) {
                System.out.println("\nProdusul cautat de dumneavoastra se afla in cos!\n");
                return true;
            }
        }
        System.out.println("\nProdusul cautat de dumneavoastra se NU afla in cos!\n");
        return false;
    }

    public void stergeProdus(Produs produsStergere) {
        if (gasesteProdus(produsStergere)) {
            for (int i = 0; i < numarProduse; i++) {
                if (listaDeProduse[i] == produsStergere) {
                    for (int j = i; j < numarProduse; j++) {
                        listaDeProduse[j] = listaDeProduse[j + 1];
                    }
                    numarProduse--;
                    System.out.println("\nAti sters produsul '" + produsStergere.getDenumire() + "' din comanda!\n");
                }
            }
        } else System.out.println("\nProdusul nu se gaseste in comanda!\n");
    }

    public void afiseazaToateProdusele() {
        System.out.println("---------------Produse din comanda dvs.---------------");
        for (int i = 0; i < numarProduse; i++) {
//            System.out.println(listaDeProduse[i].getDenumire() + "\t" + listaDeProduse[i].getPret() + "\t" + listaDeProduse[i].getCantitate() + "\t" + listaDeProduse[i].getNumarCalorii() + "\t" + listaDeProduse[i].getTip());
            System.out.println(listaDeProduse[i].denumire + "\t" + listaDeProduse[i].pret + "\t" + listaDeProduse[i].cantitate + "\t" + listaDeProduse[i].numarCalorii);
        }
    }

    public double calculeazaValoareaBauturilor() {
        double sum = 0;
        for (int i = 0; i < numarProduse; i++) {
            if (listaDeProduse[i] instanceof Bautura) {
                sum = sum + (listaDeProduse[i].pret * listaDeProduse[i].cantitate);
            }
        }
        return sum;
    }

    public int numaraDeserturiColorate() {
        int nr = 0;
        for (int i = 0; i < numarProduse; i++) {
            if (listaDeProduse[i] instanceof Desert) {
                if (((Desert) listaDeProduse[i]).contineColorant == true)
                    nr++;
            }
        }
        return nr;
    }

    public double totalComanda() {
        double pret = 0;
        for (int i = 0; i < numarProduse; i++) {
            pret += listaDeProduse[i].pret * listaDeProduse[i].cantitate;
        }
        return pret;
    }

    public Produs gasesteProdusDieta() {
        Produs min = null;
        double minim = MAX_VALUE;
        for (int i = 0; i < numarProduse; i++) {
            if (listaDeProduse[i].numarCalorii < minim) {
                min = listaDeProduse[i];
                minim = listaDeProduse[i].numarCalorii;
            }
        }
        return min;
    }

    public void sortareProduseCalorice() {
        for (int i = 0; i < numarProduse - 1; i++) {
            for (int j = i + 1; j < numarProduse; j++) {
                if (listaDeProduse[j].numarCalorii < listaDeProduse[i].numarCalorii) {
                    double aux = listaDeProduse[i].numarCalorii;
                    listaDeProduse[i].numarCalorii = listaDeProduse[j].numarCalorii;
                    listaDeProduse[j].numarCalorii = aux;
                }
            }
        }
    }
}
