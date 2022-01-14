package Lab.Generics.JarOfT;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Jar<Pickle> jarOfPickles= new Jar<>();
        Pickle pickle = new Pickle(1000,2021,"#1");
        jarOfPickles.add(new Pickle(1000,2021,"#2"));
        jarOfPickles.add(new Pickle(1000,2021,"#3"));

        Pickle removed= jarOfPickles.remove();
        System.out.println(removed);

        jarOfPickles.add(new Pickle(1000,2021,"#4"));




    }
}
