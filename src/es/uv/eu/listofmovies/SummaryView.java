package es.uv.eu.listofmovies;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SummaryView extends JFrame {
    
        private MovieModel model;
        private JTextArea summaryTextArea;
        
        public SummaryView(MovieModel model) {
            super("Summary of the project");
            this.setLayout(new BorderLayout());
            this.setSize(300, 100);
            
            this.model = model;

            summaryTextArea = new JTextArea();
            summaryTextArea.setEditable(false);
            summaryTextArea.setBackground(Color.lightGray);
            summaryTextArea.setForeground(Color.black);
            summaryTextArea.setFont(new Font("Sans", Font.BOLD, 16));
            
            this.writeSummary();

            this.add(summaryTextArea);
            this.setVisible(true);
        }
        
        public final void writeSummary() {
            summaryTextArea.append("Author: Marcel Kawski\n" + "Total number of"
                    + " movies: " + Integer.toString(model.getNumberOfMovies()));
        }
}
