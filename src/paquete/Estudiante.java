package paquete;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

/**
 *
 * @author Juan Pablo
 */
@DatabaseTable
public class Estudiante {

    @DatabaseField
    private String nombre;
    @DatabaseField(id = true)
    private int codigo;
    @DatabaseField
    private String acudiente;
    @DatabaseField
    private long celular; //IMPORTANTE DEFINIR QUÉ TIPO DE VARIABLE ES DESDE EL PRINCIPIO
    @DatabaseField
    private String barrio;
    @DatabaseField
    private int amanecer;
    @DatabaseField
    private int tarde;
    @DatabaseField
    private Date fecha;
    @DatabaseField
    private String lugar;

    public Estudiante() {
    }

    public Estudiante(String nombre, int codigo, String acudiente,
            long celular, String barrio, int amanecer, int tarde, Date fecha, String lugar) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.acudiente = acudiente;
        this.celular = celular;
        this.barrio = barrio;
        this.amanecer = amanecer;
        this.tarde = tarde;
        this.fecha = fecha;
        this.lugar = lugar;
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

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

}
