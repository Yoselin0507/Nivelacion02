/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Zeo
 */
public class ViewDetallePeliculas extends javax.swing.JPanel {

    /**
     * Creates new form ViewAcercaDe
     */
    public ViewDetallePeliculas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jl_nombre = new javax.swing.JLabel();
        Jl_idioma = new javax.swing.JLabel();
        Jl_genero = new javax.swing.JLabel();
        Jl_id_peliculas = new javax.swing.JLabel();
        Jl_clasificacion = new javax.swing.JLabel();
        Jl_duracion = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        Jl_nombre.setBackground(new java.awt.Color(255, 255, 255));
        Jl_nombre.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        Jl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_nombre.setText("NOMBRE");

        Jl_idioma.setBackground(new java.awt.Color(255, 255, 255));
        Jl_idioma.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        Jl_idioma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_idioma.setText("IDIOMA");

        Jl_genero.setBackground(new java.awt.Color(255, 255, 255));
        Jl_genero.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        Jl_genero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_genero.setText("GENERO");

        Jl_id_peliculas.setBackground(new java.awt.Color(255, 255, 255));
        Jl_id_peliculas.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        Jl_id_peliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_id_peliculas.setText("ID PELICULA");

        Jl_clasificacion.setBackground(new java.awt.Color(255, 255, 255));
        Jl_clasificacion.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        Jl_clasificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_clasificacion.setText("CLASIFICACION");

        Jl_duracion.setBackground(new java.awt.Color(255, 255, 255));
        Jl_duracion.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        Jl_duracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jl_duracion.setText("DURACION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jl_idioma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addComponent(Jl_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jl_genero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Jl_id_peliculas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Jl_duracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Jl_clasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jl_id_peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jl_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Jl_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jl_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Jl_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Jl_clasificacion;
    public javax.swing.JLabel Jl_duracion;
    public javax.swing.JLabel Jl_genero;
    public javax.swing.JLabel Jl_id_peliculas;
    public javax.swing.JLabel Jl_idioma;
    public javax.swing.JLabel Jl_nombre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}