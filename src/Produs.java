public abstract class Produs {
    public String denumire;
    public double pret;
    public int cantitate;
    public double numarCalorii;
    public TipProdus tip;

    public abstract String getDenumire();
    public abstract double getPret();
    public abstract int getCantitate();
    public abstract double getNumarCalorii();
    public abstract TipProdus getTip();

    public abstract void setDenumire(String denumire);
    public abstract void setPret(double pret);
    public abstract void setCantitate(int cantitate);
    public abstract void setNumarCalorii(double numarCalorii);
    public abstract void setTip(TipProdus tip);
}
