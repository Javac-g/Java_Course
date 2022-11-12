package Lecture9.model;

public class Order {
    private boolean open;
    private Tour tour;
    private boolean liked;
    private int OrderNumber;

    public Order(Tour tour) {
        if(tour == null){
            throw new IllegalArgumentException("Wrong tour number");
        }
        this.tour = tour;
        open = true;
    }

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        OrderNumber = orderNumber;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public boolean isOpen() {
        return open;
    }
}
