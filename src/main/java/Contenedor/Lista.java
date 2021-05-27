package Contenedor;
import java.io.Serializable;

public class Lista<T> implements Serializable
{
    private Nodo<T> inicio;

    private int tamanio;

    /**
     * Constructor
     */
    public void Lista()
    {
        inicio = null;
        tamanio = 0;
    }


    /**
     * Consulta si la lista esta vacia.
     * @return True si está vacia, false de lo contrario
     */
    public boolean esVacia()
    {
        return inicio == null;
    }




    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     * @return Total de elementos en la lista
     */
    public int getTamanio()
    {
        return tamanio;
    }



    /**
     * Agrega un nuevo nodo al final de la lista.
     * @param dato Dato para crear un nodo a agregar
     */
    public void agregarAlFinal(T dato)
    {
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(dato);
        if (esVacia())
        {
            inicio = nuevo;
        }
        else
        {
            // Crea ua copia de la lista.
            Nodo<T> aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null)
            {
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }


    /**
     * Retorna el valor (data) de la posicion especificada
     * @param posicion Posicion del nodo
     * @return El valor del nodo
     */
    public T getValor(int posicion)
    {
        if (posicion == 0)
        {
            return inicio.getValor();
        }
        else
        {
            Nodo<T> aux = inicio;
            for (int i = 0; i < posicion; i++)
            {
                aux = aux.getSiguiente();
            }
            return aux.getValor();
        }
    }
}