package Day_1_mon;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Datafiles {


    public static void workingWithFilesTest(){

        // Method to create a txt file called "TestFile"

        File testfile = new File("src/main/java/Day_1_mon/TestFile.txt");

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

    } }














//        try {
//            FileWriter fileWriter = new FileWriter(file, true);
//
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            printWriter.println("Foo");
//            printWriter.println("Bar");
//
//            printWriter.flush();
//            printWriter.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            Scanner scanner = new Scanner(file);
//            while(scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
