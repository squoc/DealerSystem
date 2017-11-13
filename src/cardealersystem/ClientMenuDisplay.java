package cardealersystem;

import java.util.Scanner;
import java.io.Console;

public class ClientMenuDisplay {

    private String username;
    private char[] password;
    Scanner sc = new Scanner(System.in);

    //login screen will automatically create a connection to Echo server when credentials are provided
    void loginScreen(){
        System.out.println("Dealer Management System \n");
        System.out.println("Please login \n");
        System.out.println("Username:");

        username = sc.nextLine();
        //password = Console.readPassword("Enter your password: "); //This line will cause an error in IDEs
                                                                    //running on console gets rid of this error
                                                                    //temporarily commented out

        //Connect to Echo client/server, login data sent to crypto class then to Echo
    }

    //valid login returns a call to this function with a manager object from echo
    public void managerMenu(Manager mg){
        int userSelection;
        System.out.println("Dealer Management System \n Management Options for " + mg.getFullName());
        System.out.println("1. Daily Sales \n 2. Employee Sales \n 3. Find Customer \n 4. Inventories \n 5. Log off");
        userSelection = sc.nextInt();

        //pass user ID/PW, and userSelection to crypto then to echo
    }

    //valid login returns a call to this function with a salesperson object from echo
    public void salespersonMenu(Salesman sm) {
        int userSelection;
        System.out.println("Dealer Management System \n Sales Options for " + sm.getFullName());
        System.out.println("1. My Sales \n 2. Find Customer \n 3. Inventories \n 4. Log off");
        userSelection = sc.nextInt();

        //pass user ID/PW, and userSelection to crypto then to echo
    }

    //valid login returns a call to this function with a mechanic object from echo
    public void mechanicMenu(Mechanic mc){
        int userSelection;
        System.out.println("Dealer Management System \n Car Service options for " + mc.getFullName());
        System.out.println("1. Current Vehicle \n 2. Employee Sales \n 3. Find Customer \n 4. Inventories");
        userSelection = sc.nextInt();

        //pass user ID/PW, and userSelection to crypto then to echo
    }
}
