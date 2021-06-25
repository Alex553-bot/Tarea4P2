
public class AutoParticular extends Vehiculo{
    private boolean privado;

    public AutoParticular(String color, Persona propietario, int capacidad){
        super(color, propietario, capacidad);
        privado = false;
    }

    public void vender(Persona nuevoPropietario){
        super.propietario = nuevoPropietario;
        super.personasDentro = 0;
        super.lista = null;
        lista = new Persona[super.capacidad];
        super.entrar(propietario);
    }

    public String entrar(Persona p){
        String reporte = "No puede entrar";
        boolean entro = false;
        
        if(propietario.buscar(p.getNombre())){
            int aux= 0;
            while(!(entro) && aux< super.capacidad){
                entro = (super.lista[aux].getNombre().equals(p.getNombre()) && super.lista[aux].getID().equals(p.getID()));
                aux++;
            }
        }

        if(!entro){
            reporte = super.entrar(p);
        }

        return reporte;
    }
}
