
public class TransportePublico extends Vehiculo{
    private String []ruta;
    private int pasaje;
    private int parada;
    
    public TransportePublico(String color, Persona propietario, int capacidad, String[] ruta, int pasaje){
        super(color, propietario, capacidad);
        this.ruta = ruta;
        this.pasaje = pasaje;
    }
    // viaja una parada
    public String viajarParada(){
        String reporte = "recorrido terminado, vuelva a iniciar";
        if(parada < ruta.length){
            reporte = ruta[parada];
            if(parada == ruta.length-1){
                reporte = reporte + "\n la ruta termino, inicialize nuevamente";
            }
            parada++;
        }
        return reporte;
    }
    
    public void terminarTurno(){
        this.lista = null;
        parada = ruta.length-1;
    }
    
    public String entrar(Persona p,int pasaje){
        String resp = "No se subio, porque el monto pagado es menor al pasaje";
        if(pasaje >= this.pasaje){
            resp = super.entrar(p);
        }
        return resp;
    }
    
    public void inicializar(){
        parada = 0;
    }
    
}