package es.uv.eu.aplicacion1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MovieController {
    
    private MovieModel model;
    private MovieView view;
    
    public MovieController(MovieModel model, MovieView view) {
        this.model = model;
        this.view = view;
        view.addWindowListener(new MovieControllerWindowListener());
        view.setActionListener(new MovieControllerActionListener());
    }
    
    
    
    class MovieControllerWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Movie Controller: Close the window.");
            System.exit(0);
        }
    }
    
    class MovieControllerActionListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            switch(command) {
                case "exitButton":
                    System.out.println("MovieController: Exit button");
                    System.exit(0);
                    break;
                case "exitFile":
                    System.out.println("MovieController: Exit menu");
                    System.exit(0);
                    break;
                case "top3":
                    new TopView(model);
                    break;
                case "summary":
                    new SummaryView(model);
                    break;
                default:
                    System.out.println("MovieController: Command " + command + 
                            " no recognised.");
                    break;
            }
        }
    }
}
