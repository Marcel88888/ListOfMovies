package es.uv.eu.aplicacion1;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MovieMenu extends JMenuBar {
    
    private JMenu file;
    private JMenu data;
    private JMenuItem exit;
    private JMenuItem top3;
    private JMenuItem summary;
    
    public MovieMenu() {
        file = new JMenu("File");
        exit = new JMenuItem("Exit");
        exit.setActionCommand("exitFile");
        file.add(exit);
        
        data = new JMenu("Data");
        top3 = new JMenuItem("Top3");
        top3.setActionCommand("top3");
        data.add(top3);
        summary = new JMenuItem("Summary");
        summary.setActionCommand("summary");
        data.add(summary);
        
        this.add(file);
        this.add(data);
    }
    
    public void setActionListener(ActionListener actionListener) {
        exit.addActionListener(actionListener);
        top3.addActionListener(actionListener);
        summary.addActionListener(actionListener);
    }
    
}
