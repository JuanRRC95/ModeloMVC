package com.ude.mvc.modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;

/**
 * Clase ModeloVista - Modelo del programa
 * @author Juan Ricardo Rodriguez Campos
 */
public class ModeloVista {
    /**
     * atributos
     */
    private String nombre;
    private List<String> lista = new ArrayList<>();

    /**
     * Metodos GET Y SET 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    /**
     * metodo "agregar" que añade los elementos a la lista.
     * @param nombre
     * @return lista
     */
    public Object[] agregar(String nombre){
        this.lista.add(nombre);
        Object[] ob= this.lista.toArray();
        return ob;
    }
    
    
}
