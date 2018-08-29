package Newpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.HashBag;

//import com.graphbuilder.struc.LinkedList;

public class FilpKart {

	public static void main(String[] args) {
		List<Integer> bagPrice = new ArrayList<Integer>();
		Set<Integer> bagValue = new HashSet<Integer>();
		bagPrice.add(999);
		bagPrice.add(666);
		bagPrice.add(545);
		bagPrice.add(545);
		bagPrice.add(545);
		bagPrice.add(654);
		bagPrice.add(666);
		bagPrice.add(999);
		bagPrice.add(666);
		System.out.println(bagPrice);
		bagPrice.addAll(bagValue);
        Integer max = Collections.max(bagPrice);
        System.out.println(max);
        Integer min = Collections.min(bagPrice);
        System.out.println(min);
        int max1=0;
        int count=0;
        for (Integer eachset : bagValue) {
			count=0;	
		}
        for (Integer eachlist : bagValue) {
			
		}
	}

}
