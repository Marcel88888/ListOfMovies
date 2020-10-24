package es.uv.eu.listofmovies;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.List;

public class TopView extends JFrame {
    
        private MovieModel model;
        private JTextArea topTextArea;
        private JScrollPane scroll;
        
        public TopView(MovieModel model) {
            // default BorderLayout
            super("Top3 most recent films");
            this.setSize(400, 200);
            
            this.model = model;
            
            topTextArea = new JTextArea();
            topTextArea.setEditable(false);
            topTextArea.setBackground(Color.lightGray);
            topTextArea.setForeground(Color.black);
            topTextArea.setFont(new Font("Sans", Font.BOLD, 16));

            scroll = new JScrollPane(topTextArea);
            
            topTextArea.append(this.displayTop3());

            this.add(scroll); // default CENTER position
            this.setVisible(true);
        } 
        
        public final String displayTop3() {
            List<Movie> top3 = model.getTop3();
            String result = "Three most recent films are:\n\n";
            for (Movie m: top3) 
                result = result + m.getTitulo() + "\n";
            return result;
        }
}
