package com.kai.designPattern.Iterator.demo2;
import java.util.List;


/**
 * @Auther: Kai Wang
 * @Date: 2020/11/26
 * @Description:
 */
public class PancakeHouseIterator implements Iterator {
    List<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }


    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

}
