/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMain;
import views.ViewMain;

public class ControllerMain {

    private final ModelMain modelMain;
    private final ViewMain viewMain;
    
    private Object controllers[];
    
    private ControllerPeliculas controllerPeliculas;
    private ControllerDetallePeliculas controllerDetallePeliculas;

    
    public ControllerMain(ModelMain modelMain, ViewMain viewMain, Object[] controllers) {
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        this.controllers = controllers;
        setControllers();
        setActionListener();
        initComponets();
    }
    private void setControllers() {
        controllerPeliculas = (ControllerPeliculas) controllers[0];
        controllerDetallePeliculas = (ControllerDetallePeliculas) controllers[1];
    }
    private void initComponets() {
        viewMain.setTitle("Peliculas");
        viewMain.setLocationRelativeTo(null);
        viewMain.setVisible(true);
    }
    private void setActionListener() {
        viewMain.Jmi_detalle_peliculas.addActionListener(actionListener);
        viewMain.Jmi_peliculas.addActionListener(actionListener);
        viewMain.Jmi_salir.addActionListener(actionListener);
    }
    private final ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewMain.Jmi_detalle_peliculas) {
                jmi_detalle_contacto_actionPerformed();
            } else if (e.getSource() == viewMain.Jmi_peliculas) {
                jmi_agenda_actionPerformed();
            } else if (e.getSource() == viewMain.Jmi_salir) {
                jmi_salir_actionPerformed();
            }
        }
    };
    private void jmi_detalle_contacto_actionPerformed() {
        // 
        controllerDetallePeliculas.modelDetallePeliculas.setId_peliculas(controllerPeliculas.modelPeliculas.getId_peliculas());
        controllerDetallePeliculas.modelDetallePeliculas.setNombre(controllerPeliculas.modelPeliculas.getNombre());
        controllerDetallePeliculas.modelDetallePeliculas.setIdioma(controllerPeliculas.modelPeliculas.getIdioma());
        controllerDetallePeliculas.modelDetallePeliculas.setGenero(controllerPeliculas.modelPeliculas.getGenero());
        controllerDetallePeliculas.modelDetallePeliculas.setDuracion(controllerPeliculas.modelPeliculas.getDuracion());
        controllerDetallePeliculas.modelDetallePeliculas.setClasificacion(controllerPeliculas.modelPeliculas.getClasificacion());
        controllerDetallePeliculas.initView();
        
        viewMain.setContentPane(controllerDetallePeliculas.viewDetallePeliculas);
        viewMain.revalidate();
        viewMain.repaint();
    }
    private void jmi_agenda_actionPerformed() {
        viewMain.setContentPane(controllerPeliculas.viewPeliculas);
        viewMain.revalidate();
        viewMain.repaint();
    }
    
    private void jmi_salir_actionPerformed() {
        System.exit(0);
    }
}
