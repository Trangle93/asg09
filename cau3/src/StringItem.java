
public class StringItem implements Item {
    String value;
    public StringItem(){};
    public StringItem(String value){
        this.value = value;
    }
    
    public Item clone() {
        return new StringItem(value);
    }

    public boolean equals(Item item) {
        return this.toString().equals(item.toString());
    }
   
    public String toString(){
        return this.value;
    }
    
}
