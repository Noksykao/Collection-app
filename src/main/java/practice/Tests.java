package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tests {
    public static void main(String[] args) {
        FootballPlayer fp1 = new FootballPlayer( "Leo", "Messi", 35, 10, 89, 92);
        FootballPlayer fp2 = new FootballPlayer( "Tiery", "Henry", 34, 12, 87, 93);
        FootballPlayer fp3 = new FootballPlayer( "S", "Ramos", 37, 13, 67, 76);
        FootballPlayer fp4 = new FootballPlayer( "G", "Bale", 29, 7, 86, 88);
        FootballPlayer fp5 = new FootballPlayer( "X", "Stranger", 23, 63, 82, 91);

        Set<FootballPlayer> fplayer = new HashSet<>(Arrays.asList(fp1, fp2, fp3, fp4));

        FootballTeam fTeam = new FootballTeam("All Stars", "Zidane", 1000000);
        fTeam.setPlayers(fplayer);

        fTeam.sellPlayer(fp3);
        fTeam.buyPlayer(fp5);


        for(FootballPlayer player : fTeam.getPlayers()){
            System.out.println(player);
            fTeam.getPlayers().remove(player);

        }
//        fTeam.getPlayers().iterator();
        }
    }




