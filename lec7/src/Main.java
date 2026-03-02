import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        FileReader luna = new FileReader("E:\\computerlearn\\Java\\Javahomework\\e51830701e0ef2989f97b7440ae2b996_Luna.txt");
        BufferedReader Luna = new BufferedReader(luna);
        FileReader mercuy=new FileReader("E:\\computerlearn\\Java\\Javahomework\\f55cc318f23d417c0aa339f2d90e08ed_Mercury.txt");
        BufferedReader Mercuy=new BufferedReader(mercuy);
        String line = null;
        ArrayList<Integer> sums=new ArrayList<>();
        while ((line = Luna.readLine()) != null) {
            String[] lineArray = line.split("\t");
            //System.out.println(Arrays.toString(lineArray));
            int sumreal=0;
            for (String s : lineArray) {
                if (!s.equals("\n") && !s.isEmpty()) {
                    int x = Integer.parseInt(s);
                    sumreal += x;

                }
                //int x = Integer.parseInt(s);
                //
            }
            line=Luna.readLine();
            sums.add(sumreal);
            System.out.println(sumreal);
        }
        while ((line = Mercuy.readLine()) != null) {
            String[] lineArray = line.split("\t");
            //System.out.println(Arrays.toString(lineArray));
            int sumreal=0;
            for (String s : lineArray) {
                if (!s.equals("\n") && !s.isEmpty()) {
                    int x = Integer.parseInt(s);
                    sumreal += x;

                }
                //int x = Integer.parseInt(s);
                //
            }
            line=Mercuy.readLine();
            sums.add(sumreal);
            System.out.println(sumreal);
        }


    }
}