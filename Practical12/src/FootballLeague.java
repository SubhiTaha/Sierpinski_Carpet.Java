import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FootballLeague {
    private String idFleague;
    private List<Team> teamsList;

    public FootballLeague(String idFleague) {
        this.idFleague = idFleague;
        this.teamsList = new LinkedList();
    }

    public String toString() {
        String output = "";
        output += "FootballLeague" + this.idFleague + "\n";
        Integer position = 1;
        for (Team team : this.teamsList) {
            output += team;
            output += team;
            position += 1;
        }
        return output;
    }

    public void Addteam(Team i) {
        this.teamsList.add(i);
    }

    public void win(Team i1, Team i2) {
        for (Team team : this.teamsList) {
            if (i1.getT_name().compareTo(team.getT_name()) == 0) {
                i1.IncreaseWins();
            }
            if (i1.getT_name().compareTo(team.getT_name()) == 0) {
                i1.IncreaseLosses();
            }
        }
        Collections.sort(this.teamsList);
        System.out.println(this);
    }
}
