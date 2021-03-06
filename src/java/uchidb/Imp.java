package uchidb;

import java.util.*;

/**
 * Created by Olivia on 1/6/2017.
 */


public class Imp<T,S> implements Containers<T,S> {
    Map<S,T> localMap = new HashMap<S,T>();



    //Create a set that stores the array of T objects
    public Set<T> initSet(T[] tArray) {
        Set<T> set = new HashSet<T>();
        for (T atArray : tArray) {
            set.add(atArray);
        }
        return set;
    }

    //Create a list that stores the array of T objects
    public List<T> initList(T[] tArray) {
        List<T> list = new ArrayList<T>();
        for (int i = 0; i<tArray.length; i++) {
            list.add(tArray[i]);
        }

        return list;
    }

    //Create an empty map that will use type S as keys, and T as values
    public Map<S,T> initEmptyMap() {
        return new HashMap<S,T>();
    }

    //Store the map in a local field variable -- often called a setter
    public void storeMap(Map<S,T> mapToStoreInClass) {
        localMap = mapToStoreInClass;
    }

    //add a key value to store map with a boolean indicating whether to overwrite existing value
    //returns, was the key value added to the map?
    public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
        //add the key, value if overwrite is true, or if the key doesn't exist yet.
        boolean added;
        if (overwriteExistingKey || !localMap.containsKey(key)) {
            localMap.put(key, value);
            added = true;
        } else {
            added=false;
        }
        return added;
    }

    //get a value based on a key
    public T getValueFromMap(S key) {
        return localMap.get(key);
    }

    //an overloaded function to get value from map but with a default value
    //if the key is not present
    public T getValueFromMap(S key, T defaultValue) {
        return localMap.getOrDefault(key,defaultValue);
    }

}
