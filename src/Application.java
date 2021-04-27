import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Participation> data = new ArrayList<>();

        for (int i  = 0; i < 5; i++) {
            data.add(new Participation());
        }

        System.out.println("\nBelow you find your results\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(data.get(i).toString());
        }


    }
}
