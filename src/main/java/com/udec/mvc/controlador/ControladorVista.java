package com.udec.mvc.controlador;

import com.ude.mvc.modelo.ModeloVista;
import com.udec.mvc.vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase ControladorVista - Controlador de la vista
 * @author Juan Ricardo Rodriguez Campos
 */

public class ControladorVista implements ActionListener{

    /**
     * atributos
     */
    private ModeloVista modelo;
    private vista vista;

    /**
     * Contructor de la clase
     * @param modelo
     * @param vista 
     */
    public ControladorVista(ModeloVista modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.agregar.addActionListener(this);
    }
    
    /**
     * metodo que inicia la vista
     */
    public void inicio(){
        vista.setTitle("Agregar");
        vista.setLocationRelativeTo(null);
    }
    
    
    /**
     * metodo que escucha los acciones sobre la vista.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNombre(vista.caja.getText());
        vista.caja2.setListData(modelo.agregar(vista.caja.getText()));
    }
    
}
