package Lecture9.model;

public class Order {
    private Tour tour;
    private boolean liked;

    public Order(Tour tour) {
        this.tour = tour;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
