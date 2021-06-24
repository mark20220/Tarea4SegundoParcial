
/**
 * Toda persona tiene un nombre, vida y una cantidad de dinero
 * en monedas de oro.
 * Tambien puede mostrar su nombre, la cantidad de vida que tiene y
 * la cantidad de dinero.
 * 
 * Marcelo O. C. cadima 
 * 23/06/2021
 */
public class Persona
{
    //Atributos
    private String Nombre;
    private int Vida;
    protected int Dinero;
    //Constructor
    public Persona(String Nombre, int Vida, int Dinero){
        this.Nombre     =   Nombre;
        this.Vida       =   Vida;
        this.Dinero     =   Dinero;
        
    }
    //Metodo
    public String GetNombre(){
        return Nombre;
    }
    //Metodo
    public int GetVida(){
        return Vida;
    }
    //Metodo
    public String GetDinero(){
        String Reporte="Tienes "+Dinero+" monedas de Oro.";
        return Reporte;
    }
}

