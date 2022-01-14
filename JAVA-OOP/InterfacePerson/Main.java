package InterfacePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        List<Buyer> buyers=new ArrayList<>();
        Buyer buyer;
        while (n-->0){
            String[] tokens=scan.nextLine().split("\\s+");
            if(tokens.length==4){
                buyer= new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2],tokens[3]);
            }else {
              buyer= new Rebel(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
            }
            buyers.add(buyer);
        }
        String name=scan.nextLine();
        while (!name.equals("End")){
            for (Buyer buyer1 : buyers) {
                if(buyer1.getName().equals(name)){
                    buyer1.buyFood();
                }

            }


            name=scan.nextLine();
        }
        System.out.println(buyers.stream().mapToInt(Buyer::getFood).sum());

    }

}
