package edu.wctc.independentcopy.reader;


import java.util.Arrays;
import java.util.List;

/**
 * A simple low-level, derived class that demonstrates the capability to read from a list,
 * Notice this class is derived from the interface <code>Reader</code>, which is an abstraction of these details.
 *
 * See dependentcopy project for a poor design
 *
 * @author Sumin
 * @version 1.02
 * @see edu.wctc.independentcopy.Driver for run instructions and info about design rules
 */
public class ListReader implements Reader {

    /**
     * Reads strings from a pre-defined list.
     *
     * @return a String representing one line of input.
     */
    @Override
    public String readln() {

        List<String> items = Arrays.asList("One", "Two", "Three", "Four");
        return String.join(",", items);
    }
}
