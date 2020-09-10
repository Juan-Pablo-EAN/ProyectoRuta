package paquete;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author Juan Pablo
 */
@DatabaseTable
public class Estudiante {
    @DatabaseField
    private String nombre;
    @DatabaseField (id = true)
    private int codigo;
    @DatabaseField
    private String acudiente;
    @DatabaseField
    private long telefono;
    @DatabaseField
    private String barrio;
    @DatabaseField
    private int amanecer;
    @DatabaseField
    private int tarde;
    
    public Estudiante(){
        
    }
    
    public Estudiante(String nombre, int codigo, String acudiente, long telefono, String barrio, int amanecer, int tarde){
        this.nombre = nombre;
        this.codigo = codigo;
        this.acudiente = acudiente;
        this.telefono = telefono;
        this.barrio = barrio;
        this.amanecer = amanecer;
        this.tarde = tarde;
    }
    
    @Override
    public String toString(){
        return "Estudiante{" + "nombre=" + nombre + ", codigo=" + codigo + ", acudiente=" + acudiente 
                + ", telefono=" + telefono + ", barrio" + barrio + ", amanecer" + amanecer + ", tarde" + tarde + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(String acudiente) {
        this.acudiente = acudiente;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getAmanecer() {
        return amanecer;
    }

    public void setAmanecer(int amanecer) {
        this.amanecer = amanecer;
    }

    public int getTarde() {
        return tarde;
    }

    public void setTarde(int tarde) {
        this.tarde = tarde;
    }
}
