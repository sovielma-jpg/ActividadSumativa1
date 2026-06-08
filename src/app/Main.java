package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

public class Main {
    public static void main(String[] args) {

        Direccion d1 = new Direccion("Carlos Valdes", 2030, "Santiago","Metropolitana");
        Persona p1 = new Persona("Jorge Mendez", "20.123.245-3", "jorgessa@gmail.com", "+56 9 5808 4632", d1);

        Direccion d2 = new Direccion("Las Torres", 420, "Santiago", "Metropolitana");
        Empleado e1 = new Empleado("Joshua Farias", "12.234.768-2", "JoshuaGB@hotmail.com", "+56 9 8985 5658", d2, "Secretario");

        Direccion d3 = new Direccion("Santa Sofia", 2345, "Valdivia", "Los Rios");
        Empleado e2 = new Empleado("Camila Vallejos","23.123.676-1", "camilar@outlook.com", "+56 9 5826 5686", d3, "Jefa de personal");

        System.out.println(p1);
        System.out.println(e1);
        System.out.println(e2);

        }
    }
