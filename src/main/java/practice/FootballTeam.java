package practice;

import java.util.*;

public class FootballTeam extends Team<FootballPlayer>{
    private static Map<String, Collection<FootballPlayer>> mapOfFootballTeam = new HashMap<>();

    public FootballTeam(String teamName, String headCoachName, int budget) {
        super(teamName, headCoachName, budget);
        if (getPlayers() != null && getPlayers().size() > 0){
            mapOfFootballTeam.put(teamName, getPlayers());
        }
    }

    @Override
    public FootballPlayer buyPlayer(FootballPlayer newPlayer) {
        // -- Budget
        reduceBudget(newPlayer.getExp() * newPlayer.getRate() * newPlayer.getTalent());
        // ++ Player
        if (addPlayer(newPlayer)) return newPlayer;
        return null;
    }

    @Override
    public FootballPlayer sellPlayer(FootballPlayer delPlayer) {
        addBudget(delPlayer.getExp() * delPlayer.getRate() * delPlayer.getTalent());
        if (removePlayer(delPlayer)) return delPlayer;
        return null;
    }

    public Collection<FootballPlayer> getPlayers(){
        Set<FootballPlayer> fplayers = (HashSet<FootballPlayer>) super.getPlayers();
        if (fplayers != null)
            return Collections.unmodifiableCollection(fplayers);
        return null;
    }



}
