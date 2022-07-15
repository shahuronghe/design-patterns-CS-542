package hfmenuiteratorvisitor;

import java.util.Scanner;

public class MenuTestDrive {
	public static void main(String args[]) {

		MenuComponent actionMovies = new ListMenu("Action Movies", "Here we consist of actions movies only....");

		actionMovies.add(new MenuItem("The Adam Project",
				"After accidentally crash-landing in 2022, time-traveling fighter pilot Adam Reed teams up with his 12-year-old self for a mission to save the future.",
				"Shawn Levy", "Ryan Reynolds, Walker Scobell, Mark Ruffalo, Jennifer", 2022));

		actionMovies.add(new MenuItem("The Last Kingdom",
				"As Alfred the Great defends his kingdom from Norse invaders, Uhtred--born a Saxon but raised by Vikings--seeks to claim his ancestral birthright.",
				"Jon East", "Alexander Dreymon, Eliza Butterworth, Arnas Fedaravicius, Mark Rowley", 2015));

		actionMovies.add(new MenuItem("The Boys",
				"A group of vigilantes set out to take down corrupt superheroes who abuse their superpowers.",
				"Eric Kripke", "Karl Urban, Jack Quaid, Antony Starr, Erin Moriarty", 2019));

		actionMovies.add(new MenuItem("Attack on Titan",
				"Fueled by the death of his mother at the hands of the titans, Eren Jaeger vows revenge against the species that have breached through the enclosing walls after 100 years of peace, threatening the remains of humanity.",
				"Hajime Isayama", "Josh Grelle, Yûki Kaji, Yui Ishikawa, Marina Inoue", 2013));

		actionMovies.add(new MenuItem("Dune",
				"A noble family becomes embroiled in a war for control over the galaxy's most valuable asset while its scion becomes troubled by visions of a dark future.",
				"Denis Villeneuve", "Sam Corlett, Leo Suter, Jóhannes Haukur Jóhannesson, Lujza Richter", 2022));

		actionMovies.add(new MenuItem("The King's Man",
				"In the early years of the 20th century, the Kingsman agency is formed to stand against a cabal plotting a war to wipe out millions.",
				"Matthew Vaughn", "Ralph Fiennes, Gemma Arterton, Rhys Ifans, Harris Dickinson", 2021));

		MenuComponent comedyMovies = new ListMenu("Comedy Movies", "Here we consist of comedy movies only....");

		comedyMovies.add(new MenuItem("Turning Red ",
				"A 13-year-old girl named Meilin turns into a giant red panda whenever she gets too excited.",
				"Domee Shi", "Rosalie Chiang, Sandra Oh, Ava Morse, Hyein Park", 2022));

		comedyMovies.add(new MenuItem("Fresh",
				"The horrors of modern dating seen through one young woman's defiant battle to survive her new boyfriend's unusual appetites.",
				"Mimi Cave", "Daisy Edgar-Jones, Sebastian Stan, Jojo T. Gibbs, Andrea Bang", 2022));

		comedyMovies.add(new MenuItem("Encanto",
				"A Colombian teenage girl has to face the frustration of being the only member of her family without magical powers.",
				"Byron Howard, Jared Bush", "Stephanie Beatriz, María Cecilia Botero, John Leguizamo, Mauro", 2021));

		comedyMovies.add(new MenuItem("CODA",
				"As a CODA (Child of Deaf Adults) Ruby is the only hearing person in her deaf family.", "Sian Heder",
				"Emilia Jones, Marlee Matlin, Troy Kotsur, Daniel Durant", 2021));

		comedyMovies.add(new MenuItem("Marry Me",
				"Music superstars Kat Valdez and Bastian are getting married before a global audience of fans. But when Kat learns, seconds before her vows, that Bastian has been unfaithful, she instead decides to marry Charlie, a stranger in the crowd.",
				"Kat Coiro", "Jennifer Lopez, Owen Wilson, Maluma, John Bradley", 2022));

		MenuComponent horrorMovies = new ListMenu("Horror Movies", "Here we consist of horror movies only....");

		horrorMovies.add(new MenuItem("X",
				"In 1979, a group of young filmmakers set out to make an adult film in rural Texas, but when their reclusive, elderly hosts catch them in the act, the cast find themselves fighting for their lives.",
				"Ti West", "Mia Goth, Jenna Ortega, Brittany Snow, Kid Cudi", 2022));

		horrorMovies.add(new MenuItem("Malignant",
				"Madison is paralyzed by shocking visions of grisly murders, and her torment worsens as she discovers that these waking dreams are in fact terrifying realities.",
				"James Wan", "Annabelle Wallis, Maddie Hasson, George", 2021));

		horrorMovies.add(new MenuItem("Lamb 2",
				"A childless couple, María and Ingvar discover a mysterious newborn on their farm in Iceland. The unexpected prospect of family life brings them much joy, before ultimately destroying them.",
				"Valdimar Johannsson", "Noomi Rapace, Hilmir Snær Guðnason, Björn Hlynur Haraldsson", 2021));

		horrorMovies.add(new MenuItem("The Night House",
				"A widow begins to uncover her recently deceased husband's disturbing secrets.", "David Bruckner",
				"Rebecca Hall, Sarah Goldberg, Vondie", 2020));

		MenuComponent romanticMovies = new ListMenu("Romantic Movies", "Here we consist of romantic movies only....");

		romanticMovies.add(new MenuItem("West Side Story",
				"An adaptation of the 1957 musical, West Side Story explores forbidden love and the rivalry between the Jets and the Sharks, two teenage street gangs of different ethnic backgrounds.",
				"Steven Spielberg", "Ansel Elgort, Rachel Zegler, Ariana DeBose, David Alvarez", 2021));

		romanticMovies.add(new MenuItem("Radhe Shyam", "A romantic drama set in Europe during the 1970s.",
				"Radha Krishna Kumar", "Prabhas, Pooja Hegde, Bhagyashree Patwardhan, Krishnamraju", 2022));

		romanticMovies.add(new MenuItem("The Eyes of Tammy Faye",
				"An intimate look at the extraordinary rise, fall and redemption of televangelist Tammy Faye Bakker.",
				"Michael Showalter", "Jessica Chastain, Andrew Garfield, Cherry Jones, Vincent D'Onofrio", 2021));

		romanticMovies.add(new MenuItem("Titanic",
				"A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.",
				"James Cameron", "Leonardo DiCaprio, Kate Winslet, Billy Zane, Kathy Bates", 1997));

		MenuComponent marvelMovies = new ListMenu("Marvel Movies", "Here we consist of marvel movies only....");

		marvelMovies.add(new MenuItem("The Fantastic Four",
				"When dosed with cosmic rays, four intrepid explorers are given incredible powers.", "Oley Sassone",
				"Alex Hyde-White, Jay Underwood, Rebecca Staab, Michael Bailey Smith", 1994));

		marvelMovies.add(new MenuItem("X- Men",
				"In a world where mutants (evolved super-powered humans) exist and are discriminated against, two groups form for an inevitable clash: the supremacist Brotherhood, and the pacifist X-Men.",
				"Bryan Singer", "Patrick Stewart, Hugh Jackman, Ian McKellen, Famke Janssen", 2000));

		marvelMovies.add(new MenuItem("Hulk",
				"Bruce Banner, a genetics researcher with a tragic past, suffers an accident that causes him to transform into a raging green monster when he gets angry.",
				"Ang Lee", "Eric Bana, Jennifer Connelly, Sam Elliott, Josh Lucas", 2003));

		marvelMovies.add(new MenuItem("Spider-Man 2",
				"Peter Parker is beset with troubles in his failing personal life as he battles a brilliant scientist named Doctor Otto Octavius.",
				"Sam Raimi", "Tobey Maguire, Kirsten Dunst, Alfred Molina, James Franco", 2004));

		MenuComponent allMenus = new ListMenu("ALL Movies", "All movies combined");

		allMenus.add(romanticMovies);
		allMenus.add(marvelMovies);
		allMenus.add(horrorMovies);
		allMenus.add(comedyMovies);
		allMenus.add(actionMovies);

		Server server = new Server(allMenus);
		// Server server = new Server(dcMovies);
		// server.printVegetarianMenu();
		System.out.println("+++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++");
		System.out.println("All Movies");
		server.printMenu();

		Scanner sc = new Scanner(System.in);
		String choice = "Y";
		String sInput = "";

		do {
			System.out.println(
					"\n\nEnter the keyword by which you to search the movie\nYou can enter movie name/description/Actors/Director/Year: ");
			sInput = sc.nextLine();
			System.out.println();
			server.search(sInput);
			System.out.println("\n\nDo you want to continue?(Y/y/N/n): ");
			choice = sc.nextLine();
			if(choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("N")) {
				System.exit(0);
			}
		} while (choice.equalsIgnoreCase("Y"));

	}
}
