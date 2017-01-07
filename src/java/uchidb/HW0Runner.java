package java.uchidb;

import java.util.*;


/**
 * @author aelmore
 */

class Imp<T,S> implements Containers<T,S> {
	Map<S,T> localMap = new HashMap<S,T>();


	//Create a set that stores the array of T objects
	public Set<T> initSet(T[] tArray) {
		Set<T> set = new HashSet<T>();
		for (T aTArray : tArray) {
			set.add(aTArray);
		}
		return set;
	}

	//Create a list that stores the array of T objects
	public List<T> initList(T[] tArray) {
		List<T> list = new ArrayList<T>();
		for (int i = 0; i<tArray.length; ) {
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
		this.localMap = mapToStoreInClass;
	}

	//add a key value to store map with a boolean indicating whether to overwrite existing value
	//returns, was the key value added to the map?
	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
		//add the key, value if overwrite is true, or if the key doesn't exist yet.
		boolean added;
		if (overwriteExistingKey || !this.localMap.containsKey(key)) {
			this.localMap.put(key, value);
			added = true;
		} else {
			added=false;
		}
		return added;
	}

	//get a value based on a key
	public T getValueFromMap(S key) {
		return this.localMap.get(key);
	}

	//an overloaded function to get value from map but with a default value
	//if the key is not present
	public T getValueFromMap(S key, T defaultValue) {
		return this.localMap.getOrDefault(key,defaultValue);
	}

}

public class HW0Runner extends Imp{
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm

	//TODO you likely will need to add member variable
		//Added member variable containers
	private static HW0Runner containers = null;

	private HW0Runner() {}

	public static Containers<Integer, String> getContainers() {
		// TODO fix this function

		return containers;
	}

	public static void main(String[] args){
		Containers<Integer,String> cont = getContainers();
	}
}
