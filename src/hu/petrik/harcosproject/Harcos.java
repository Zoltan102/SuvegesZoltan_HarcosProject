package hu.petrik.harcosproject;

public class Harcos {
    private String nev;
    private int szint;
    private int tapasztalat;
    private int eletero;
    private int alapEletero;
    private int alapSebzés;

    public Harcos(String nev, int statuszSablon) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzint() {
        return szint;
    }

    public void setSzint(int szint) {
        this.szint = szint;
    }

    public int getTapasztalat() {
        return tapasztalat;
    }

    public void setTapasztalat(int tapasztalat) {
        this.tapasztalat = tapasztalat;
    }

    public int getAlapEletero() {
        return alapEletero;
    }

    public int getAlapSebzés() {
        return alapSebzés;
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getSebzes() {
        return alapSebzés;
    }

    public int getSzintlepeshez() {
        //TODO
    }

    public int getMaxEletero() {
        //TODO
    }

    public void megkuzd(Harcos masikHarcos) {
        //TODO
    }

    public void gyogyul() {
        //TODO
    }

    @Override
    public String toString() {
        return "Harcos{" +
                "nev='" + nev + '\'' +
                ", szint=" + szint +
                ", tapasztalat=" + tapasztalat +
                ", eletero=" + eletero +
                ", alapEletero=" + alapEletero +
                ", alapSebzés=" + alapSebzés +
                '}';
    }
}
