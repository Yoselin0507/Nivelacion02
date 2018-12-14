/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelPeliculas;
import views.ViewPeliculas;

/**
 *
 * @author Salvador Hernandez Mendoza //Clonacion y trabajo sobre el
 */
public class ControllerPeliculas {

    public ModelPeliculas modelPeliculas;
    public ViewPeliculas viewPeliculas;

    /**
     * Objeto de tipo ActionListener para atrapar los eventos actionPerformed y
     * llamar a los metodos para ver los registros almacenados en la bd.
     */
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewPeliculas.jbtn_primero) {
                Jbtn_primero_actionPerformed();
            } else if (e.getSource() == viewPeliculas.jbtn_anterior) {
                Jbtn_anterior_actionPerformed();
            } else if (e.getSource() == viewPeliculas.jbtn_siguiente) {
                Jbtn_siguiente_actionPerformed();
            } else if (e.getSource() == viewPeliculas.jbtn_ultimo) {
                Jbtn_ultimo_actionPerformed();
            }
            /////////////////////////////////////////////////////////
            else if (e.getSource() == viewPeliculas.Jb_nuevo) {
                Jb_nuevo_actionPerformed();
            }else if (e.getSource() == viewPeliculas.Jb_modificar) {
                Jb_modificar_actionPerformed();
            }else if (e.getSource() == viewPeliculas.Jb_insertar) {
                Jb_insertar_actionPerformed();
            }else if (e.getSource() == viewPeliculas.Jb_eliminar) {
                Jb_eliminar_actionPerformed();
            }

        }

    };

    
    public ControllerPeliculas(ModelPeliculas modelPeliculas, ViewPeliculas viewPeliculas) {
        this.modelPeliculas = modelPeliculas;
        this.viewPeliculas = viewPeliculas;
        setActionListener();
        initDB();
    }
    private void initDB() {
        modelPeliculas.conectarDB();
        viewPeliculas.Jtf_id_peliculas.setText(String.valueOf(modelPeliculas.getId_peliculas()));
        viewPeliculas.Jtf_nombre.setText(modelPeliculas.getNombre());
        viewPeliculas.Jtf_idioma.setText(modelPeliculas.getIdioma());
        viewPeliculas.Jtf_genero.setText(modelPeliculas.getGenero());
        viewPeliculas.Jtf_duracion.setText(modelPeliculas.getDuracion());
        viewPeliculas.Jtf_clasificacion.setText(modelPeliculas.getClasificacion());
        habilitarCajas(false);
        habilitarDesplazamiento(true);
        //## No es visible, pero se utilizara para el crud ##//
        viewPeliculas.Jtf_id_peliculas.setVisible(false);
        viewPeliculas.Jtf_id_peliculas.setEnabled(false);
        
        viewPeliculas.Jb_eliminar.setEnabled(true);
        viewPeliculas.Jb_nuevo.setEnabled(true);
        viewPeliculas.Jb_modificar.setEnabled(true);
        viewPeliculas.Jb_insertar.setEnabled(false);
        
    }
    private void habilitarCajas(boolean descicion){
        viewPeliculas.Jtf_nombre.setEditable(descicion);
        viewPeliculas.Jtf_idioma.setEditable(descicion);
        viewPeliculas.Jtf_genero.setEditable(descicion);
        viewPeliculas.Jtf_duracion.setEditable(descicion);
        viewPeliculas.Jtf_clasificacion.setEditable(descicion);
    }
    
    private void habilitarDesplazamiento(boolean descicion){
        viewPeliculas.jbtn_primero.setEnabled(descicion);
        viewPeliculas.jbtn_anterior.setEnabled(descicion);
        viewPeliculas.jbtn_siguiente.setEnabled(descicion);
        viewPeliculas.jbtn_ultimo.setEnabled(descicion);
    }
    private void setActionListener() {
        viewPeliculas.jbtn_primero.addActionListener(actionListener);
        viewPeliculas.jbtn_anterior.addActionListener(actionListener);
        viewPeliculas.jbtn_siguiente.addActionListener(actionListener);
        viewPeliculas.jbtn_ultimo.addActionListener(actionListener);
        
        viewPeliculas.Jb_nuevo.addActionListener(actionListener);
        viewPeliculas.Jb_modificar.addActionListener(actionListener);
        viewPeliculas.Jb_insertar.addActionListener(actionListener);
        viewPeliculas.Jb_eliminar.addActionListener(actionListener);
    }
    private void Jbtn_primero_actionPerformed() {
        System.out.println("Action del boton jbtn_primero");
        modelPeliculas.moverPrimerRegistro();
        setValues();
    }

    
    private void Jbtn_anterior_actionPerformed() {
        System.out.println("Action del boton jbtn_anterior");
        modelPeliculas.moverAnteriorRegistro();
        setValues();
    }

    
    private void Jbtn_ultimo_actionPerformed() {
        System.out.println("Action del boton jbtn_ultimo");
        modelPeliculas.moverUltimoRegistro();
        setValues();
    }
    private void Jbtn_siguiente_actionPerformed() {
        System.out.println("Action del boton jbtn_siguiente");
        modelPeliculas.moverSiguienteRegistro();
        setValues();
    }

    private void setValues() {
        viewPeliculas.Jtf_id_peliculas.setText(String.valueOf(modelPeliculas.getId_peliculas()));
        viewPeliculas.Jtf_nombre.setText(modelPeliculas.getNombre());
        viewPeliculas.Jtf_idioma.setText(modelPeliculas.getIdioma());
        viewPeliculas.Jtf_genero.setText(modelPeliculas.getGenero());
        viewPeliculas.Jtf_duracion.setText(modelPeliculas.getDuracion());
        viewPeliculas.Jtf_clasificacion.setText(modelPeliculas.getClasificacion());
    }
    private void Jb_nuevo_actionPerformed(){
        System.err.println("Action del boton nuevo");
        habilitarCajas(true);
        habilitarDesplazamiento(false);
        modelPeliculas.setDescicion("nuevo");
        //modelAgenda.nuevoRegistro();
        viewPeliculas.Jtf_nombre.setText("");
        viewPeliculas.Jtf_idioma.setText("");
        viewPeliculas.Jtf_genero.setText("");
        viewPeliculas.Jtf_duracion.setText("");
        viewPeliculas.Jtf_clasificacion.setText("");
        viewPeliculas.Jb_eliminar.setEnabled(false);
        viewPeliculas.Jb_nuevo.setEnabled(false);
        viewPeliculas.Jb_modificar.setEnabled(false);
        viewPeliculas.Jb_insertar.setEnabled(true);
        
    }
    public void Jb_insertar_actionPerformed() {
        System.err.println("Action del boton jb_insertar");
        modelPeliculas.insertarRegistro(viewPeliculas.Jtf_nombre.getText(), viewPeliculas.Jtf_idioma.getText(), viewPeliculas.Jtf_genero.getText(), viewPeliculas.Jtf_duracion.getText(), viewPeliculas.Jtf_clasificacion.getText(), Integer.parseInt(viewPeliculas.Jtf_id_peliculas.getText()));
        habilitarDesplazamiento(true);
        habilitarCajas(false);
        viewPeliculas.Jb_eliminar.setEnabled(true);
        viewPeliculas.Jb_nuevo.setEnabled(true);
        viewPeliculas.Jb_modificar.setEnabled(true);
        viewPeliculas.Jb_insertar.setEnabled(false);
    }
    private void Jb_eliminar_actionPerformed(){
        System.err.println("Action del boton jb_eliminar");
        modelPeliculas.borrarRegistro(Integer.parseInt(viewPeliculas.Jtf_id_peliculas.getText()));
        Jbtn_ultimo_actionPerformed();
    }
    public void Jb_modificar_actionPerformed() {
        System.err.println("Action del boton jb_modificar");
        modelPeliculas.setDescicion("editar");
        habilitarCajas(true);
        habilitarDesplazamiento(true);
        viewPeliculas.Jb_eliminar.setEnabled(false);
        viewPeliculas.Jb_nuevo.setEnabled(false);
        viewPeliculas.Jb_modificar.setEnabled(false);
        viewPeliculas.Jb_insertar.setEnabled(true);
     }
}