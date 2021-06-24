
/**
 * Un asesino es una persona entonces hereda sus atributos, ademas
 * tiene sus propios atributos llamado daño de su arma y pago 
 * por sus servicios de asesino.
 * 
 * asesino tiene su propio metodo llamado asesinar pidiendo dos magos,
 * uno que hara el encargo y el nombre del mago a ejecutar.
 * y puede mostrar pago.
 * 
 * Marcelo O. C. Cadima 
 * 23/06/2021
 */
public class Asesino extends Persona
{
    //Atributos Propios
    private int Daño;
    private int Pago;
    public Asesino(String Nombre, int Vida, int Dinero, int Daño, int Pago){
        super(Nombre, Vida, Dinero);
        this.Daño=Daño;
        this.Pago=Pago;
    }
    //Metodo propio
    public String Asesinar(Mago Otro, Mago Victima){
        String Reporte;
        if(Otro.GetAsesino()==true){
            Reporte=Victima.GetNombre()+" Sera Asesinado";
        }else{
            Reporte="No se hizo el pago";
        }
        return Reporte;
    }
    //Metodo Propio
    public int GetPago(){
        return Pago;
    }
}

