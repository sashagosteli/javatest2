package classes;

import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ToyQueue {
    private PriorityQueue<Toy> queue;

    public ToyQueue(String toy1, String toy2, String toy3) {
        queue = new PriorityQueue<Toy>((t1, t2) -> Double.compare(t2.getWeight(), t1.getWeight()));

        String[] toys = toy1.split(" ");
        queue.add(new Toy(Integer.parseInt(toys[0]), toys[1], Double.parseDouble(toys[2]), Integer.parseInt(toys[3])));

        toys = toy2.split(" ");
        queue.add(new Toy(Integer.parseInt(toys[0]), toys[1], Double.parseDouble(toys[2]), Integer.parseInt(toys[3])));

        toys = toy3.split(" ");
        queue.add(new Toy(Integer.parseInt(toys[0]), toys[1], Double.parseDouble(toys[2]), Integer.parseInt(toys[3])));

    }

    public void addToQueue(Toy toy) {
        queue.add(toy);
    }

    public ArrayList<String> getListWithAvailibleToys() {

        ArrayList<String> availToys = new ArrayList<>();
        for (Toy toy : queue) {
            Double.compare(toy.getWeight(), toy.getWeight());
            int count = toy.getCount();
            for (int i = 0; i < count; i++) {
                availToys.add(toy.getName());
                Collections.shuffle(availToys);
            }

        }
        return availToys;
        // System.out.println(availToys);

    }

    public void getAndWriteToFile(String path, ArrayList<String> availToys) {
        try (FileWriter writer = new FileWriter(path)) {

            List<String> tempList = new ArrayList<String>((availToys));
            for (int i = 0; i < availToys.size(); i++) {
                writer.write("  Вы выиграли игрушку: " + availToys.get(0));

                tempList.remove(0);
                tempList.toArray(new String[0]);
                break;
            }

            writer.write(" Оставшиеся игрушки : " + tempList.toString());

        } catch (IOException ex) {
            System.out.println("ERROR!!!!");
        }
    }
}
