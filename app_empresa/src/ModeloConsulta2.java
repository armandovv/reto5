import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import java.sql.*;
import javax.swing.table.*;

public class ModeloConsulta2 extends DefaultTableModel {
    ResultSet datos;

    public ModeloConsulta2() {

        this.addColumn("ID_Proyecto");
        this.addColumn("Constructora");
        this.addColumn("Numero_habitaciones");
        this.addColumn("Ciudad");

        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:ProyectosConstruccion(1).db");
            System.out.println("conexion a la base de datos");
            Statement Stmt = c.createStatement();
            String consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad, Clasificacion from Proyecto p where Clasificacion ='Casa Campestre' and (Ciudad='Santa Marta' or Ciudad ='Barranquilla'or Ciudad='Cartagena');";

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
