package logica;


public class Comida {
  protected String nombre;
    protected float precio;
    protected int codigo;
    protected int cantidadVendida;

  public Comida() {
        this.nombre = "";
        this.precio = 0;
        this.codigo = 0;
        this.cantidadVendida = 0;
 
    }
    
    public Comida(String nombre, int codigo, int cantidadVendida, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidadVendida = cantidadVendida;
    }
   

    public void setCantidadVendida(int cantidad_Vendida) {
        this.cantidadVendida = cantidad_Vendida;
        //this.cantidadVendida = cantidadVendida+cantidad_Vendida;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


   @Override
    public String toString() {
        return   nombre + "  precio = $" + precio ;
    }
   
}