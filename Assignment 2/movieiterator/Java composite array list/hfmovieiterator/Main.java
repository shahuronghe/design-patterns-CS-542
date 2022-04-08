package hfmovieiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        MovieGroup actionMovies = new MovieGroupArray("Action Movies","Here we consist of actions movies only....");

        actionMovies.add(
                new Movie(
                        "The Adam Project",
                        "After accidentally crash-landing in 2022, time-traveling fighter pilot Adam Reed teams up with his 12-year-old self for a mission to save the future.",
                        "Action, Adventure",
                        6.8f,
                        2022,
                        "Ryan Reynolds, Walker Scobell, Mark Ruffalo, Jennifer"
                )
        );

        actionMovies.add(
                new Movie(
                        "The Last Kingdom",
                        "As Alfred the Great defends his kingdom from Norse invaders, Uhtred--born a Saxon but raised by Vikings--seeks to claim his ancestral birthright.",
                        "Action, Drama, History",
                        8.5f,
                        2015,
                        "Alexander Dreymon, Eliza Butterworth, Arnas Fedaravicius, Mark Rowley"
                )
        );

        actionMovies.add(
                new Movie(
                        "The Boys",
                        "A group of vigilantes set out to take down corrupt superheroes who abuse their superpowers.",
                        "Action, Crime, Drama",
                        8.7f,
                        2019,
                        "Karl Urban, Jack Quaid, Antony Starr, Erin Moriarty"
                )
        );

        actionMovies.add(
                new Movie(
                        "Attack on Titan",
                        "Fueled by the death of his mother at the hands of the titans, Eren Jaeger vows revenge against the species that have breached through the enclosing walls after 100 years of peace, threatening the remains of humanity.",
                        "Animation, Action, Adventure",
                        9.1f,
                        2013,
                        "Josh Grelle, Yûki Kaji, Yui Ishikawa, Marina Inoue"
                )
        );

        actionMovies.add(
                new Movie(
                        "Dune",
                        "A noble family becomes embroiled in a war for control over the galaxy's most valuable asset while its scion becomes troubled by visions of a dark future.",
                        "Action, Adventure, Drama",
                        7.1f,
                        2022,
                        "Sam Corlett, Leo Suter, Jóhannes Haukur Jóhannesson, Lujza Richter"
                )
        );

        actionMovies.add(
                new Movie(
                        "The King's Man",
                        "In the early years of the 20th century, the Kingsman agency is formed to stand against a cabal plotting a war to wipe out millions.",
                        "Action, Adventure, Thriller",
                        6.3f,
                        2021,
                        "Ralph Fiennes, Gemma Arterton, Rhys Ifans, Harris Dickinson"
                )
        );

        MovieGroup comedyMovies = new MovieGroupArrayList("Comedy Movies","Here we consist of comedy movies only....");

        comedyMovies.add(
                new Movie(
                        "Turning Red ",
                        "A 13-year-old girl named Meilin turns into a giant red panda whenever she gets too excited.",
                        "Animation, Adventure, Comedy",
                        7.1f,
                        2022,
                        "Rosalie Chiang, Sandra Oh, Ava Morse, Hyein Park"
                )
        );

        comedyMovies.add(
                new Movie(
                        "Fresh",
                        "The horrors of modern dating seen through one young woman's defiant battle to survive her new boyfriend's unusual appetites.",
                        "Comedy, Horror, Thriller",
                        6.7f,
                        2022,
                        "Daisy Edgar-Jones, Sebastian Stan, Jojo T. Gibbs, Andrea Bang"
                )
        );

        comedyMovies.add(
                new Movie(
                        "Encanto",
                        "A Colombian teenage girl has to face the frustration of being the only member of her family without magical powers.",
                        "Animation, Comedy, Family",
                        7.3f,
                        2021,
                        "Stephanie Beatriz, María Cecilia Botero, John Leguizamo, Mauro"
                )
        );

        comedyMovies.add(
                new Movie(
                        "CODA",
                        "As a CODA (Child of Deaf Adults) Ruby is the only hearing person in her deaf family.",
                        "Comedy, Drama, Music",
                        8.0f,
                        2021,
                        "Emilia Jones, Marlee Matlin, Troy Kotsur, Daniel Durant"
                )
        );

        comedyMovies.add(
                new Movie(
                        "Marry Me",
                        "Music superstars Kat Valdez and Bastian are getting married before a global audience of fans. But when Kat learns, seconds before her vows, that Bastian has been unfaithful, she instead decides to marry Charlie, a stranger in the crowd.",
                        "Comedy, Music, Romance",
                        6.1f,
                        2018,
                "Jennifer Lopez, Owen Wilson, Maluma, John Bradley"
                )
        );

        MovieGroup horrorMovies = new MovieGroupArrayList("Horror Movies","Here we consist of horror movies only....");

        horrorMovies.add(
                new Movie(
                        "X",
                        "In 1979, a group of young filmmakers set out to make an adult film in rural Texas, but when their reclusive, elderly hosts catch them in the act, the cast find themselves fighting for their lives.",
                        "Horror",
                        7.4f,
                        2022,
                        "Mia Goth, Jenna Ortega, Brittany Snow, Kid Cudi"
                )
        );

        horrorMovies.add(
                new Movie(
                        "Malignant",
                        "Madison is paralyzed by shocking visions of grisly murders, and her torment worsens as she discovers that these waking dreams are in fact terrifying realities.",
                        "Crime, Horror, Mystery",
                        6.3f,
                        2021,
                        "Annabelle Wallis, Maddie Hasson, George"
                )
        );

        horrorMovies.add(
                new Movie(
                        "Lamb 2",
                        "A childless couple, María and Ingvar discover a mysterious newborn on their farm in Iceland. The unexpected prospect of family life brings them much joy, before ultimately destroying them.",
                        "Drama, Fantasy, Horror",
                        6.3f,
                        2021,
                        "Noomi Rapace, Hilmir Snær Guðnason, Björn Hlynur Haraldsson"
                )
        );

        horrorMovies.add(
                new Movie(
                        "The Night House",
                        "A widow begins to uncover her recently deceased husband's disturbing secrets.",
                        "Horror, Mystery, Thriller",
                        6.5f,
                        2020,
                        "Rebecca Hall, Sarah Goldberg, Vondie"
                )
        );

        MovieGroup romanticMovies = new MovieGroupArrayList("Romantic Movies","Here we consist of romantic movies only....");

        romanticMovies.add(
                new Movie(
                        "West Side Story",
                        "An adaptation of the 1957 musical, West Side Story explores forbidden love and the rivalry between the Jets and the Sharks, two teenage street gangs of different ethnic backgrounds.",
                        "Drama, Romance, Western",
                        7.4f,
                        2021,
                        "Ansel Elgort, Rachel Zegler, Ariana DeBose, David Alvarez"
                )
        );

        romanticMovies.add(
                new Movie(
                        "Radhe Shyam",
                        "A romantic drama set in Europe during the 1970s.",
                        "Drama, Romance",
                        6.9f,
                        2022,
                        "Prabhas, Pooja Hegde, Bhagyashree Patwardhan, Krishnamraju"
                )
        );

        romanticMovies.add(
                new Movie(
                        "The Eyes of Tammy Faye",
                        "An intimate look at the extraordinary rise, fall and redemption of televangelist Tammy Faye Bakker.",
                        "Biography, Drama, Romance",
                        6.7f,
                        2021,
                        "Jessica Chastain, Andrew Garfield, Cherry Jones, Vincent D'Onofrio"
                )
        );

        romanticMovies.add(
                new Movie(
                        "Titanic",
                        "A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
                        "Drama, Romance",
                        7.9f,
                        1997,
                        "Leonardo DiCaprio, Kate Winslet, Billy Zane, Kathy Bates"
                )
        );

        MovieGroup marvelMovies = new MovieGroupArray("Marvel Movies","Here we consist of marvel movies only....");

        marvelMovies.add(
                new Movie(
                        "The Fantastic Four",
                        "When dosed with cosmic rays, four intrepid explorers are given incredible powers.",
                        "Action, Adventure, Family",
                        3.9f,
                        1994,
                        "Alex Hyde-White, Jay Underwood, Rebecca Staab, Michael Bailey Smith"
                )
        );

        marvelMovies.add(
                new Movie(
                        "X- Men",
                        "In a world where mutants (evolved super-powered humans) exist and are discriminated against, two groups form for an inevitable clash: the supremacist Brotherhood, and the pacifist X-Men.",
                        "Action, Adventure, Sci-Fi",
                        7.4f,
                        2000,
                        "Patrick Stewart, Hugh Jackman, Ian McKellen, Famke Janssen"
                )
        );

        marvelMovies.add(
                new Movie(
                        "Hulk",
                        "Bruce Banner, a genetics researcher with a tragic past, suffers an accident that causes him to transform into a raging green monster when he gets angry.",
                        "Action, Sci-Fi",
                        5.6f,
                    2003,
                    "Eric Bana, Jennifer Connelly, Sam Elliott, Josh Lucas"
                )
        );

        marvelMovies.add(
                new Movie(
                        "Spider-Man 2",
                        "Peter Parker is beset with troubles in his failing personal life as he battles a brilliant scientist named Doctor Otto Octavius.",
                        "Action, Adventure, Sci-Fi",
                        7.4f,
                        2004,
                        "Tobey Maguire, Kirsten Dunst, Alfred Molina, James Franco"
                )
        );


        // Composite of Array and ArrayList Implementation of MovieGroup
        CompositeIterator compositeIterator = new CompositeIterator();
        compositeIterator.add(actionMovies);
        compositeIterator.add(comedyMovies);
        compositeIterator.add(horrorMovies);
        compositeIterator.add(romanticMovies);
        compositeIterator.add(marvelMovies);

        compositeIterator.printMovieGroup();

        boolean isRunning = true;
        while(isRunning){
            printOptions();
            Scanner in = new Scanner(System.in);
            int op = Integer.parseInt(in.nextLine());

            List<Movie> resultData;
            switch (op){

                case 1 :
                    System.out.print("Enter Movie Name : ");
                    String movieName = in.nextLine().trim();
                    resultData = Search.searchByMovieName(movieName, compositeIterator.clone());
                    printList(resultData);
                    break;

                case 2 :
                    System.out.print("Enter Movie Genre : ");
                    String movieGenre = in.nextLine().trim();
                    resultData = Search.searchByGenre(movieGenre, compositeIterator.clone());
                    printList(resultData);
                    break;

                case 3 :
                    System.out.print("Enter Movie Rating : ");
                    float movieRating = Float.parseFloat(in.nextLine().trim());
                    resultData = Search.searchByRating(movieRating, compositeIterator.clone());
                    printList(resultData);
                    break;

                case 4 :
                    System.out.print("Enter Movie Year : ");
                    int movieYear = Integer.parseInt(in.nextLine().trim());
                    resultData = Search.searchByYear(movieYear, compositeIterator.clone());
                    printList(resultData);
                    break;

                case 5 :
                    System.out.print("Enter Movie Cast Name  : ");
                    String name = in.nextLine().trim();
                    resultData = Search.searchByCast(name, compositeIterator.clone());
                    printList(resultData);
                    break;

                case 6 :
                    isRunning = false;
                    break;

                default : break;
            }
        }

    }

    public static void printOptions(){
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<< Options >>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("1). Search by Movie Name.");
        System.out.println("2). Search by Genre.");
        System.out.println("3). Search by Rating.");
        System.out.println("4). Search by Year.");
        System.out.println("5). Search by Cast.");
        System.out.println("6). Quit.");
        System.out.print("Enter Your Option >>>>>> ");
    }

    public static void printList(List<Movie> list){
        System.out.println("------------------------"+list.size()+" results found !"+"------------------------");
        for(Movie movie : list){
            System.out.println(movie);
        }
        System.out.println();
    }
}
