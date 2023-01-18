package jpa.Application;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Application {

    public Application(){};

    private String readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private String constructResponse(String line){
        return "Zenodotus: " + line;
    }

    private void performCommand(String command){

    }

    public void run() throws IOException {
        System.out.println(">>> Zenodotus: Chaire! Type aid to see commands!");
        while(true){
            String response = readInput();
            switch(response){
                case ("enlist-new-book") ->{
                    System.out.println(constructResponse("You can choose from the following options:"));
                    System.out.println(constructResponse("1) Tell me about it."));
                    System.out.println(constructResponse("2) Provide a path to a .json containing the information about it."));
                    System.out.println(constructResponse("3) Provide a path to a .csv for bulk upload."));
                    int option = Integer.parseInt(readInput());
                    System.out.println(option);
                }
                case("aid") ->{
                    System.out.println(constructResponse("At your service, traveller!"));
                }
                default -> {
                    System.out.println(constructResponse("You must be speaking barbaric! Try again."));
                }

            }
        }
    }
}
