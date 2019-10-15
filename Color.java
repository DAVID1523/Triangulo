public class Color
{
    int rojo;
    int verde;
    int azul;
    
    // CONSTRUCTORES 
    public Color(){
        
    }

    public Color(int rojo, int verde, int azul){
    this.rojo=rojo;
    this.verde=verde;
    this.azul=azul;
    }

    //GETTER AND SETTER
    public double getRojo(){
    return rojo;
    }
    
    public double getaAzul(){
    return azul;
    }
    
    public double getVerde(){
    return verde;
    }
    
    public void setRojo(int rojo){
    this.rojo=rojo;
    }
    
    public void setVerde(int verde){
    this.verde=verde;
    }
    
    public void setAzul(int azul){
    this.azul=azul;
    }
    
    
}
