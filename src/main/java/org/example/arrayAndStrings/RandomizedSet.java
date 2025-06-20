package org.example.arrayAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet {

    Map<Integer, Integer> map;
    List<Integer> list;

    public static void main(String[] args) {

        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1)); // returns true
        System.out.println(randomizedSet.remove(2)); // returns false, 2 does not exist
        System.out.println(randomizedSet.insert(2)); // returns true
        System.out.println(randomizedSet.getRandom()); // returns either 1 or 2 randomly
        System.out.println(randomizedSet.remove(1)); // returns true
        System.out.println(randomizedSet.insert(2)); // returns false, 2 already exists
        System.out.println(randomizedSet.getRandom()); // returns 2
    }

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            map.put(val,map.size());
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val){
        if (!map.containsKey(val)) {
            return false;
        }

        int indexToRemove = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Move last element to the index of the element to remove
        list.set(indexToRemove, lastElement);
        map.put(lastElement, indexToRemove);

        // Remove last element from list
        list.remove(list.size() - 1);

        // Remove val from map
        map.remove(val);

        return true;
    }

    public int getRandom(){
        int randomIndex = (int) (Math.random() * list.size());
        return list.get(randomIndex);
    }

}
