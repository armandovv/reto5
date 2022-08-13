import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import java.sql.*;
import javax.swing.table.*;

public class ModeloConsulta1 extends DefaultTableModel {
    ResultSet datos;

    public ModeloConsulta1() {

        this.addColumn("ID_Lider");
        this.addColumn("Nombre");
        this.addColumn("Primer_apellido");
        this.addColumn("Ciudad_Residencia");

        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion(1).db");
            System.out.println("conexion a la base de datos");
            Statement Stmt = c.createStatement();
            String consulta = "SELECT ID_Lider, Nombre, Primer_apellido, Ciudad_Residencia from Lider l order by Ciudad_Residencia ASC ;";

            datos = Stmt.executeQuery(consulta);

            while (datos.next()) {
                Object[] fila = new Object[4];
                for (int i = 0; i < 4; i++) {
                    fila[i] = datos.getObject(i + 1);
                }
                this.addRow(fila);
            }
            Stmt.close();
            c.close();
            System.out.println("La consulta fue realizada exitosamente");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + " :" + e.getMessage());
        }
    }

}
