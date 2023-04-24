
package org.uv.programa05;


/**
 *
 * @author Patidifusa
 */
public class Programa05 {

    public static void main(String[] args) { 

        DAOEmpleado dao=new DAOEmpleado();
        Empleado empleado= new Empleado();
        empleado.setClave(11);
        empleado.setNombre("Carlos");
        empleado.setDireccion("Avenida 12");
        empleado.setTelefono("2722303746");
        
        dao.create(empleado);
        
        System.out.println("Hello World!");
    }
}
