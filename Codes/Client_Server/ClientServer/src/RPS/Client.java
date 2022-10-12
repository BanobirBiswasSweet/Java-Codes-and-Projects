package RPS;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    
    public static String choices[] = {"rock", "paper", "scissors"};
    
    public static void main(String[] args) throws IOException {
        try {
            
            Socket clientSocket = new Socket("localhost", 4000);
            try {
                
                PrintWriter out = new PrintWriter(
                        clientSocket.getOutputStream(),true);;
                BufferedReader in = new BufferedReader(new InputStreamReader
                        (clientSocket.getInputStream()));
     
                Scanner inStream = new Scanner(in); 
                Scanner scanner = new Scanner(System.in);
                do {
                    System.out.println("");
                    System.out.println("Welcome to rock, paper, scissors!");
                    System.out.println("");
                    System.out.println("Enter player name: ");
                    
                    String player = scanner.nextLine();
                    out.println(player);
                    String choice = null;
                    while(true) {
                        System.out.println("Play rock, paper, or scissors: ");
                        Scanner choiceScanner = new Scanner(System.in);
                       
                        choice = choiceScanner.nextLine().toLowerCase();
                        if(!((choice.toLowerCase().equals(choices[0]))
                                || (choice.toLowerCase().equals(choices[1]))
                                || (choice.toLowerCase().equals(choices[2])))) {
                            System.out.println("Invalid choice, please enter"
                                + " rock, paper, or scissors!"); 
                            continue;
                        } else if (choice.toLowerCase().equals("rock") || 
                                choice.toLowerCase().equals("paper") || 
                                choice.toLowerCase().equals("scissors")) {
                            break;
                        }   
                    }
                    out.println(choice);
                    
                    String serverChoice = inStream.nextLine();
                    System.out.println("Player move: "+choice+
                            " Server move: "+serverChoice);
                    String winner = inStream.nextLine();
                    
                    if(winner.equals("Draw")) {
                        System.out.println("Draw! Re-play!");
                    } else {
                        System.out.println(winner);
                    }
                    System.out.println("");
                    while(true) {
                        System.out.println("Do you want to play again? Y/N");
                        String playAgain = scanner.nextLine();
                        if(playAgain.toLowerCase().equals("y")) {
                            break;
                        } else if(playAgain.toLowerCase().equals("n")) {
                            System.out.println("Exiting....");
                            System.exit(0);
                        } else {
                            System.out.println("");
                            System.out.println("Unknown input choice! "
                                    + " Please enter Y or N");
                            continue;
                        }
                    }
                
                } while(inStream.hasNextLine());
            
            } finally {
                clientSocket.close();
            }
         
        } catch (IOException e) {
            e.printStackTrace();
        }
      System.exit(0);
    }
}