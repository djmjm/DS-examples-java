package br.com.ds.list;

import java.util.UUID;

public class Element {

    protected String id;
    protected String name;
    protected Element next;

    public Element(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.next = null;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Element getNext() {
        return next;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public String print(){
        String returnString = "";

        returnString += "_______________" +  "\n";
        returnString += "Name - " + name + "\n";
        returnString += "ID - " + id + "\n";
        returnString += "_______________" + "\n";

        return returnString;
    }
    

}
