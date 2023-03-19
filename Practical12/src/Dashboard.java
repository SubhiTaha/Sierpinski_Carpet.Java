public class Dashboard {
    public static void main(String[] args) {
        Team i1 = new Team("Bayern munich");
        Team i2 = new Team("Liverpool");
        Team i3 = new Team("Chelsea");

        FootballLeague FL = new FootballLeague("Champions League");

        FL.Addteam(i1);
        FL.Addteam(i2);
        FL.Addteam(i3);
    }
}