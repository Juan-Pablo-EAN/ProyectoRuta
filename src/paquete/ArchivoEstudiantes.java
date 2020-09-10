package paquete;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;


public class ArchivoEstudiantes {
    public static void main(String[] args) throws SQLException {
        String nombreArchivo = "jdbc:h2:./lista";
        
        ConnectionSource conn = new JdbcConnectionSource(nombreArchivo);
        
        TableUtils.createTableIfNotExists(conn, Estudiante.class);
    }
}
//ESTA CLASE SOLO SE EJECUTA CUANDO SE CREE EL ARCHIVO O CUANDO SE LE TENGA QUE HACER MANTENIMIENTO

