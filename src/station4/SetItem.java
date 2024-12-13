import java.util.ArrayList;

class SetItem extends Item {

    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public String getName() {

        String ret1 = super.getName();

        String ret2 = "(";

        for (int i = 0; i < items.size(); i++) {
            ret2 += items.get(i).getName();
            if (i < items.size() - 1) {
                ret2 += ",";
            }
        }

        String ret3 = ")";

        return ret1 + ret2 + ret3;
    }

    public void addItem(Item item) {
        items.add(item);
    }

}