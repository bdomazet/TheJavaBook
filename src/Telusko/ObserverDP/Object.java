package Telusko.ObserverDP;

public interface Object {

    void Subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void notifySubscribers();

    void upload(String title);


}
