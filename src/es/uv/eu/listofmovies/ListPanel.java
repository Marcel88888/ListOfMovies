package es.uv.eu.listofmovies;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ListPanel extends JPanel {
    
    private MovieModel movies;
    private JTextArea textArea;
    private JScrollPane scroll;
    
    public ListPanel(MovieModel movies) {
        
        this.movies = movies;
        
        setLayout(new BorderLayout());
        
        textArea = new JTextArea(20, 60);
        textArea.setEditable(false);
        textArea.setBackground(Color.lightGray);
        textArea.setForeground(Color.black);
        textArea.setFont(new Font("Sans", Font.BOLD, 12));
        
        scroll = new JScrollPane(textArea);
        
        this.add(scroll, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    public void display() {
        textArea.append((movies.toString()));
    }
}
