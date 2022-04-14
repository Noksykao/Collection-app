package practice;

import lombok.Data;

@Data
public class FootballPlayer extends Player {



    public FootballPlayer(String name, String lastName, int age, int exp, int talent, int rate) {
        super(name, lastName, age);
        this.exp = exp;
        this.talent = talent;
        this.rate = rate;
    }

    @Override
    void play() {
        System.out.println("play football");
    }
    private int exp;
    private int talent;
    private int rate;


}
