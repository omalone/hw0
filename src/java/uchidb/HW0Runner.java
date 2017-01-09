package uchidb;

import java.util.*;


/**
 * @author aelmore
 */


public class HW0Runner<T,S> extends Imp<T,S>{
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm

	//TODO you likely will need to add member variable
		//Added member variable containers
	private static Containers<Integer,String> cont = new HW0Runner<Integer,String>();

	private HW0Runner() {
	}

	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
        return cont;
	}

	public static void main(String[] args){
		Containers<Integer,String> cont = getContainers();
	}
}
