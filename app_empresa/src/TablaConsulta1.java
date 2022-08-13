import javax.swing.*;
import java.awt.*;

public class TablaConsulta1 extends JPanel {
    ModeloConsulta1 modelo = new ModeloConsulta1();

    public TablaConsulta1() {
        setLayout(new BorderLayout());
        JTable TablaInforme = new JTable(modelo);
        JScrollPane panelTabla = new JScrollPane(TablaInforme);
        add(panelTabla, BorderLayout.CENTER);

    }

}
