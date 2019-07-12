package NewFile;

import java.io.*;

public class Files {
    public static void main(String args[]) {

        // Read a file and print the lines of file
        System.out.println();
        String filepath = "F:\\DataSets\\inputfile.txt";
        //String filepath=filepath1;
        String filecontents = "";
        int i = 1;
        String currentline;

        System.out.println(filepath);

        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            currentline = br.readLine();


            while (currentline != null) {

                System.out.println(currentline); // print each line read

                filecontents = filecontents + i + ". " + currentline + "\n" ; ;// 1st task - read all lines

                currentline = br.readLine();
                i++;

            }


            System.out.println(i);


            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("Now writing to files ");
        String filepath1 = "F:\\IdeaProjects\\outputfile.txt";


        try {
            FileWriter fw1 = new FileWriter(filepath1); // file to write al lines
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write(filecontents);
            bw1.close();
            fw1.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
