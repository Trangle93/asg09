
public class NumeralItem implements Item{
    int value;
    public NumeralItem(){};
    public NumeralItem(int value){
        this.value = value;
    }
  
    public Item clone() {
        return  new  NumeralItem(value);
    }

   
    public boolean equals(Item item) {
       return this.toString().equals(item.toString());

    }
   
    public String toString(){
        return Integer.toString(value);
    }
    
}
