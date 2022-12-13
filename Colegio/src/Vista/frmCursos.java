package Vista;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class frmCursos extends javax.swing.JFrame {
    private int idcurso=0;
    
    /** Constructor de carga de la ventana*/
    public frmCursos() {
        super("Registro de Cursos");
        initComponents();
        
        Listarprofesor();
        ListarCursos();

  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TxtCurso = new javax.swing.JTextField();
        TxtCodProfesor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        javax.swing.JButton Nuevo = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        TxtNombreprofesor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabLista = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        TXTBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PanelCurso = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabListacurso = new javax.swing.JTable();
        Curso = new javax.swing.JLabel();
        TXTProfesor = new javax.swing.JTextField();
        CmdProfesorRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Registro de Personas"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Curso"));

        TxtCodProfesor.setEnabled(false);

        jLabel1.setText("Curso");

        jLabel2.setText("Cod Profesor");

        Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/postcategoryicon.png"))); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        BTNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/elim.png"))); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setEnabled(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.gif"))); // NOI18N
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        TxtNombreprofesor.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtCodProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombreprofesor)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtCodProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNombreprofesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Cursos"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabLista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cursos"));

        TXTBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTBuscarKeyPressed(evt);
            }
        });

        jLabel6.setText("Nombre Curso");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        PanelCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Profesor"), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        TabListacurso.setForeground(new java.awt.Color(102, 51, 0));
        TabListacurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabListacurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabListacursoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabListacurso);

        Curso.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Curso.setForeground(new java.awt.Color(0, 102, 102));
        Curso.setText("Profesor");

        TXTProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTProfesorActionPerformed(evt);
            }
        });
        TXTProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTProfesorKeyPressed(evt);
            }
        });

        CmdProfesorRegistrar.setText("Registrar");
        CmdProfesorRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CmdProfesorRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCursoLayout = new javax.swing.GroupLayout(PanelCurso);
        PanelCurso.setLayout(PanelCursoLayout);
        PanelCursoLayout.setHorizontalGroup(
            PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCursoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelCursoLayout.createSequentialGroup()
                        .addComponent(Curso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CmdProfesorRegistrar)))
                .addContainerGap())
        );
        PanelCursoLayout.setVerticalGroup(
            PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCursoLayout.createSequentialGroup()
                .addGroup(PanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso)
                    .addComponent(TXTProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdProfesorRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Método para Registrar una curso*/
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        //Validación de campos
             
        if (this.TxtCurso.getText().length()==0){
             JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del Curso");
             TxtCurso.requestFocus();//rabFocus(); 
             return ;
        }
        if (this.TxtCodProfesor.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar El codigo del Profesor");
            TxtCodProfesor.requestFocus(); 
        return ;
        }
       
      
        Logica.ClsCurso curso=new Logica.ClsCurso();  //objeto tipo curso
        curso.idcurso=this.idcurso;
        curso.nombrecurso=this.TxtCurso.getText();
        curso.idprofesor=Integer.parseInt(this.TxtCodProfesor.getText());
        
        //Selecciona el item
        
  //Evaluamos si el usuario esta Registrando una nueva curso o esta actualizando
  if(this.idcurso==0){
       boolean respuesta=true; //bandera
       respuesta=curso.RegistrarCurso(); //ejecuta el método que registra curso
       ListarCursos(); //actualiza la tabla
       
       //lanza el aviso
       if (respuesta==false)
           { 
           JOptionPane.showMessageDialog(rootPane, "Se ha registrado correctamente");
            Limpiarcampos();
            this.BTNEliminar.setEnabled(false);
           }
       else{  JOptionPane.showMessageDialog(rootPane, "Curso No registrado"); }
         
  }
  else //actualiza los datos de la curso
  {
           boolean respuesta2=true; //bandera
            respuesta2=curso.ActualizarCurso(); //ejecuta el método que Actualiza curso
            ListarCursos(); //actualiza la tabla
       
             //lanza el aviso
             if (respuesta2==false)
               { 
                JOptionPane.showMessageDialog(rootPane, "Se ha Actualizado correctamente");
                Limpiarcampos();
                this.BTNEliminar.setEnabled(false);
               }
             else{  JOptionPane.showMessageDialog(rootPane, "No se actualizó"); }
  
   }
       
    }//GEN-LAST:event_RegistrarActionPerformed

    /** Método para seleccionar una curso para editarlo*/
    private void TabListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListaMouseClicked
       //activa los botones 
       this.Registrar.setText("Actualizar");
       this.BTNEliminar.setEnabled(true);
        
        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());
        Logica.ClsCurso curso=new Logica.ClsCurso();
        //Captura de los datos de la curso para editarlo
         this.idcurso=Integer.parseInt(TabLista.getValueAt(fila, 0).toString());
         this.TxtCurso.setText(TabLista.getValueAt(fila, 1).toString());
         this.TxtCodProfesor.setText(TabLista.getValueAt(fila, 2).toString());
         this.TxtNombreprofesor.setText(TabLista.getValueAt(fila, 3).toString());
         
         
       
         //Captura de los datos para el Radio Buton Sexo
      
    }//GEN-LAST:event_TabListaMouseClicked

    /**Método para registrar una nueva curso*/
    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.Registrar.setText("Registrar");
        this.Limpiarcampos();
        this.idcurso=0;
        this.BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_NuevoActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        // TODO add your handling code here:

        if (this.idcurso==0){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un Curso");
            return;
        }
       //Captura la confirmacion
        int confirmacion= JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar?", "Confirma la acción", 2);
                    
       if (confirmacion==0){ //evaluamos la confirmación
           boolean confirmacion2=true;
            Logica.ClsCurso curso=new Logica.ClsCurso();
            confirmacion2=curso.EliminarCurso( this.idcurso);
                if (confirmacion2==false){ //Evaluamos el resultado de la operacion
                     JOptionPane.showMessageDialog(rootPane, "Eliminación correcta");
                     Limpiarcampos();  //Limpiamos los campos
                    this.BTNEliminar.setEnabled(false); //Deshabilitamos el botón
                    this.ListarCursos(); //recargamos la lista
                }else{
                     JOptionPane.showMessageDialog(rootPane, "No se pudo Eliminar");
                }
       }    
    }//GEN-LAST:event_BTNEliminarActionPerformed

    /**  Método para buscar Personas */
    private void TXTBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTBuscarKeyPressed
      
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsCurso curso=new  Logica.ClsCurso();
                //Extraemos la lista de personas dentro de un modelo
        modelo=curso.BusquedaCursos(this.TXTBuscar.getText().trim());
        
        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
         //Oculta la primera columna
        OcultarColumnaTabla();
        
    }//GEN-LAST:event_TXTBuscarKeyPressed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_CerrarActionPerformed

    private void TabListacursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabListacursoMouseClicked
        // TODO add your handling code here:

        //Creación de una fila de JTable y captura la fila, con el evento clic
        int fila=TabLista.rowAtPoint(evt.getPoint());

        //Captura de los datos de la nota para editarlo
        this.TxtCodProfesor.setText(TabListacurso.getValueAt(fila, 0).toString());
        this.TxtNombreprofesor.setText(TabListacurso.getValueAt(fila, 1).toString());

    }//GEN-LAST:event_TabListacursoMouseClicked

    private void TXTProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTProfesorActionPerformed

    private void TXTProfesorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTProfesorKeyPressed
        // TODO add your handling code here:
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        Logica.ClsProfesor profesor=new  Logica.ClsProfesor();
        //Extraemos la lista de personas dentro de un modelo
        modelo=profesor.BusquedaProfesoresvista(this.TXTProfesor.getText().trim());

        //Asociamos el modelo al JTable
        this.TabListacurso.setModel(modelo);

        //Oculta la primera columna
        OcultarColumnaTabla();
    }//GEN-LAST:event_TXTProfesorKeyPressed

    private void CmdProfesorRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CmdProfesorRegistrarMouseClicked
        // TODO add your handling code here:
        frmProfesores f=new frmProfesores();
        f.show();
    }//GEN-LAST:event_CmdProfesorRegistrarMouseClicked

    /** Método Main*/
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater
        (new Runnable() 
                       {
                              public void run() 
                              {
                                       new frmCursos().setVisible(true);  
                              }
                     }
           );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton CmdProfesorRegistrar;
    private javax.swing.JLabel Curso;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.JPanel PanelCurso;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TXTBuscar;
    private javax.swing.JTextField TXTProfesor;
    private javax.swing.JTable TabLista;
    private javax.swing.JTable TabListacurso;
    private javax.swing.JTextField TxtCodProfesor;
    private javax.swing.JTextField TxtCurso;
    private javax.swing.JTextField TxtNombreprofesor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
 /**Métodos Auxiliares*/
    private void ListarCursos(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto curso
        Logica.ClsCurso curso=new Logica.ClsCurso();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=curso.ListarCursos();

        //Asociamos el modelo al JTable
        this.TabLista.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }

    public void Limpiarcampos(){
       this.TxtCurso.setText("");
       this.TxtCodProfesor.setText("");
       this.TxtNombreprofesor.setText("");
       
    }
    
    
    
    
    
        private void Listarprofesor(){ //Cargamos la tabla con la lista de personas
         //Creamos un objeto curso
        Logica.ClsProfesor profe=new Logica.ClsProfesor();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        //Extraemos la lista de personas dentro de un modelo
        modelo=profe.ListarProfesorvista();

        //Asociamos el modelo al JTable
        this.TabListacurso.setModel(modelo);
        
        //Oculta la primera columna
        OcultarColumnaTabla();
    }
    
    
    
    
    
    
    private  void OcultarColumnaTabla(){
            //Oculta la primera columna de la tabla
       this.TabLista.getColumnModel().getColumn(0).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(0).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(0).setPreferredWidth(0);
       
       this.TabLista.getColumnModel().getColumn(2).setMaxWidth(0);
       this.TabLista.getColumnModel().getColumn(2).setMinWidth(0);
       this.TabLista. getColumnModel().getColumn(2).setPreferredWidth(0);
    }
}
