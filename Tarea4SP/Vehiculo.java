
public class Vehiculo{
    private String      color;
    protected Persona   propietario;
    protected int       capacidad;
    protected int       personasDentro;
    protected Persona[] lista;
    /*
     * al crear un vehiculo la capacidad debe ser mayor a 0
     * como conductor por defecto es el propietario
     */
    public Vehiculo(String color, Persona propietario, int capacidad){
        this.color = color;
        this.propietario = propietario;
        this.capacidad = capacidad;
        personasDentro = 0;
        lista = new Persona[capacidad];
        String aux = entrar(propietario);
    }

    public String entrar(Persona p){
        String reporte ="no ingreso, ya esta adentro";

        if(personasDentro >= capacidad){
            reporte = "No ingreso, carro lleno";
        }else{
            if(!pertenece(p)){
                reporte = "si entro";
                lista[personasDentro] = p;
                personasDentro++;
            }
        }

        return reporte;
    }

    private boolean pertenece(Persona p){
        boolean reporte = false;
        int contador = 0;
        while(!reporte && contador<personasDentro){
            reporte = lista[contador].getNombre().equals(p.getNombre()) && lista[contador].getID().equals(p.getID());
            contador++;
        }
        return reporte ;
    }

    public void bajar(Persona p){
        for(int i = 0; i< lista.length; i++){
            if(lista[i].getNombre().equals(p.getNombre()) && lista[i].getID().equals(p.getID())){

                lista[i] = null;

            }
        }
    }

    public Persona[] mostrarPasajeros(){
        return lista;
    }

    public void cambiarColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}
