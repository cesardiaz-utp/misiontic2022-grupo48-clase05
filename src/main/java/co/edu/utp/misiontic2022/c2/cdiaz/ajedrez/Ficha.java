package co.edu.utp.misiontic2022.c2.cdiaz.ajedrez;

public abstract class Ficha implements Dibujable, ElementoMovil {
    private final Color color;

    private Casilla casilla;

    public Ficha(Color color){
        this.color = color;
    }

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }

    public Boolean capturar() {
        // Si en la casilla a la que se mueve se encuentra una ficha del contrincante,
        // entonces captura la ficha

        return null;
    }

    @Override
    public String toString() {
        return "Ficha [color=" + color + "]";
    }

    

}
