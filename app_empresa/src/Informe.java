
import java.awt.*;
import javax.swing.*;

public class Informe extends JFrame {

    /**
     * 
     */
    public void incializar() {
        setLayout(new BorderLayout());

        TablaConsulta1 tabla = new TablaConsulta1();
        TablaConsulta2 tabla2 = new TablaConsulta2();
        TablaConsulta3 tabla3 = new TablaConsulta3();
        JTabbedPane ventana = new JTabbedPane();

        ventana.addTab("LIDERES", tabla);
        ventana.addTab("PROYECTOS CASA CAMPESTRE", tabla2);
        ventana.addTab("PROYECTOS SALENTO", tabla3);
        add(ventana, BorderLayout.NORTH);

        setTitle("MINISTERIO DE VIVIENDA");
        setSize(600, 600);
        setMinimumSize(new Dimension(400, 400));
        setMaximumSize(new Dimension(800, 800));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
