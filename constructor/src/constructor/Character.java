package constructor;

public class Character {
    private String nombrepersonaje;
    private int vida;
    private int daño;
    private int costoelixir;

    public Character(String nombrepersonaje, int vida, int daño, int costoelixir) {
        this.nombrepersonaje = nombrepersonaje;
        this.vida = vida;
        this.daño = daño;
        this.costoelixir = costoelixir;


    }

    public String getNombrepersonaje() {
        return nombrepersonaje;
    }

    public void setNombrepersonaje(String nombrepersonaje) {
        this.nombrepersonaje = nombrepersonaje;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCostoelixir() {
        return costoelixir;
    }

    public void setCostoelixir(int costoelixir) {
        this.costoelixir = costoelixir;
    }
    public void moving(){

    }
}

