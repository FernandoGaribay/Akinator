package ArbolBinario;

import gui.AkinatorUI;
import javax.swing.ImageIcon;

public class Akinator {

    private final AkinatorUI objAkinatorUI;
    private static Nodo raiz;

    public Akinator(AkinatorUI objAkinatorUI) {
        this.objAkinatorUI = objAkinatorUI;

        new Thread(() -> {
            iniciarJuego();
        }).start();
    }

    public void iniciarJuego() {
        objAkinatorUI.alternarPanel(true);

        objAkinatorUI.setDialogo("<html>Actualmente no conozco ningun personaje, podrias enseñarme uno?<html>");
        objAkinatorUI.AkinatorCelular();
        respuestaUsuario();
        
        String personaje = objAkinatorUI.getTexto();
        ImageIcon imagen = objAkinatorUI.getImagenPersonaje();
        if(imagen != null){
            raiz = new Nodo(personaje, imagen);
        } else{
            raiz = new Nodo(personaje, objAkinatorUI.NoIMG());
        }
        

        objAkinatorUI.setDialogo("<html>Gracias, ahora si podemos iniciar a jugar.<html>");
        objAkinatorUI.AkinatorListo();
        objAkinatorUI.alternarPanel(false);
        pausaTemp(2500);
        this.jugar();
    }

    public void jugar() {
        do {
            Nodo nodo = raiz;
            while (nodo != null) {
                if (nodo.getIzquierda() != null) {
                    objAkinatorUI.AkinatorNormal();
                    objAkinatorUI.setDialogo(String.valueOf(nodo.getValor()));
                    nodo = (respuestaUsuario()) ? nodo.getIzquierda() : nodo.getDerecha();
                } else {
                    objAkinatorUI.AkinatorConfiado();
                    objAkinatorUI.setRespuesta("<html>Tu personaje es: " + nodo.getValor() + "?<html>");
                    objAkinatorUI.mostrarPersonajeImg(nodo.getImagenPersonaje());
                    if (respuestaUsuario()) {
                        objAkinatorUI.ocultarPersonajeImg();
                        objAkinatorUI.AkinatorFeliz();
                        objAkinatorUI.setDialogo("<html>Volvi a ganar! Gracias por jugar. ( ͡❛ ͜ʖ ͡❛)✌ <html>");
                        pausaTemp(5000);
                    } else {
                        objAkinatorUI.ocultarPersonajeImg();
                        nuevoPersonaje(nodo);
                    }
                    nodo = null;
                }
            }
            objAkinatorUI.AkinatorListo();
        } while (jugarDeNuevo());
        System.exit(0);
    }

    public void nuevoPersonaje(Nodo nodo) {
        String personajeNodo = nodo.getValor();
        ImageIcon personajeImg = nodo.getImagenPersonaje();

        String[] respuestas = pedirDatos();
        Nodo nodoIzq = new Nodo(personajeNodo, personajeImg); // Personaje actual
        Nodo nodoDer = new Nodo(respuestas[0], objAkinatorUI.getImagenPersonaje()); // Nuevo Personaje

        nodo.setValor(respuestas[1]); // Caracteristica del personaje
        nodo.setImagenPersonaje(null); // Imagen del personaje

        nodo.setIzquierda(nodoDer);
        nodo.setDerecha(nodoIzq);
        raiz = this.equilibrarArbol(raiz);
    }

    public String[] pedirDatos() {
        String[] resultado = new String[2];
        objAkinatorUI.alternarPanel(true);

        objAkinatorUI.AkinatorSorprendido();
        objAkinatorUI.setDialogo("<html>No pude adivinarlo, podrias decirme cual es el personaje que pensaste?<html>");
        respuestaUsuario();
        resultado[0] = objAkinatorUI.getTexto();

        objAkinatorUI.AkinatorCelular();
        objAkinatorUI.setDialogo("<html>Cual seria una caracteristica de " + resultado[0] + "?<html>");
        respuestaUsuario();
        resultado[1] = objAkinatorUI.getTexto() + "?";

        objAkinatorUI.alternarPanel(false);
        return resultado;
    }

    public boolean jugarDeNuevo() {
        objAkinatorUI.setDialogo("Jugamos otra vez?");

        if (!respuestaUsuario()) {
            objAkinatorUI.setDialogo("Gracias por jugar!");
            pausaTemp(2000);
            return false;
        }
        return true;
    }

    public boolean respuestaUsuario() {
        boolean resp = false;
        try {
            resp = objAkinatorUI.getRespuesta();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        return resp;
    }

    public void pausaTemp(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public Nodo equilibrarArbol(Nodo raiz) {
        return raiz.equilibrarArbolR(raiz);
    }

    public static Nodo getRaiz() {
        return raiz;
    }

    public static void setRaiz(Nodo aRaiz) {
        raiz = aRaiz;
    }
}
