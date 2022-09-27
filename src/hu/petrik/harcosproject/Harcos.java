package hu.petrik.harcosproject;

public class Harcos {
    //Properties
    private String nev;
    private int szint;
    private int tapasztalat;
    private int eletero;
    private int alapEletero;
    private int alapSebzés;

    //Constructor
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

    //Get-Set
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
        if (szint - this.szint == 1) {
            this.szint = szint;
        }
    }

    public int getTapasztalat() {
        return tapasztalat;
    }

    public void setTapasztalat(int tapasztalat) {
        if (tapasztalat >= getSzintlepeshez()) {
            setSzint(szint + 1);
            this.tapasztalat = tapasztalat - getSzintlepeshez();
            setEletero(getMaxEletero());
        } else {
            this.tapasztalat = tapasztalat;
        }
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
        if (eletero > getMaxEletero()) {
            this.eletero = getMaxEletero();
        } else if (eletero == 0) {
            this.tapasztalat = 0;
            this.eletero = eletero;
        } else {
            this.eletero = eletero;
        }
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

    //Other methods
    public void megkuzd(Harcos masikHarcos) {
        if (masikHarcos.nev == this.nev) {
            System.err.println("A két harcos ugyan az!");
        } else if (masikHarcos.eletero == 0 || this.eletero == 0) {
            System.err.println("Az egyik harcosnak nincs eletereje!");
        } else {
            for (int i = 0; i < this.getSebzes(); i++) {
                if (masikHarcos.getEletero() > 0) {
                    masikHarcos.setEletero(masikHarcos.eletero - 1);
                }
            }
            if (masikHarcos.eletero > 0) {
                for (int i = 0; i < masikHarcos.getSebzes(); i++) {
                    if (this.getEletero() > 0) {
                        this.setEletero(this.eletero - 1);
                    }
                }
            }
        }
        if (masikHarcos.getEletero() > 0 && this.getEletero() > 0) {
            masikHarcos.setTapasztalat(masikHarcos.tapasztalat + 5);
            this.setTapasztalat(this.tapasztalat + 5);
        } else if (masikHarcos.getEletero() == 0) {
            this.setTapasztalat(tapasztalat + 15);
        } else {
            masikHarcos.setTapasztalat(masikHarcos.tapasztalat + 15);
        }
    }

    public void gyogyul() {
        if (eletero == 0) {
            setEletero(getMaxEletero());
        } else {
            setEletero(3 + szint);
        }
    }

    //toString
    @Override
    public String toString() {
        return String.format("{%s} - LVL:{%d} - EXP:{%d}/{%d} - HP:{%d}/{%d} - DMG:{%d}",
                nev, szint, tapasztalat, getSzintlepeshez(), eletero, getMaxEletero(), getSebzes());
    }
}
