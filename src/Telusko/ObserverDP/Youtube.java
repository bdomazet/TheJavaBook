package Telusko.ObserverDP;

public class Youtube {
    public static void main(String[] args) {

        Channel telusko = new Channel();
        Subscriber s1 = new Subscriber("Name1");
        Subscriber s2 = new Subscriber("Name2");
        Subscriber s3 = new Subscriber("Name3");
        Subscriber s4 = new Subscriber("Name4");
        Subscriber s5 = new Subscriber("Name5");

        telusko.Subscribe(s1);
        telusko.Subscribe(s2);
        telusko.Subscribe(s3);
        telusko.Subscribe(s4);
        telusko.Subscribe(s5);

        s1.subscribeChanel(telusko);
        s2.subscribeChanel(telusko);
        s3.subscribeChanel(telusko);
        s4.subscribeChanel(telusko);
        s5.subscribeChanel(telusko);

        telusko.upload("New video");

        telusko.unSubscribe(s3);
    }
}
