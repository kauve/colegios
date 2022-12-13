package Datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClsCurso {
   public int idcurso;
   public String nombrecurso;
   public int idprofesor;

   public ClsCurso(){
   }
   
public boolean RegistrarCurso(){
     boolean respuesta=true;
    try {
          this.idcurso=GenerarIDCurso();
          operaciones consulta=new operaciones();
          respuesta=consulta.InsercionBase("insert into curso values ( '" + this.idcurso +"','"+this.nombrecurso +"','"+this.idprofesor+"')"); //     
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

public boolean ActualizarCurso(){
     boolean respuesta=true;
    try {

          operaciones consulta=new operaciones();
          respuesta=consulta.ActualizacionBase("UPDATE curso set Nombrecurso='" + this.nombrecurso+"',Idprofesor='"+this.idprofesor+"' where  IdCurso="+this.idcurso+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

public boolean EliminarCurso(int idCurso){
     boolean respuesta=true;
    try {

          operaciones consulta=new operaciones();
          respuesta=consulta.ActualizacionBase("delete from curso where Idcurso="+idCurso+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

   public static int GenerarIDCurso(){
    int IDGenerado=0;
    
    try {
            operaciones consulta=new operaciones();
            ResultSet resultado=consulta.ConsultaBase("select max(Idcurso) as id from curso");
            while (resultado.next()){
                System.out.println(resultado.getInt("id"));
                IDGenerado=resultado.getInt("id");
            }
            consulta.getStmt().close(); 
        } catch (SQLException ex) {
             System.out.println(ex);
        }
    
    return IDGenerado+1;
   }
   
   public TableModel ListarCurso(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             operaciones consulta=new operaciones();
             ResultSet resultado=consulta.ConsultaBase("select c.Idcurso,c.Nombrecurso,p.Idprofesor,p.Nombres,p.Apellidos from curso c,profesor p where c.Idprofesor=p.Idprofesor");
             ResultSetMetaData Columnas = resultado.getMetaData();
             int cantidadColumnas = Columnas.getColumnCount();
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i));
             }
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila);
                }
                consulta.getStmt().close();
                return modelo; 
        }
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   
   public TableModel BusquedaCurso(String Nombrecurso){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             operaciones consulta=new operaciones();
             ResultSet resultado=consulta.ConsultaBase("select c.Idcurso,c.Nombrecurso,p.Idprofesor,p.Nombres,p.Apellidos from curso c,profesor p where c.Idprofesor=p.Idprofesor and Nombrecurso like '" +Nombrecurso +"%'"); 
             ResultSetMetaData Columnas = resultado.getMetaData();
             int cantidadColumnas = Columnas.getColumnCount();
             
             for (int i = 1; i <= cantidadColumnas; i++) {
                    modelo.addColumn(Columnas.getColumnLabel(i));
             }
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addRow(fila);
                }
                consulta.getStmt().close();
                return modelo; 
        }
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
 
   public ComboBoxModel ListarNombrecurso(){
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        try {
             operaciones consulta=new operaciones();
             ResultSet resultado=consulta.ConsultaBase("select * from curso"); 
            
             ResultSetMetaData Columnas = resultado.getMetaData();
             int cantidadColumnas = Columnas.getColumnCount();
                while (resultado.next()) {
                       Object[] fila = new Object[cantidadColumnas];
                        for (int i = 0; i < cantidadColumnas; i++) {
                                 fila[i]=resultado.getObject(i+1);
                        }
                 modelo.addElement(fila);
                }
                consulta.getStmt().close();
                return modelo; 
        }
        
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }   
   
   
}

