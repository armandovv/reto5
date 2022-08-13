import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import java.sql.*;
import javax.swing.table.*;

public class ModeloConsulta3 extends DefaultTableModel {
    ResultSet datos;

    public ModeloConsulta3() {

        this.addColumn("ID_Compra");
        this.addColumn("Constructora");
        this.addColumn("Banco Vinculado");

        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion(1).db");
            System.out.println("conexion a la base de datos");
            Statement Stmt = c.createStatement();
            String consulta = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado from Compra c  INNER JOIN  Proyecto p on c.ID_Proyecto = p.ID_Proyecto  WHERE Proveedor = 'Homecenter' and Ciudad = 'Salento';";

            datos = Stmt.executeQuery(consulta);

            while (datos.next()) {
                Object[] fila = new Object[3];
                for (int i = 0; i < 3; i++) {
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
