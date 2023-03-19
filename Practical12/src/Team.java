public class Team implements Comparable<Team> {
    String T_name;
    int wins;
    int draws;
    int losses;
    int points;

    public Team(String T_name) {
        this.T_name = T_name;
        this.wins = 0;
        this.draws = 0;
        this.losses = 0;
        this.points = 0;
    }

    public String getT_name() { return T_name; }
    public void setT_name(String T_name) {
        this.T_name = T_name;
    }

    public void IncreaseWins() {
        this.wins += 1;
        updatepoints();
    }

    public void IncreaseLosses() {
        this.losses += 1;
    }

    public void updatepoints() {
        this.points += 3;
    }

    public String toString(){
        String output = "";
        output += "Team{\n";
        output += "\tName : " + this.T_name + "\n";
        output += "\tWins : " + this.wins + "\n";
        output += "\tLosses : " + this.losses + "\n";
        output += "\tDraws : " + this.draws + "\n";
        output += "\tPoints : " + this.points + "\n";
        output += "}";
        return output;
    }

    //this makes it possible to compare between Teams
    @Override
    public int compareTo(Team o) {
        return this.points - o.points;
    }
}



