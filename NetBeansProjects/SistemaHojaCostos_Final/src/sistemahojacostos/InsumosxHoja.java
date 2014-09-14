package sistemahojacostos;

import java.sql.ResultSet;

public class InsumosxHoja {
    //instanciar un objeto
    Conexion cn = new Conexion();

    public void insertar(int codigoHoja, int codigoInsumo, double cantidad) {
        cn.UID("INSERT INTO insumosxHoja(codigoHoja,codigoInsumo,cantidad) VALUES('" + codigoHoja + "','" + codigoInsumo + "','" + cantidad + "')");
    }
    
        public void modificar(int codigoHoja, int codigoInsumo, double cantidad) {
    //cn.UID("UPDATE unidades SET unidad='" + unidad + "'");
    cn.UID("UPDATE insumosxhoja SET cantidad='" + cantidad + "' WHERE codigoHoja='" + codigoHoja + "' && codigoInsumo='" + codigoInsumo + "';");
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

    public ResultSet llenarTabla(int codigoHoja) {
       return (cn.getValores("SELECT insumosxhoja.codigoHoja, insumosxHoja.codigoInsumo, insumos.descripcion, insumos.precioUnitario, insumosxhoja.cantidad, insumos.PrecioUnitario*insumosxhoja.cantidad FROM insumosxHoja INNER JOIN insumos ON insumosxHoja.codigoInsumo=insumos.codigoInsumo WHERE codigoHoja='" + codigoHoja + "' "));
    }
     
    public ResultSet llenarInsumos() {
        return (cn.getValores("SELECT * FROM insumos"));
    }

      public ResultSet BusquedaProgresiva(String buscado, String criterio) {
     if (criterio.equals("codigoHoja")) {
         return (cn.getValores("SELECT insumosxhoja.codigoHoja, insumosxHoja.codigoInsumo, insumos.descripcion, insumos.precioUnitario, insumosxhoja.cantidad, insumos.PrecioUnitario*insumosxhoja.cantidad FROM insumosxHoja INNER JOIN insumos ON insumosxHoja.codigoInsumo=insumos.codigoInsumo WHERE codigoHoja LIKE'%" + buscado + "%';"));
     }

     else{
 return (cn.getValores("SELECT insumosxhoja.codigoHoja, insumosxhoja.codigoInsumo, insumos.descripcion, insumos.precioUnitario, insumosxhoja.cantidad, insumos.PrecioUnitario*insumosxhoja.cantidad FROM insumosxHoja INNER JOIN insumos ON insumosxHoja.codigoInsumo=insumos.codigoInsumo WHERE descripcion LIKE'%" + buscado + "%';"));
 }

}
}
