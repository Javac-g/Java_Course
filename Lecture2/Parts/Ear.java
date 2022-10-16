package Lecture2.Parts;

public class Ear {
    private String sound;
    public Ear(String sound){
        this.sound = sound;
    }

    public void listen(){

        System.out.println("I am hearing " + sound + " now");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
