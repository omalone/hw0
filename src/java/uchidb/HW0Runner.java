package java.uchidb;

import java.util.*;


/**
 * @author aelmore
 */


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
