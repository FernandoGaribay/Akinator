package ArbolBinario;

import javax.swing.ImageIcon;

public class Nodo {

    private String valor;
    private ImageIcon imagenPersonaje;
    private Nodo izquierda;
    private Nodo derecha;
    private int altura;

    public Nodo() {
        this.valor = null;
        this.imagenPersonaje = null;
        this.izquierda = null;
        this.derecha = null;
        this.altura = 0;
    }

    public Nodo(String valor, ImageIcon imagenPersonaje) {
        this.valor = valor;
        this.imagenPersonaje = imagenPersonaje;
        this.izquierda = null;
        this.derecha = null;
        this.altura = 1;
    }

    public Nodo equilibrarArbolR(Nodo nodoActual) {
        if (nodoActual == null) {
            return null;
        }

        int factorBalance = calcularFactorBalance(nodoActual);

        if (factorBalance > 1) {
            if (calcularFactorBalance(nodoActual.getIzquierda()) < 0) {
                nodoActual.setIzquierda(rotacionIzquierda(nodoActual.getIzquierda()));
            }
            nodoActual = rotacionDerecha(nodoActual);
        } else if (factorBalance < -1) {
            if (calcularFactorBalance(nodoActual.getDerecha()) > 0) {
                nodoActual.setDerecha(rotacionDerecha(nodoActual.getDerecha()));
            }
            nodoActual = rotacionIzquierda(nodoActual);
        }

        nodoActual.setIzquierda(equilibrarArbolR(nodoActual.getIzquierda()));
        nodoActual.setDerecha(equilibrarArbolR(nodoActual.getDerecha()));

        return nodoActual;
    }

    private int calcularFactorBalance(Nodo nodoActual) {
        if (nodoActual == null) {
            return 0;
        }

        return calcularAltura(nodoActual.getIzquierda()) - calcularAltura(nodoActual.getDerecha());
    }

    private int calcularAltura(Nodo nodoActual) {
        if (nodoActual == null) {
            return 0;
        }

        return 1 + Math.max(calcularAltura(nodoActual.getIzquierda()), calcularAltura(nodoActual.getDerecha()));
    }

    private Nodo rotacionIzquierda(Nodo nodoActual) { // cuando un nodo tiene un factor de balance de +2
        Nodo nuevoNodoActual = nodoActual.getDerecha(); // Se obtiene el hijo derecho del nodo actual, que ahora sera el valor del nuevo nodo actual
        nodoActual.setDerecha(nuevoNodoActual.getIzquierda()); // del nodo actual se establece como nodo derecho el nodo izquierdo del nuevo nodo actual
        nuevoNodoActual.setIzquierda(nodoActual); // el nuevo nodo actuak se establece como nodo izquierdo el nodo actual
        return nuevoNodoActual;
    }

    private Nodo rotacionDerecha(Nodo nodoActual) {
        Nodo nuevoNodoActual = nodoActual.getIzquierda();
        nodoActual.setIzquierda(nuevoNodoActual.getDerecha());
        nuevoNodoActual.setDerecha(nodoActual);
        return nuevoNodoActual;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public ImageIcon getImagenPersonaje() {
        return imagenPersonaje;
    }

    public void setImagenPersonaje(ImageIcon imagenPersonaje) {
        this.imagenPersonaje = imagenPersonaje;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
}
