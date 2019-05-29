package racetest;

import org.junit.Test;
import race.*;
import static org.junit.Assert.*;
public class RaceTest {
    @Test
    public void shouldGetWinnerName() {
        Runner rahul = new Runner("rahul", 99.5);
        Runner ankita = new Runner("ankita", 9.5);
        Runner komal = new Runner("koaml", 10.5);
        Runner pooja = new Runner("pooja", 15.5);
        Race race = new Race();
        race.addRunner(rahul);
        race.addRunner(ankita);
        race.addRunner(komal);
        race.addRunner(pooja);
        String winner = ankita.name;
        assertEquals(winner,race.getWinner().name);
    }
}
