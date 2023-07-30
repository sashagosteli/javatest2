import java.util.ArrayList;

import classes.Toy;
import classes.ToyQueue;

public class Main {
    public static void main(String[] args) {

        ToyQueue toyQueue = new ToyQueue("1 конструктор 2 5", "2 робот 2 5", "3 кукла 6 5");

        toyQueue.addToQueue(new Toy(4, "машинка", 0.3, 7));
        toyQueue.addToQueue(new Toy(5, "мячик", 0.6, 2));

        ArrayList<String> availToys = new ArrayList<>(toyQueue.getListWithAvailibleToys());
        System.out.println(availToys);
        toyQueue.getAndWriteToFile("output.txt", availToys);
    }
}
