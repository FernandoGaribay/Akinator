package ArbolBinario;

import gui.AkinatorUI;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Akinator {

    private AkinatorUI objAkinatorUI;
    private static Nodo raiz;

    public Akinator(AkinatorUI objAkinatorUI) {
        this.objAkinatorUI = objAkinatorUI;

        new Thread(() -> {
            iniciarJuego();
        }).start();
    }

    public void jugar() {
        do {
            Nodo nodo = raiz;
            while (nodo != null) {
                if (nodo.getIzquierda() != null) {
                    objAkinatorUI.setDialogo(String.valueOf(nodo.getValor()));
                    nodo = (respuestaUsuario()) ? nodo.getIzquierda() : nodo.getDerecha();
                } else {
                    objAkinatorUI.setDialogo("El personaje que pensaste es " + nodo.getValor() + "?");
                    if (respuestaUsuario()) {
                        objAkinatorUI.setDialogo("Te gane! Gracias por jugar >_<");
                        pausar(2000);
                    } else {
                        nuevoPersonaje(nodo);
                    }
                    nodo = null;
                }
            }

        } while (jugarDeNuevo());
        System.exit(0);
    }

    public void nuevoPersonaje(Nodo nodo) {
        String personajeNodo = (String) nodo.getValor();

        String[] respuestas = pedirDatos();
        Nodo nodoIzq = new Nodo(personajeNodo);
        Nodo nodoDer = new Nodo(respuestas[0]); // Nuevo Personaje
        nodo.setValor(respuestas[1]); // Caracteristica del personaje

        nodo.setIzquierda(nodoDer);
        nodo.setDerecha(nodoIzq);
    }

    public String[] pedirDatos() {
        String[] resultado = new String[2];
        objAkinatorUI.alternarPanel(true);

        objAkinatorUI.setDialogo("Cual es el personaje que pensaste?");
        respuestaUsuario();
        resultado[0] = objAkinatorUI.getTexto();
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
            pausar(2500);
            return false;
        }
        return true;
    }

    public void iniciarJuego() {
        objAkinatorUI.alternarPanel(true);

        objAkinatorUI.setDialogo("<html>Actualmente no conosco ningun personaje, podrias enseñarme uno?<html>");
        respuestaUsuario();
        raiz = new Nodo(objAkinatorUI.getTexto());

        objAkinatorUI.setDialogo("<html>Gracias, ahora si podemos iniciar a jugar.<html>");
        respuestaUsuario();
        objAkinatorUI.alternarPanel(false);
        this.jugar();
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

    public void pausar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException ex) {
            Logger.getLogger(Akinator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
