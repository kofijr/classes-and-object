public class Movie {
  private String title;
  private String studio;
  private String rating;


public Movie(String t, String s, String r){
  title = t;
  studio = s;
  rating = r;
}

public Movie(String t, String s){

    title = t;
    studio = s;
    rating ="PG ";
    }

public static Movie[] getPG(Movie [] movie){
  Movie [] pgmovie = new Movie [movie.length];

  int newArrayIndex = 0;
  for (int i =0; i< movie.length; i++){
   if (movie[i].rating.equals("PG")){
     pgmovie[newArrayIndex]= movie[i];
     newArrayIndex++;
   }
}
  return pgmovie;
}

Movie movie = new Movie("Casino Royale","Eon Productions", "PG-13");
}
