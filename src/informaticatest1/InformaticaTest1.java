/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informaticatest1;

/**
 *
 * @author Deser
 */
public class InformaticaTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Luis");
        
        int numero = 5;
        String cadena = "UDCI";
        
        System.out.println(cadena);
        System.out.println(""+numero);
        
        matematicas m1 = new matematicas("luis ","rodriguez");
        
        int base = 4;
        int altura = 6;
        
        m1.areaRectangulo(base, altura);
        
        int radio = 4;
        System.out.println("El area del circulo es : " + m1.areaCirculo(radio));
        
    }
}
