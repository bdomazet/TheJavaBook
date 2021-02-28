package Telusko.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Object {

    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    @Override
    public void Subscribe(Subscriber sub){
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub){
        subs.remove(sub);
    }

    @Override
    public void notifySubscribers(){
        for (Subscriber sub: subs){
            sub.update();
        }
    }

    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }

    @Override
    public String getTitle() {
        return title;
    }
}
