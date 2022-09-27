import java.util.ArrayList;

public class FiksturManagment {
    private ArrayList<Team> teams;

    public FiksturManagment(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public void run() {
        this.addTeam();
        this.checkTeamsAmount(this.teams);
        System.out.println("Takımlar:");
        this.printTeams(this.teams);
        this.matchTeams(this.teams);
    }

    public void printTeams(ArrayList<Team> teams) {
        for(Team team : teams) {
            if(!team.getName().equals("Bay"))
                System.out.println(team.getName());
        }
    }

    public void matchTeams(ArrayList<Team> team) {
        ArrayList<Team> insertedList = new ArrayList<>(team.subList(1, team.size()));
        int roundAmount = (team.size()-1)*2;
        for(int i = 1; i <= roundAmount; i++) {
            System.out.println("Round " + i);
            if(i%2!=0) {
                for(int k = 0; k<=team.size()-2;k+=2) {
                    System.out.println(team.get(k).getName() + " vs " + team.get(k+1).getName());
                }
            }
            else {
                for(int k = team.size()-1; k>0; k-=2) {
                    System.out.println(team.get(k).getName() + " vs " + team.get(k-1).getName());
                }
            }
            insertedList = insert(insertedList);
            for(int l = 1; l<team.size();l++) {
                    team.set(l,insertedList.get(l-1));
            }

        }
    }

    public ArrayList<Team> insert(ArrayList<Team> team) {
        ArrayList<Team> temp = new ArrayList<>();
        temp.addAll(team);
        for(int i = 0; i<team.size(); i++) {
            if(i == team.size()-1) {
                temp.set(i,team.get(0));
                break;
            }
           temp.set(i,team.get(i+1));
        }
        return temp;
    }

    public void addTeam() {
        teams.add(new Team("A"));
        teams.add(new Team("B"));
        teams.add(new Team("C"));
        teams.add(new Team("D"));
        teams.add(new Team("E"));
    }
    public void checkTeamsAmount(ArrayList<Team> teams) {
        if(teams.size()%2 != 0) {
            this.teams.add(new Team("Bay"));
        }
    }
}
