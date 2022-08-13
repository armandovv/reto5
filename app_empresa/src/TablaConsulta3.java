import javax.swing.*;
import java.awt.*;

public class TablaConsulta3 extends JPanel {
    ModeloConsulta3 modelo = new ModeloConsulta3();

    public TablaConsulta3() {
        setLayout(new BorderLayout());
        JTable TablaInforme = new JTable(modelo);
        JScrollPane panelTabla = new JScrollPane(TablaInforme);
        add(panelTabla, BorderLayout.CENTER);

    }

}