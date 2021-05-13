# rectanguloJony
ejercicio n°7

public class calculaAreaRectangulo {

    
    public static void main(String[] args) {
    
        // TODO code application logic here
        
        realizaOperacion res = new realizaOperacion();
        res.Operacion();
        
    }  
    
}

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



public class solicitaDatos {
    
    private int base;
    private int altura;
    
    
    public void IngresaDatos1(int base){
    
        this.base = base; 
        System.out.println("Ingrese Base: ");
    }
    
    public void IngresaDatos2(int altura){
    
        this.altura = altura;
        System.out.println("Ingrese altura: ");   
    }
    
}
