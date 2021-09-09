package Realese2;

import java.util.*;

public class TestKeep {
    public static void main(String[] args) {

        Lion lion = new Lion();

        Rabbit rabbit = new Rabbit();

        Zebra zebra = new Zebra();

        ZooKeeper zk = new ZooKeeper();

        ArrayList<IEat> animals = new ArrayList<>();

        animals.add(lion);
        animals.add(rabbit);
        animals.add(zebra);

        for (var animal: animals) {
            zk.ToFeed(animal);
        }

    }
}
