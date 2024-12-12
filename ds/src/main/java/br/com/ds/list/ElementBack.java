package br.com.ds.list;

public class ElementBack extends Element {

    private Element back;

    public ElementBack(String name){
        super(name);
        this.back = null;
    }

    public Element getBack() {
        return back;
    }

    public void setBack(Element back) {
        this.back = back;
    }

    

}
