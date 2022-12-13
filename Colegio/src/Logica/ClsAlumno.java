package Logica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClsAlumno {
   public int idalumno;
   public String apellidos;
   public String nombres;
   public String fechaNacimiento;
   public String fecha;
   public String sexo;
   public String direccion;
   public String telefono;
   public String email;
   public String password;
   public String grado;
   public String seccion;
   //Constructor
   public ClsAlumno(){
   }
   
   /**Lógica-Método para Registrar Persona*/
public boolean RegistrarAlumno(){
     boolean respuesta=true;
     
    try {
         Datos.ClsAlumno alumno=new Datos.ClsAlumno();
         alumno.idalumno=this.idalumno;
         alumno.apellidos=this.apellidos;
         alumno.nombres=this.nombres;
         alumno.fechaNacimiento=this.fechaNacimiento;
         alumno.sexo=this.sexo;
         alumno.direccion=this.direccion;
         alumno.telefono=this.telefono;
         alumno.email=this.email;
         alumno.password=this.password;
         alumno.grado=this.grado;
         alumno.seccion=this.seccion;
        respuesta=alumno.RegistrarAlumno();
                 
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}
   /**Lógica-Método para Actualizar Persona*/
public boolean ActualizarAlumno(){
     boolean respuesta=true;
     
    try {
         Datos.ClsAlumno alumno=new Datos.ClsAlumno();
         alumno.idalumno=this.idalumno;
         alumno.apellidos=this.apellidos;
         alumno.nombres=this.nombres;
         alumno.fechaNacimiento=this.fechaNacimiento;
         alumno.sexo=this.sexo;
         alumno.direccion=this.direccion;
         alumno.telefono=this.telefono;
         alumno.email=this.email;
         alumno.password=this.password;
         alumno.grado=this.grado;
         alumno.seccion=this.seccion;
        respuesta=alumno.ActualizarAlumno();
                 
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}

public boolean EliminarAlumno(int idAlumno){
     boolean respuesta=true;
     
    try {
         Datos.ClsAlumno alumno=new Datos.ClsAlumno();
         respuesta=alumno.EliminarAlumno(idAlumno);
    }catch(Exception ex){
        System.out.println("Se ha presentado el siguiente Error: "+ex);
    }

    return respuesta;
}

/** fecha de String a Date*/
  /*  public Date ConvertirFecha(String Fecha){
    System.out.println(Fecha);
    Date fechaDevolver=null;
    SimpleDateFormat FormatoFecha= new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaDevolver= FormatoFecha.parse(Fecha);
            System.out.println(fechaDevolver);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    return fechaDevolver;
}
    
     public String ConvertirFechaa(String Fecha){
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         Date fechan = null;
       try {
           fechan = formato.parse(Fecha);
       } catch (ParseException ex) {
           Logger.getLogger(ClsAlumno.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       return fechan.toString();
     }*/
    
     /**Lista*/
       public TableModel ListarAlumnos(){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAlumno persona=new Datos.ClsAlumno();
                       modelo=persona.ListarAlumnos();
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
        public TableModel ListarAlumnosvista(){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAlumno persona=new Datos.ClsAlumno();
                       modelo=persona.ListarAlumnosvista();
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       

      /**Busca Persona*/
       public TableModel BusquedaAlumnos(String ApellidosNombres){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAlumno alumno=new Datos.ClsAlumno();
                       modelo=alumno.BusquedaAlumnos(ApellidosNombres);
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
       public TableModel BusquedaAlumnosgrado(String grado){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAlumno alumno=new Datos.ClsAlumno();
                       modelo=alumno.BusquedaAlumnosgrado(grado);
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
       public TableModel BusquedaAlumnosseccion(String seccion){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAlumno alumno=new Datos.ClsAlumno();
                       modelo=alumno.BusquedaAlumnosseccion(seccion);
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
       
       public TableModel BusquedaAlumnosvista(String ApellidosNombres){
        TableModel modelo = new DefaultTableModel();

        try {
                       Datos.ClsAlumno alumno=new Datos.ClsAlumno();
                       modelo=alumno.BusquedaAlumnosvista(ApellidosNombres);
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
       
       
       
       
       
       public ComboBoxModel ListarGrado(){
                  ComboBoxModel modelo = new DefaultComboBoxModel();

        try {
                       Datos.ClsAlumno persona=new Datos.ClsAlumno();
                       modelo=persona.ListarGrado();
            
        } catch(Exception ex) {
             System.out.println(ex);        
        }
        return modelo;
       }
}
