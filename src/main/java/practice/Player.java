package practice;

public abstract class Player {
    abstract void play();
    private String name;
    private String lastName;
    private int age;

    public Player(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Player(){

    }

}
