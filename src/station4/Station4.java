import java.util.ArrayList;

class Station4 {
    
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.setName("林檎");

        Item item2 = new Item();
        item2.setName("葡萄");

        Item item3 = new Item();
        item3.setName("檸檬");

        SetItem setItem = new SetItem();
        setItem.setName("果実");

        setItem.addItem(item1);
        setItem.addItem(item2);
        setItem.addItem(item3);

        System.out.println(setItem.getName());
    }
}