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
        this.szint = 1;
        this.tapasztalat = 0;
        switch (statuszSablon) {
            case 1:
                this.alapEletero = 15;
                this.alapSebzés = 3;
                break;
            case 2:
                this.alapEletero = 12;
                this.alapSebzés = 4;
                break;
            case 3:
                this.alapEletero = 8;
                this.alapSebzés = 5;
                break;
        }
        this.eletero = getMaxEletero();
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
        return alapSebzés + szint;
    }

    public int getSzintlepeshez() {
        return 10 + (szint * 5);
    }

    public int getMaxEletero() {
        return alapEletero + (szint * 3);
    }

    public void megkuzd(Harcos masikHarcos) {
        //TODO
    }

    public void gyogyul() {
        //TODO
    }

    @Override
    public String toString() {
        return String.format("{%s} - LVL:{%d} - EXP:{%d}/{%d} - HP:{%d}/{%d} - DMG:{%d}",
                nev, szint, tapasztalat, getSzintlepeshez(), eletero, getMaxEletero(), getSebzes());
    }
}
