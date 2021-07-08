package co.edu.utp.misiontic2022.c2.cdiaz.ajedrez;

public class Tablero implements Dibujable {

    private Casilla[] casillas;

    public Tablero() { // __init__()
        casillas = new Casilla[64];
        for (int i = 0; i < casillas.length; i++) {
            casillas[i] = new Casilla(i / 8,  i % 8);

            System.out.println(i + ": " + casillas[i]);
        }
    }

    public void ubicarFicha(Integer fila, Integer columna, Ficha ficha){
        casillas[8 * fila + columna].ubicarFicha(ficha);
    }

    public Boolean enroque() {
        return null;
    }

    public Boolean jaque() {
        return null;
    }

    public Boolean jaqueMate() {
        return null;
    }

    @Override
    public void pintar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void posicionar(Integer x, Integer y) {
        // TODO Auto-generated method stub

    }

}
