package co.edu.utp.misiontic2022.c2.cdiaz.ajedrez;

public class Casilla implements Dibujable {
    private final Color color;
    private final Integer fila;
    private final Integer columna;

    private Ficha ficha;

    public Casilla(Integer fila, Integer columna) {
        this.fila = fila;
        this.columna = columna;

        this.color = (fila + columna) % 2 == 0 ? Color.BLANCO : Color.NEGRO;
    }

    public Boolean ocupada() {
        return ficha != null;
    }

    public void ubicarFicha(Ficha ficha){
        this.ficha = ficha;
        this.ficha.setCasilla(this);
    }

    public Ficha obtenerFicha(){
        return ficha;
    }

    public void retirarFicha(){
        this.ficha = null;
    }

    @Override
    public void pintar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void posicionar(Integer x, Integer y) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "Casilla [color=" + color + ", fila=" + fila + ", columna=" + columna + "]";
    }

}
