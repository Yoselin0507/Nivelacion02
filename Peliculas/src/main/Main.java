/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelMain;
import views.ViewMain;
import controllers.ControllerMain;

import models.ModelPeliculas;
import views.ViewPeliculas;
import controllers.ControllerPeliculas;

import models.ModelDetallePeliculas;
import views.ViewDetallePeliculas;
import controllers.ControllerDetallePeliculas;
/**
 *
 * @author Zeo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelPeliculas modelAgenda = new ModelPeliculas();
        ViewPeliculas viewAgenda = new ViewPeliculas();
        ControllerPeliculas controllerAgenda = new ControllerPeliculas(modelAgenda, viewAgenda);
        
        ModelDetallePeliculas modelDetalleContacto = new ModelDetallePeliculas();
        ViewDetallePeliculas viewDetalleContacto = new ViewDetallePeliculas();
        ControllerDetallePeliculas controllerDetalleContacto = new ControllerDetallePeliculas(modelDetalleContacto, viewDetalleContacto);
        
        Object[] controllers = new Object[2];
        controllers[0] = controllerAgenda;
        controllers[1] = controllerDetalleContacto;
        
        ModelMain modelMain = new ModelMain();
        ViewMain viewMain = new ViewMain();
        ControllerMain controllerMain = new ControllerMain(modelMain, viewMain, controllers);
        
    }
    
}
