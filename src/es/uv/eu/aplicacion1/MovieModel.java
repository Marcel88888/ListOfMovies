package es.uv.eu.aplicacion1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.List;
import java.util.Iterator;


public class MovieModel {
    
    private HashSet<Movie> peliculas;
    
    public MovieModel(){
        peliculas = new HashSet<>();
    }
    
    public boolean add(Movie p){
        return peliculas.add(p);
    }
    
    public int getNumberOfMovies() {
        return peliculas.size();
    }
    
    public List getTop3() {
        TreeSet<Movie> orderedMovies = new TreeSet<>(new MyDateComparator());
        orderedMovies.addAll(peliculas);
        List<Movie> top3 = new ArrayList<>();
        int counter = 0;
        Iterator<Movie> it = orderedMovies.iterator(); 
        while(it.hasNext() && counter < 3) {
            top3.add(it.next());
            counter++;
        }
        return top3; 
    }
 
    private class MyDateComparator implements Comparator<Movie>{
 
        @Override
        public int compare(Movie m1, Movie m2) {
            if(m1.getAnyo() < m2.getAnyo()){
                return 1;
            } else {
                return -1;
            }
        }
    }
    
    @Override
    public String toString(){
        String resultado="";
        for (Movie p : peliculas) {
            resultado=resultado+p.toString()+"\n";
        }
        return resultado; 
    }
    
    public static void main(String[] argv) {
        MovieModel coleccion=new MovieModel();
        coleccion.add(new Movie("2001: Una Odisea en el Espacio",
            "Stanley Kubrick",1968,Movie.CIENCIA_FICCION));
        coleccion.add(new Movie("2046","Wong Kar Wai",2004,
            Movie.CIENCIA_FICCION));
        System.out.println(coleccion);
    } 
}