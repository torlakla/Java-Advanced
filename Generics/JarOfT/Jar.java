package Lab.Generics.JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar <T> {
    private Deque<T> content;

    public Jar() {
        this.content = new ArrayDeque<>();
    }
    public void add(T element){
        content.push(element);
    }
    public T remove(){
        return content.pop();
    }
}

