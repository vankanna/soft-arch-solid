package edu.wctc.independentcopy.writer;

import java.util.Arrays;
import java.util.List;

/**
 * A simple class that demonstrates a capability to write a line of text to the
 * console. Notice this class is derived from the interface <code>Writer</code>,
 * which is an abstraction of these details.
 *
 * See dependentcopy project for a poor design
 *
 * @author Jim Lombardo
 * @version 1.02
 * @see edu.wctc.independentcopy.Driver for run instructions and info about design rules
 */
public class ListWriter implements Writer {

    /**
     * Write a line of text to the console.
     *
     * @param line - a String representing one line of text.
     */
    @Override
    public void writeln(String line) {
        List<String> itemsList = Arrays.asList(line.split(","));
    }
}
