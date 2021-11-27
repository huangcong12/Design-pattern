import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        } else {
            if (items.length - 1 - (position - 1) >= 0)
                System.arraycopy(items, position - 1 + 1, items, position - 1, items.length - 1 - (position - 1));
            items[items.length - 1] = null;
        }
    }
}
