package Telusko.ObserverDP;

public class Subscriber implements Observer {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hej " + name + ", video uploaded: " + channel.getTitle());
    }

    @Override
    public void subscribeChanel(Channel ch){
        channel = ch;
    }





}
