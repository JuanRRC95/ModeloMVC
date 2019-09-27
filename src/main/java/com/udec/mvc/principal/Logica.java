package com.udec.mvc.principal;

import com.ude.mvc.modelo.ModeloVista;
import com.udec.mvc.controlador.ControladorVista;
import com.udec.mvc.vista.vista;

/**
 * Clase Logica - instancia los objetos y deja visible la vista.
 * @author Juan Ricardo Rodriguez Campos
 */

public class Logica {
    
    /**
     * Contructor vacio de la clase.
     */
    public Logica(){
        
        ModeloVista modelo = new ModeloVista();
        vista vista = new vista();
        ControladorVista control = new ControladorVista(modelo,vista);
        control.inicio();
        vista.setVisible(true);
    }
    
}
