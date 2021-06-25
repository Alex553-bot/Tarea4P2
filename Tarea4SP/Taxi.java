
public class Taxi extends Vehiculo{
    private int tarifa;
    // se refiere a la tarifa por km de viaje que se realice
    
    public Taxi(String color, Persona propietario, int tarifa){
        super(color, propietario, 4);
        this.tarifa = tarifa;
    }
    
    public double trabajar(double distancia){
        double resp = 0;
        
        if(distancia>0){
            resp = distancia*tarifa;
        }
        
        return resp;
    } 
}
