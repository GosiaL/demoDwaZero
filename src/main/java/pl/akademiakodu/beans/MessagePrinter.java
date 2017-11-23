package pl.akademiakodu.beans;

public class MessagePrinter {
    private MessageProducer producer;

    public MessagePrinter() {};

    private String name;

    public MessagePrinter(MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

     public void print(){
        System.out.println(producer.getMessage());
    }
}
