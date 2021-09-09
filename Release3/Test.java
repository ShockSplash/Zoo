package Release3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper();

        Lion lion = new Lion();

        Rabbit rabbit = new Rabbit();

        Zebra zebra = new Zebra();

        ArrayList<IEat> animals = new ArrayList<>();

        animals.add(lion);
        animals.add(rabbit);
        animals.add(zebra);

        for (var animal :
                animals) {
            zk.FeedAnimal(animal);
        }
    }
}
