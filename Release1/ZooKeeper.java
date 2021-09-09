import Release1.Lion;
import Release1.Rabbit;
import Release1.Zebra;

public class ZooKeeper {
    public void FeedZebra(Zebra zebra){
        zebra.Eat();
    }

    public void FeedLion(Lion lion){
        lion.Eat();
    }

    public void FeedRabbit(Rabbit rabbit){
        rabbit.Eat();
    }
}
