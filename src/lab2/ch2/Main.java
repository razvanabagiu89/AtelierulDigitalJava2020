package lab2.ch2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Premiu oscar1990 = new Premiu("oscar", 1990);
//        Premiu oscar2000 = new Premiu("oscar", 2000);
//        Premiu oscar2010 = new Premiu("oscar", 2010);
//        Premiu oscar2018 = new Premiu("oscar", 2018);

        Premiu oscar1 = new Premiu("Oscar", 2001);
        Premiu oscar2 = new Premiu("Oscar", 2002);
        Premiu oscar3 = new Premiu("Oscar", 2003);
        Premiu oscar4 = new Premiu("Oscar", 2018);

        Actor actorOscar1 = new Actor("The Rock", 35, new Premiu[]{oscar1, oscar2});
        Actor actorOscar3 = new Actor("Chris Evans", 55, new Premiu[]{oscar3});
        Actor actorOscar4 = new Actor("Jennifer Lawrence", 23, new Premiu[]{oscar4});
        Actor actorNoOscar1 = new Actor("Channing Tatum", 33, new Premiu[]{});
        Actor actorNoOscar2 = new Actor("George Clooney", 60, new Premiu[]{});
        Actor actorNoOscar3 = new Actor("Silvester Stallone", 20, new Premiu[]{});

        Film film1 = new Film(1990, "Spiderman", new Actor[]{actorOscar1,
                actorNoOscar1});
        Film film2 = new Film(2010, "The Cave", new Actor[]{actorNoOscar1,
                actorNoOscar2, actorNoOscar3});
        Film film3 = new Film(2010, "Go", new Actor[]{actorNoOscar1,
                actorNoOscar2, actorNoOscar3});
        Film film4 = new Film(2018, "Check It", new Actor[]{actorOscar3,
                actorNoOscar3});
        Film film5 = new Film(2018, "Prison", new Actor[]{actorNoOscar2,
                actorNoOscar3});

        Studio studio1 = new Studio("StaticVFX", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDb = new Studio[]{studio1, studio2};
        ArrayList<String> oscars = new ArrayList<>();
        ArrayList<String> movies = new ArrayList<>();
        ArrayList<String> actors = new ArrayList<>();

        for (Studio studio : studioDb) {
            if (studio.getFilme().length > 2){
                if (!movies.contains(studio.getNume())) {
                    movies.add(studio.getNume());
                }
            }
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getNume().equals("The Rock")) {
                        if (!oscars.contains(studio.getNume())) {
                            oscars.add(studio.getNume());
                        }
                    }
                    if (actor.getVarsta() > 30) {
                        if (!actors.contains(studio.getNume())) {
                            actors.add(studio.getNume());
                        }
                    }
                }
            }
        }
        System.out.println("Has actors with age bigger than 30: " + actors);
        System.out.println("Studio with over 2 movies: " + movies);
        System.out.println("Has actors with over 2 oscar trophies: " + oscars);
        
    }
}
