package Lab.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();
        String input=scan.nextLine();
        String currentURL="";
        while (!input.equals("Home")){
            if(input.equals("back")){
                if(browser.size()<=1){
                    System.out.println("no previous URLs");
                    input=scan.nextLine();
                    continue;
                }else {
                    browser.pop();
                }
            }else {
                browser.push(input);
            }
            currentURL=browser.peek();
            System.out.println(currentURL);

            input=scan.nextLine();
        }

    }
}
