package ArbolBinario;

public class Nodo {

    private Object valor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo() {
        this.valor = null;
        this.izquierda = null;
        this.derecha = null;
    }

    public Nodo(Object valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nodo{");
        sb.append("valor=").append(valor);
        sb.append(", izquierda=").append(izquierda);
        sb.append(", derecha=").append(derecha);
        sb.append('}');
        return sb.toString();
    }
}
