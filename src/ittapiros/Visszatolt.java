
package ittapiros;


public class Visszatolt {
    private int pozicio;
    private String talalt_E;
    private boolean keveres;

    public Visszatolt(String sor) {
        String[] s = sor.split(";");
        this.pozicio = Integer.parseInt(s[0]);
        this.talalt_E = s[1];
        this.keveres = Boolean.parseBoolean(s[2]);
    }

    public int getPozicio() {
        return pozicio;
    }

    public String getTalalt_E() {
        return talalt_E;
    }

    public boolean isKeveres() {
        return keveres;
    }

    public void setPozicio(int pozicio) {
        this.pozicio = pozicio;
    }

    public void setTalalt_E(String talalt_E) {
        this.talalt_E = talalt_E;
    }

    public void setKeveres(boolean keveres) {
        this.keveres = keveres;
    }
    
}
