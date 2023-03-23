public class Mancare extends Produs{
    public int gramaj;

    public Mancare(String denumire, double pret, int cantitate, double numarCalorii, TipProdus tip, int gramaj){
        this.denumire=denumire;
        this.pret=pret;
        this.cantitate=cantitate;
        this.numarCalorii=numarCalorii;
        this.gramaj=gramaj;
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

    public int getGramaj() {
        return gramaj;
    }

    @Override
    public void setDenumire(String denumire) {
        this.denumire=denumire;
    }

    @Override
    public void setPret(double pret) {
        this.pret=pret;
    }

    @Override
    public void setCantitate(int cantitate) {
        this.cantitate=cantitate;
    }

    @Override
    public void setNumarCalorii(double numarCalorii) {
        this.numarCalorii=numarCalorii;
    }

    @Override
    public void setTip(TipProdus tip) {
        this.tip=tip;
    }

    public void setGramaj(int gramaj) {
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        return "Mancare{" +
                "gramaj=" + gramaj +
                ", denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", numarCalorii=" + numarCalorii +
                ", tip=" + tip +
                '}';
    }
}
