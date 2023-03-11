package day15_string;

public class SmaPart {
    public static void main(String[] args) {


        String msg= "Sender: <James Bond>. From Number: ";
        int sendPart = msg.indexOf("J");
        int sendEnd = msg.lastIndexOf(">");

        String name = msg.substring(sendPart,sendEnd);

        System.out.println(name);

        int numStart=msg.indexOf("[")+1;
        int numend = msg.indexOf("]");

    }
}
