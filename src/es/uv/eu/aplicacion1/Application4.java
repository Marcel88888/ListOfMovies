package es.uv.eu.aplicacion1;
public class Application4 {

    public static void main(String[] args) {

        MovieModel model = new MovieModel();
        createMovies(model);
        
        MovieView view = new MovieView(model);
        MovieController controller = new MovieController(model, view);

        view.setVisible(true);
    }
    
    static void createMovies(MovieModel peliculas) {
        peliculas.add(new Movie("2001: Una Odisea en el Espacio","Stanley Kubrick",1968, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("2046","Wong Kar Wai",2004,Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("Aeon Flux","Karyn Kusama",2005, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("Alien, el octavo pasajero","Ridley Scott",1979, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("Blade Runner","Ridley Scott",1982, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("Contact","Robert Zemeckis",1997, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("Las crónicas de Riddick","David Twohy",2004, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("Dune","David Lynch",1984, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("La guerra de los mundos","Byron Haskin",1953, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("El quinto elemento","Jean Luc Besson",1997, Movie.CIENCIA_FICCION));
        peliculas.add(new Movie("Pesadilla en Java Street","Miguel Arevalillo", 2012, Movie.TERROR));
    }
}

