package BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Identifiable> entities= new ArrayList<>();
        String input=scan.nextLine();
        Identifiable identifiable;
        while (!input.equals("End")){
            String[] data= input.split("\\s+");
            if(data.length==2){
               identifiable= new Robot(data[0],data[1]);
            }else {
                identifiable= new Citizen(data[0],Integer.parseInt(data[1]),data[2]);
            }
            entities.add(identifiable);


            input=scan.nextLine();
        }
        String idToCheck=scan.nextLine();
        for (Identifiable entity : entities) {
            if(entity.getId().endsWith(idToCheck)){
                System.out.println(entity.getId());
            }

        }
    }
}
