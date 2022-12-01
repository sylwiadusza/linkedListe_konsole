import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> konsole = new LinkedList<>();
        konsole.add("xbox");
        konsole.add("xbox");
        konsole.add("ps5");
        konsole.add("ps2");
        konsole.add("xbox");
        konsole.add("ps4");
        konsole.add("nintendo");
        konsole.add("pegazus");
        konsole.add("ps2");
        konsole.add("ps1");
        int count = 0;
        for (String x : konsole) {
            if ("xbox".equals(x)) {
                count++;
            }
        }
        System.out.println(count);


        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 0; i <= 40; i++) {
            liczby.add(i);
            if (i > 22 && i < 37) {
                System.out.print(liczby.get(i) + ",");
            }
        }


    }


}