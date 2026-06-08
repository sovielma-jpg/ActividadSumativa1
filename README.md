# Agencia de Turismo - Programación Orientada a Objetos

## 📌 Descripción
Proyecto académico desarrollado en Java para modelar un sistema básico de la agencia **Llanquihue Tour**, aplicando principios de **programación orientada a objetos (POO)**: encapsulamiento, herencia y composición.  
El sistema representa personas vinculadas a la organización (empleados), junto con sus direcciones y cargos.

## 📂 Estructura de paquetes
- **model**  
  - `Persona`: clase base con atributos generales (nombre, rut, correo, teléfono, dirección).  
  - `Direccion`: clase de composición que representa la dirección física (calle, número, ciudad, región).  
  - `Empleado`: clase que hereda de `Persona` y agrega el atributo `cargo`.  

- **app**  
  - `Main`: clase principal que instancia objetos y muestra sus datos en consola.

