package pl.sda.mapy;

public class Generyka <T>{
    private T filed;

    public Generyka(T filed) {
        this.filed = filed;
    }

    public T getFiled() {
        return filed;
    }
}
