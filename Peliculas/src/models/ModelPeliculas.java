/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelPeliculas {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;

    private int id_peliculas;
    private String nombre;
    private String idioma;
    private String genero;
    private String duracion;
    private String clasificacion;

    /////////////////////////////
    private String descicion = "";
    ////////////////////////////

    public int getId_peliculas() {
        return id_peliculas;
    }

    public void setId_peliculas(int id_peliculas) {
        this.id_peliculas = id_peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    

    public String getDescicion() {
        return descicion;
    }

    public void setDescicion(String descicion) {
        this.descicion = descicion;
    }

    /**
     * Método que realiza las siguietnes acciones: 1- Conecta con la base
     * agenda_mvc, 2- Consulta todo los registros de la tabla contactos, 3-
     * Obtiene el nombre y el email y los guarda en las variables globales
     * nombre y email.
     */
    public Connection conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/peliculas", "root", "");
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM peliculas");
            rs.next();

            setValues(); //Atrae los valores obtenidos de la consulta y los guarda en las variables
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Model_Agenda 001: " + ex.getMessage());
        }
        return conexion;
    }

    /**
     * Lee los valores del registro seleccionado y los asigna a las variables
     * miembre nombre y email.
     */
    public void setValues() {
        try {
            id_peliculas = rs.getInt("id_peliculas");
            nombre = rs.getString("nombre");
            idioma = rs.getString("idioma");
            genero = rs.getString("genero");
            duracion = rs.getString("duracion");
            clasificacion = rs.getString("clasificacion");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error model 002: " + err.getMessage());

        }
    }

    /**
     * Método que realiza las siguiente acciones: 1.- Moverse al primer registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverPrimerRegistro() {
        System.out.println("moverPrimerRegistro");
        try {
            if (rs.isFirst() == false) {
                rs.first();
                setValues();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Model 003: " + ex.getMessage());
        }
    }

    /**
     * Método que realiza las siguiente acciones: 1.- Moverse al siguiente
     * registro 2.- obtener el valor del nombre de rs y guardarlo en la variable
     * nombre 3.- obtener el valor del email de rs y guardarlo en la variable
     * email
     */
    public void moverSiguienteRegistro() {
        System.out.println("moverSiguienteRegistro");
        try {
            if (rs.isLast() == false) {
                rs.next();
                setValues();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Model 004" + ex.getMessage());
        }
    }

    /**
     * Método que realiza las siguiente acciones: 1.- Moverse al anterior
     * registro 2.- obtener el valor del nombre de rs y guardarlo en la variable
     * nombre 3.- obtener el valor del email de rs y guardarlo en la variable
     * email
     */
    public void moverAnteriorRegistro() {
        System.out.println("moverAnteriorRegistro");
        try {
            if (rs.isFirst() == false) {
                rs.previous();
                setValues();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Model 005" + ex.getMessage());
        }
    }

    /**
     * Método que realiza las siguiente acciones: 1.- Moverse al ultimo registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la ariable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverUltimoRegistro() {
        System.out.println("moverUltimoRegistro");
        try {
            if (rs.isLast() == false) {
                rs.last();
                setValues();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Model 006" + ex.getMessage());
        }

    }

    public void consultaPeliculas() {
        try {
            conexion = conectarDB();
            ps = conexion.prepareStatement("Select * from peliculas");
            rs = ps.executeQuery();
            rs.next();

            setValues();
            System.out.println("Consulta realizada!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Consulta 007 " + ex.getMessage());
        }
    }
    public void insertarRegistro(String nombre, String idioma, String genero , String duracion, String clasificacion, int id_peliculas) {
        if (this.getDescicion() == "nuevo") {
            try {
                System.out.println("Insertar nuevo registro");
                Connection con = null;
                con = conectarDB();
                ps = con.prepareStatement("Insert into peliculas (nombre,idioma, genero, duracion, clasificacion) values (?,?,?,?,?)");
                ps.setString(1, nombre);
                ps.setString(2, idioma);
                ps.setString(3, genero);
                ps.setString(4, duracion);
                ps.setString(5, clasificacion);
                int res = ps.executeUpdate();
                consultaPeliculas();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Registro guardado Exitosamente!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar registro");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Model 006" + ex.getMessage());
            }
        } else if (this.getDescicion() == "editar") {
            try {
                System.out.println("Actualizar registro");
                Connection con = null;
                con = conectarDB();
                ps = con.prepareStatement("Update peliculas set nombre=?, idioma=?, genero=?, duracion=?, clasificacion=? Where id_peliculas=?");
                ps.setString(1, nombre);
                ps.setString(2, idioma);
                ps.setString(3, genero);
                ps.setString(4, duracion);
                ps.setString(5, clasificacion);
                int res = ps.executeUpdate();
                consultaPeliculas();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Registro actualizado Exitosamente!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar registro");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Model 006" + ex.getMessage());
            }
        }
    }
  
    public void borrarRegistro(int id_peliculas) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            try {
                System.out.println("Elimina un registro");
                Connection con = null;
                con = conectarDB();
                ps = con.prepareStatement("Delete from peliculas where id_peliculas=?");
                ps.setInt(1, id_peliculas);
                int res = ps.executeUpdate();
                consultaPeliculas();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado Exitosamente!!");

                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar registro");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error Model 007" + ex.getMessage());
            }
        }else
            JOptionPane.showMessageDialog(null, "Accion Cancelada!!");
    }
}
