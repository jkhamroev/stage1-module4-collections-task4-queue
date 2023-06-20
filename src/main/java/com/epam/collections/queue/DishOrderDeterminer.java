package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }
        int i = 0;
        List<Integer> result = new ArrayList<>();
        while (!list.isEmpty()) {
            i += everyDishNumberToEat - 1;
            i %= list.size();
            result.add(list.get(i));
            list.remove(i);
        }
        return result;
    }
}
