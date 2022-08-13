import javax.swing.*;
import java.awt.*;

public class TablaConsulta2 extends JPanel {
    ModeloConsulta2 modelo = new ModeloConsulta2();

    public TablaConsulta2() {
        setLayout(new BorderLayout());
        JTable TablaInforme = new JTable(modelo);
        JScrollPane panelTabla = new JScrollPane(TablaInforme);
        add(panelTabla, BorderLayout.CENTER);

    }

}
