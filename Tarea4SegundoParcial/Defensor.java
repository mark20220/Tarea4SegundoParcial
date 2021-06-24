
/**
 * Un Defensor es una persona y hereda sus atributos, ademas
 * tiene armadura y un precio por sus servicios llamado pago.
 * 
 * Tiene un metodo propio llamado Proteger, pidiendo el nombre del mago
 * y mostrar pago que el precio de sus servicios.
 * 
 * Marcelo O. C. Cadima
 * 23/03/2021
 */
public class Defensor extends Persona
{
    //Atributos Propios
    private int Armadura;
    private int Pago;
    //constructor
    public Defensor(String Nombre, int Vida, int Dinero, int Armadura, int Pago){
        super(Nombre, Vida, Dinero);
        this.Armadura=Armadura;
        this.Pago=Pago;
    }
    //Metodo propio
    public String Proteger(Mago Otro){
        String Reporte;
        if(Otro.GetDefensor()==true){
            Reporte=Otro.GetNombre()+" Sera protegido";
        }else{
            Reporte=Otro.GetNombre()+" No pago para ser protegido";
        }
        return Reporte;
    }
    //Metodo propio
    public int GetPago(){
        return Pago;
    }
    
}

