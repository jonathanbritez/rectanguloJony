/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulojony;

import java.util.Scanner;

/**
 *
 * @author jonathan
 */
public class realizaOperacion {
    
    Scanner entrada = new Scanner(System.in);
        private int area;
        private int base;
        private int altura; 
    
    public void Operacion(){
        
        solicitaDatos datos = new solicitaDatos();
       
        datos.IngresaDatos1(base);
         base = entrada.nextInt();
         datos.IngresaDatos2(altura);
        altura = entrada.nextInt();
        area =base*altura;
         
      
        System.out.println(area);
    }
    
    
}
