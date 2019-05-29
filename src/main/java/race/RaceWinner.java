package race;

public class RaceWinner {
    public static void main(String[] args) {
        Runner rahul = new Runner("rahul", 99.5);
        Runner ankita = new Runner("ankita", 9.5);
        Runner komal = new Runner("koaml", 10.5);
        Runner pooja = new Runner("pooja", 15.5);
        Race race = new Race();
        race.addRunner(rahul);
        race.addRunner(ankita);
        race.addRunner(komal);
        race.addRunner(pooja);
        System.out.println(race.getRunners());
        System.out.println(race.getWinner().name);
    }
}
