import java.util.ArrayList;

public class Persona{
    private String nombre, id;
    private ArrayList<Persona> relacion;
    
    public Persona(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
        relacion = new ArrayList<>();
    }
    
    public void incluirAmigo(Persona p){
        relacion.add(p);
    }
    
    public String getID(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean buscar(String nombre){
        boolean reporte = false;
        int contador =0;
        while(!reporte && contador<relacion.size()){
            reporte = relacion.get(contador).equals(nombre);
            contador++;
        }
        
        return reporte;
    }
}
