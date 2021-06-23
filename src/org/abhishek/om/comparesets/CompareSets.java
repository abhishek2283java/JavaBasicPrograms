package org.abhishek.om.comparesets;

import java.util.Set;

public class CompareSets {
	
    public static boolean equals(Set<?> set1, Set<?> set2){

        if(set1 == null || set2 ==null){
            return false;
        }

        if(set1.size()!=set2.size()){
            return false;
        }

        return set1.containsAll(set2);

    }

}
