package java.uchidb;

import java.util.*;


/**
 * @author aelmore
 */


public class HW0Runner {
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm

	//TODO you likely will need to add member variable
		//Added member variable containers
	private static Imp containers= null;

	private HW0Runner() {
	}

	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
        if (containers == null)
			containers = new Imp<Integer,String>();
        return containers;
	}

	public static void main(String[] args){
		Containers<Integer,String> cont = getContainers();
	}
}
