package Lecture2.Parts;

public class Ear {
    private String sound = "silence"; //'Hello  darkness my old friend' :);

    public void listen(String sound){
        this.sound = sound;
        System.out.println("I am hearing " + sound + " now");
    }
}
