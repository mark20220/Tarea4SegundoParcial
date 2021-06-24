
/**
 * Un mago es una Persona, este hereda sus atributos ademas de tener
 * los suyos propios como el nombre de su hechizo, dos booleans para 
 * el estado de si pago un asesino o defensor.
 * Mago tiene sus metodos como mostrar pagodefensor y pagoasesino, 
 * tambien el de contratar un defensor o un asesino
 * 
 * Marcelo O. C. Cadima 
 * 23/06/2021
 */
public class Mago extends Persona
{
    //Atributos Propios
    private String Hechizo;
    private boolean PagoDefensor;
    private boolean PagoAsesino;
    //Constructor
    public Mago(String Nombre, int Vida, int Dinero, String Hechizo){
        super(Nombre, Vida, Dinero);
        this.Hechizo=Hechizo;
        PagoDefensor=false;
        PagoAsesino=false;
    }
    //Metodo propio
    public String contratarDefensor(Defensor Otro){
        String Reporte;
        Otro.Dinero=Otro.Dinero+Otro.GetPago();
        Dinero=Dinero-Otro.GetPago();
        PagoDefensor=true;
        Reporte="Se pago "+Otro.GetPago()+" monedas de Oro "+" a "+Otro.GetNombre()+ " Para proteger a "+GetNombre();
        return Reporte;
    }
    //Metodo propio
    public String contratarAsesino(Asesino Otro, Mago Objetivo){
        String Reporte;
        Otro.Dinero=Otro.Dinero+Otro.GetPago();
        Dinero=Dinero-Otro.GetPago();
        PagoAsesino=true;
        Reporte="Se pago "+Otro.GetPago()+" monedas de Oro "+" Para asesinar a "+Objetivo.GetNombre();
        return Reporte;
    }
    //Metodo propio
    public boolean GetDefensor(){
        return PagoDefensor;
    }
    //Metodo propio
    public boolean GetAsesino(){
        return PagoAsesino;
    }
}
