package Day_1_mon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {


    //Q1) Create a file under src/data.txt with the content specified (on discord)
    //    Read the file , and turn each row into objects stored in a list<Person> people = new ArrayList<>();



    // There is no point creating the file using code here as i need to copy and paste the contents into the file
    // so file will be created using the code from database as this creates an empty txt file, done below:



    public static void createEmptyFile(){

        // Method to create a txt file

        File testfile = new File("src/data.txt");

        if (!testfile.exists()){
            try {
                System.out.println(testfile.createNewFile());
                System.out.println("File has been Created");
            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
            System.out.println("Sorry file with that name already exists");
        }

    }

    public static void readFile() {


        // Created an ArrayList called users, which takes Person objects from the UserDatabase class
        ArrayList<UserDatabase.Person> users = new ArrayList<>();



        //Next step is to initialize the buffer reader and use its filereader to read the data file
        try {
            BufferedReader scan = new BufferedReader(new FileReader("src/data.txt"));
            String s = "";
            while ((s = scan.readLine()) != null) {
                if (s.contains("id,first_name,last_name,email,gender")) {
                    continue;
                }
//                System.out.println(s);


// the while loop is still inside the try statement so as the method reads from the file, string s takes what is read PER LINE into a string value readable by java
                // (note: scan.readline , this is why its per line)
// if s contains the 'string' equal to the first line it has been told to ignore and continue since this line is not valuable data but more of instructions


// NOTE this method ABOVE essentially runs the whole try statement for each line it reads filling out the Array values per line as it runs until all lines have been read
// THIS IS WHY  System.out.println(users.get(2)); would only work for the first user when i put it INSIDE the while loop, but ALL users when i moved it outside the while loop

                String[] editedLine = s.split(",");



//Since the file splits the important data using commas, .split is used on s which takes the string and splits it into a String Array called editedLine (String[])
// using the commas to differentiate the different values
// e.g:  1,Fanchette,Williamson,fwilliamson0@github.com,F
// so each value here has been assigned to the String Array editedLine in order, hence editedLine[0] = 1 ,  editedLine[1] = Fanchette , editedLine[2] = Williamson and so on



                    UserDatabase.Person user = new UserDatabase.Person(editedLine[0], editedLine[1], editedLine[2], editedLine[3], editedLine[4]);
                    users.add(user);

 // Here a new 'user' belonging to the Person class is initialised, because Person has been created in the UserDatabase class that must be reference to reference Person
// When creating a 'user' , the properties of a Person have already been defined in its class eg firstname lastname etc
// these properties are then assigned a split value from the String Array editedLine[] corresponding to the correct value required

                // the user with its correct corresponding data values is then added to the 'users' ArrayList which is initialized at the start of this method
                // using (users.add(user)).........
                //a user with key values has been added into the users ArrayList and the loop begins again for the NEXT LINE



              //  System.out.println(users.get(2)) was placed here initially ( did not work due to index referencing error)
                // had to move it outside the loop , SEEN BELOW: this works allowing individual users details to be called

            }
            System.out.println(users.get(2));
            System.out.println(users.get(9));


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error File not found");
        }


    }
}



