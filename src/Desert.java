public class Desert extends Produs{

    public boolean contineColorant;

    public Desert(String denumire, double pret, int cantitate, double numarCalorii, TipProdus tip, boolean contineColorant) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.numarCalorii = numarCalorii;
        this.contineColorant = contineColorant;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public int getCantitate() {
        return cantitate;
    }

    @Override
    public double getNumarCalorii() {
        return numarCalorii;
    }

    @Override
    public TipProdus getTip() {
        return tip;
    }

    public boolean isContineColorant() {
        return contineColorant;
    }

    @Override
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public void setNumarCalorii(double numarCalorii) {
        this.numarCalorii = numarCalorii;
    }

    @Override
    public void setTip(TipProdus tip) {
        this.tip = tip;
    }

    public void setContineColorant(boolean contineColorant) {
        this.contineColorant = contineColorant;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "contineColorant=" + contineColorant +
                ", denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", numarCalorii=" + numarCalorii +
                ", tip=" + tip +
                '}';
    }
}
