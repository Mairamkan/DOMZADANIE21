import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Alphavit txt");
        fileWriter.write("Aa " +
                             "Bb " +
                             "Cc " +
                             "Dd " +
                             "Ee " +
                             "Ff " +
                             "Gg " +
                             "Hh " +
                             "Ii " +
                             "Jj " +
                             "Kk " +
                             "Ll " +
                             "Mm " +
                             "Nn " +
                             "Oo " +
                             "Pp " +
                             "Qq " +
                             "Rr " +
                             "Ss " +
                             "Tt " +
                             "Uu " +
                             "Vv " +
                             "Ww " +
                             "Xx " +
                             "Yy " +
                             "Zz ");
       


        fileWriter.write("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26");




        fileWriter.close();

        FileReader fileReader = new FileReader("Alphavit txt");
        Scanner scanner = new Scanner(fileReader);
        System.out.println(scanner.nextLine());

    }
}

