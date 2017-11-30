package cardealersystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserAuthentications {

    //scanner or buffered reader for users.txt
    private static File file = new File("Student.txt");

    public void addNewUser(String username, String pw){
        // VBadd info to users.txt
    }

    public boolean findUser(String username, String pw){
        boolean flag = false;
        try {
            Scanner scanner = new Scanner(file);
            //now read the file line by line...
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.equalsIgnoreCase(username)) {
                    flag = true;
                }
            }
        } catch(FileNotFoundException e) {
            System.err.println("File not found exception: " + e.getMessage());
        }
        return flag;
    }

    private void removeUser(String username, String pw){
        //remove user from users.txt
    }
}
