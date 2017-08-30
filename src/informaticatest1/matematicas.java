/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informaticatest1;

/**
 *
 * @author Deser
 */
public class matematicas {
    
    // Constructor
    public matematicas()
    {
        System.out.println("Bievenido a la clase Matematicas");
    };
    
    public matematicas(String nombre, String Apellido)
    {
        System.out.println("Bievenido a la clase Matematicas " + nombre + Apellido);
    };
    
    public void areaRectangulo(int base, int altura)
    {
        int resultado = base * altura;
        System.out.println("El area del rectangulo es: " + resultado);
    };
    
    public float areaCirculo(int radio)
    {
        float resultado = (float) (3.1416 * radio * radio);
  
        return resultado;
    }
}
