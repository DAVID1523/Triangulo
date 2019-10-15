
public class Triangulo
{
   private Punto punto1;
   private Punto punto2;
   private Punto punto3;
   
   private Color colorLinea;
   private Color colorRelleno;
   
   
    public Triangulo()
    {
        //PUNTO
        
        Punto punto1= new Punto();
        Punto punto2= new Punto();
        Punto punto3= new Punto();
        
        //COLOR
        
        Color colorLinea= new Color();
        Color colorRelleno= new Color();
    }
    
    //GETTER
    public Punto getPunto1(){
    return punto1;
    }
    
    public Punto getPunto2(){
    return punto2;
    }
    
    public Punto getPunto3(){
    return punto3;
    }
    
    public Color getColorLinea(){
    return colorLinea;
    }
    
    public Color getColorRelleno(){
    return colorRelleno;
    }
    
    public double getPerimetro(){
        double perimetro= calcularLado1() + calcularLado2() + calcularLado3();;
        return perimetro;
    }
   
    public double getArea(){
        double perimetro = getPerimetro();
        double s= perimetro/2;
        
        //CALCULA VALOR DE LOS LADOS -S
        double valorLado1= s - calcularLado1();
        double valorLado2= s - calcularLado2();
        double valorLado3= s - calcularLado3();
        
        //USA LA FORMULA PARA EL AREA CON Math.pow(procedimiento, 1/2)
        double area=Math.pow(s*valorLado1*valorLado2*valorLado3, 1/2);
        return area;
    }
      
    public double getAltura(){
        double altura=0;
        return altura;
    }
    
    private double calcularLado1(){
        //HALLAMOS LAS DISTANCIAS EN EL EJE 'Y' Y EN EL EJE 'X'
        double valorX= Math.pow(punto1.getX() - punto2.getX(), 2);
        double valorY=Math.pow(punto1.getY() - punto2.getY(), 2);
        
        //ELEVA LA POTENCIA A 1/2 PARA SACAR LA RAIZ CUADRADA
        double distancia= Math.pow(valorX + valorY, 1/2);  
        return distancia;
    }
    
    private double calcularLado2(){
        //HALLAMOS LAS DISTANCIAS EN EL EJE 'Y' Y EN EL EJE 'X'
        double valorX= Math.pow(punto2.getX() - punto3.getX(), 2);
        double valorY=Math.pow(punto2.getY() - punto3.getY(), 2);
        
        //ELEVA LA POTENCIA A 1/2 PARA SACAR LA RAIZ CUADRADA
        double distancia= Math.pow(valorX + valorY, 1/2);  
        return distancia;
    }
    
    private double calcularLado3(){
        //HALLAMOS LAS DISTANCIAS EN EL EJE 'Y' Y EN EL EJE 'X'
        double valorX= Math.pow(punto3.getX() - punto1.getX(), 2);
        double valorY=Math.pow(punto3.getY() - punto1.getY(), 2);
        
        //ELEVA LA POTENCIA A 1/2 PARA SACAR LA RAIZ CUADRADA
        double distancia= Math.pow(valorX + valorY, 1/2);  
        return distancia;
    }

   //SETTER
   public void setPunto1( double x, double y ){
        punto1.setX(x);
        punto1.setY(y);
    }
    
   public void setPunto2( double x, double y ){
        punto2.setX(x);
        punto2.setY(y);
   }
   
   public void setPunto3( double x, double y ){
        punto3.setX(x);
        punto3.setY(y);
   }
   
   public void setColorRelleno(int rojo, int verde, int azul){
       colorRelleno.setRojo(rojo);
       colorRelleno.setVerde(verde);
       colorRelleno.setAzul(azul);
   }
   
   public void setColoLineas(int rojo, int verde, int azul){
       colorLinea.setRojo(rojo);
       colorLinea.setVerde(verde);
       colorLinea.setAzul(azul);
   }
}
