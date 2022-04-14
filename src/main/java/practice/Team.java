package practice;

import java.util.Collection;

public abstract class Team<T> {
    private Collection<T> players;
    private String teamName;
    private String headCoachName;
    private int  budget;


    public Team(String teamName, String headCoachName, int budget) {
        this.teamName = teamName;
        this.headCoachName = headCoachName;
        this.budget = budget;
    }

    public abstract T buyPlayer(T newPlayer);
    public abstract T sellPlayer(T delPlayer);

    public void addBudget(int budget){
        this.budget += budget;
    }

    public void reduceBudget(int budget){
        this.budget += budget;
    }
    public Collection<T> getPlayers(){
        return players;
    }
    public void setPlayers(Collection<T> players){
        this.players = players;
    }

    public boolean removePlayer(T player){
       return players.remove(player);
    }
    public boolean addPlayer(T player){
        return players.remove(player);
    }


}
