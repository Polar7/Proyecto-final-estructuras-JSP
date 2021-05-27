package Contenedor;

import java.io.Serializable;

public class Nodo<T> implements Serializable
{
    private T dato;
    private Nodo<T> siguiente;



    public void Nodo(T dato, Nodo<T> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    //get y set atributos.

    public T getValor() {
        return dato;
    }

    public void setValor(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString()
    {
        return "Nodo{" +
                dato +
                '}';
    }
}
