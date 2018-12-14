/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelDetallePeliculas;
import views.ViewDetallePeliculas;

public class ControllerDetallePeliculas {
    public ModelDetallePeliculas modelDetallePeliculas;
    public ViewDetallePeliculas viewDetallePeliculas;

    
    public ControllerDetallePeliculas(ModelDetallePeliculas modelDetallePeliculas, ViewDetallePeliculas viewDetallePeliculas) {
        this.modelDetallePeliculas = modelDetallePeliculas;
        this.viewDetallePeliculas = viewDetallePeliculas;
        initView();
    }
    public final void initView(){
        viewDetallePeliculas.Jl_id_peliculas.setText(String.valueOf(modelDetallePeliculas.getId_peliculas()));
        viewDetallePeliculas.Jl_nombre.setText(modelDetallePeliculas.getNombre());
        viewDetallePeliculas.Jl_idioma.setText(modelDetallePeliculas.getIdioma());
        viewDetallePeliculas.Jl_genero.setText(modelDetallePeliculas.getGenero());
        viewDetallePeliculas.Jl_duracion.setText(modelDetallePeliculas.getDuracion());
        viewDetallePeliculas.Jl_clasificacion.setText(modelDetallePeliculas.getClasificacion());
    }
}
