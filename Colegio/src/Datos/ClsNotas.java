package Datos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClsNotas {
   public int idnota;
   public int idcurso;
   public int idalumno;
   public String unidad;
   public int promedio;
   
   public ClsNotas(){
   }
   
public boolean RegistrarNota(){
     boolean respuesta=true;
    try {
          this.idnota=GenerarIDNota();
          operaciones consulta=new operaciones();
          respuesta=consulta.InsercionBase("insert into notas values ( '" + this.idnota +"','"+this.idcurso +"','"+this.idalumno+"','"+this.unidad+"','"+this.promedio+"')"); //     
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

public boolean ActualizarNota(){
     boolean respuesta=true;
    try {

          operaciones consulta=new operaciones();
          respuesta=consulta.ActualizacionBase("UPDATE notas set Idcurso='" + this.idcurso+"',Idalumno='"+this.idalumno+"',Unidad='"+this.unidad+"',Promedio='"+this.promedio+"' where  IdNota="+this.idnota+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

public boolean EliminarNota(int idNota){
     boolean respuesta=true;
    try {
          operaciones consulta=new operaciones();
          respuesta=consulta.ActualizacionBase("delete from notas where Idnota="+idNota+"");    
          consulta.getStmt().close(); 
        } catch (SQLException ex) {
               System.out.println(ex);
        }
    return respuesta;
}

   public static int GenerarIDNota(){
    int IDGenerado=0;
    
    try {
            operaciones consulta=new operaciones();
            ResultSet resultado=consulta.ConsultaBase("select max(Idnota) as id from notas");
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
   
   public TableModel ListarNota(){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             operaciones consulta=new operaciones();
             ResultSet resultado=consulta.ConsultaBase("select n.Idnota,n.Idcurso,c.Nombrecurso,n.Idalumno,a.Nombres,a.Apellidos,n.Promedio,n.Unidad from notas n,alumno a,curso c where n.Idcurso=c.Idcurso and n.Idalumno=a.Idalumno");
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
   
   public TableModel BusquedaNota(String UnidadNota){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
             operaciones consulta=new operaciones();
             ResultSet resultado=consulta.ConsultaBase("select n.Idnota,n.Idcurso,c.Nombrecurso,n.Idalumno,a.Nombres,"
                     + "a.Apellidos,n.Promedio,n.Unidad from notas n,alumno a,curso c where n.Idcurso=c.Idcurso and n.Idalumno=a.Idalumno and a.Apellidos like '" +UnidadNota +"%'");
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
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }
   public ComboBoxModel ListarUnidadNota(){
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        try {
             operaciones consulta=new operaciones();
             ResultSet resultado=consulta.ConsultaBase("select * from notas");
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
        //
        catch (SQLException ex) {
             System.out.println(ex);
        }
    return modelo;
  }   
   
   
}

