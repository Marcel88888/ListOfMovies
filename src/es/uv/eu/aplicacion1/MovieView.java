package es.uv.eu.aplicacion1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MovieView extends JFrame {
    
    private MovieModel movies;
    private ListPanel listPanel; 
    private MovieMenu movieMenu;
    private JButton exit;
    
    public MovieView(MovieModel movies) {
        super("Application 4: List of the movies");
        this.movies = movies;
        this.setLayout(new BorderLayout());
        this.setSize(800, 400);
        
        movieMenu = new MovieMenu();
        this.setJMenuBar(movieMenu);
        
        listPanel = new ListPanel(movies);
        listPanel.display();
        
        JLabel label = new JLabel("List of the movies");
        label.setFont(new Font("Sans", Font.BOLD, 14));
        
        exit = new JButton("Exit");
        exit.setActionCommand("exitButton");
        
        this.add(listPanel, BorderLayout.CENTER);
        this.add(label, BorderLayout.NORTH);
        this.add(exit, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }
    
    public void setActionListener(ActionListener actionListener) {
        exit.addActionListener(actionListener);
        movieMenu.setActionListener(actionListener);
    }
}
