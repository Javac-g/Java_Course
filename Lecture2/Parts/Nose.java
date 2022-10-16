package Lecture2.Parts;

public class Nose {
    private String smell;
    public Nose(String smell){
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void sniff(){
        System.out.println("I smelling " + smell + " now");
    }

    @Override
    public String toString() {
        return "Nose{" +
                "smell='" + smell + '\'' +
                '}';
    }
}
