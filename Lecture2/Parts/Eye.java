package Lecture2.Parts;

public class Eye {
    private String  picture;
    public Eye(String picture){
        this.picture = picture;
    }
    public void see(){

        System.out.println("I am  looking at " + picture + " now");
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
