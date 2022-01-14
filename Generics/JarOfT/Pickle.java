package Lab.Generics.JarOfT;

public class Pickle {
    private int capacity;
    private int year;
    private String id;

    public Pickle(int capacity, int year, String id) {
        this.capacity = capacity;
        this.year = year;
        this.id = id;
    }
    public String toString(){
        return String.format("%s %d %d",id,capacity,year);
    }
}

