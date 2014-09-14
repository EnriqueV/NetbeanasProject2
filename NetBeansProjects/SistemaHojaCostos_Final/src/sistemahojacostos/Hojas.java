package sistemahojacostos;
import java.sql.ResultSet;
public class Hojas {
    //instanciar un objeto
    Conexion cn = new Conexion();

    public void insertar(int codigoHoja, String descripcion, String codigoUnidad) {
        cn.UID("INSERT INTO hojas(codigoHoja,descripcion,codigoUnidad) VALUES('" + codigoHoja + "','" + descripcion + "','" + codigoUnidad + "')");
    }

    public void modificar(String codigoUnidad, String unidad) {
        //cn.UID("UPDATE unidades SET unidad='" + unidad + "'");
        cn.UID("UPDATE unidades SET unidad='" + unidad + "' WHERE codigoUnidad='" + codigoUnidad + "'");
    }

    public void eliminar(String codigoUnidad) {
        cn.UID("DELETE FROM unidades WHERE codigoUnidad='" + codigoUnidad + "' ");
    }

    public ResultSet buscar(String codigoUnidad) {
        return (cn.getValores("SELECT * FROM unidades WHERE codigoUnidad='" + codigoUnidad + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codigoHoja) FROM hojas"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(codigoHoja) FROM hojas"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigoUnidad,unidad FROM unidades"));
    }
    
    public ResultSet llenarUnidades() {
        return (cn.getValores("SELECT * FROM unidades"));
    }
/////
    public void modificar(int codigoHoja, String descripcion, String codigoUnidad) {
        //cn.UID("UPDATE unidades SET unidad='" + unidad + "'");
        cn.UID("UPDATE hojas SET codigoUnidad='" + codigoUnidad + "', descripcion='" + descripcion + "'  WHERE codigoHoja='" + codigoHoja + "'");
    }
public ResultSet Consulta(String codigoHoja) {
        return (cn.getValores("SELECT * FROM hojas WHERE codigoHoja='" + codigoHoja + "'"));
    }
}
