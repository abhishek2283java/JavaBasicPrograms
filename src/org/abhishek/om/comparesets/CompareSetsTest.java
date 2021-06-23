package org.abhishek.om.comparesets;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompareSetsTest {

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
    public void test1() {

        Set<String> test1 = new HashSet<>();
        test1.add("a");
        test1.add("b");

        Set<String> test2 = new HashSet<>();
        test2.add("b");
        test2.add("c");

        //assertThat(CompareSets.equals(test1, test2), is(false));
        assertFalse(CompareSets.equals(test1, test2));

    }
	
    @Test
    public void test2() {

        Set<String> test1 = new HashSet<>();
        test1.add("a");
        test1.add("b");

        Set<String> test2 = new HashSet<>();
        test2.add("a");
        test2.add("b");
        test2.add("c");

        assertThat(CompareSets.equals(test1, test2), is(false));

    }
    
    @Test
    @DisplayName("Comparing two sets of String")
    public void test3() {

        Set<String> test1 = new HashSet<>();
        test1.add("Mobile");
        test1.add("Car");

        Set<String> test2 = new HashSet<>();
        test2.add("Mobile");
        test2.add("Car");
        test2.add("Car1");
        
        assertThat(CompareSets.equals(test1, test2), is(true));

    }

}
