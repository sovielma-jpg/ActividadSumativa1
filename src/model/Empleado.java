package model;

public class Empleado extends Persona{
    private String cargo;

public Empleado () {}

public Empleado(String nombre, String rut, String correo, String telefono, Direccion direccion, String cargo) {
    super(nombre, rut, correo, telefono, direccion);
    this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public String toString() {
        return "Empleado:\n" +
                super.toString() +
                "cargo='" + cargo + '\'';
    }
}
