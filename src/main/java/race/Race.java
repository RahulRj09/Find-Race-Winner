package race;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Runner> runners = new ArrayList<>();

    public void addRunner(Runner runner) {
        runners.add(runner);
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public Runner getWinner() {
       Runner winner = runners.get(0);
        double time = runners.get(0).finishingTime;
        for (int i = 0; i < runners.size(); i++) {
            if (runners.get(i).finishingTime < time) {
                time = runners.get(i).finishingTime;
                winner = runners.get(i);
            }
        }
        return winner;
    }
}
