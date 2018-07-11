/**
 * Contains methods for exercises that use more than 2 numbers as input
 *
 * The numbers are passed in through methods which represent an exercise each. Then the methods to apply algorithms on that collection of numbers
 *
 * @field collection is the collection passed in as parameter through methods
 */
package main.java.ro.sci.tema1;

import java.util.Arrays;

public class ExercisesWithACollection {
    private int[] collection;

    /**
     *
      * @return a string containing the elements of the collection
     */
    @Override
    public String toString() {
        return "{Collection = " + Arrays.toString(collection) +
                '}';
    }

    /**
     * Constructors
     */
    public ExercisesWithACollection() {}

    /**
     * Getters & Setters
     */
    public int[] getCollection() {
        return collection;
    }

    public void setCollection(int[] collection) {
        this.collection = collection;
    }

    /**
     * Exercises start here:
     */

    /**
     * @param collection of numbers to get the minimum from
     * @return minimum value within the collection passed in as param
     */
    public int getSmallestOf(int[] collection){
        this.setCollection(collection);
        int min = Integer.MAX_VALUE;
        for(int i:this.collection){
            if(i < min)
                min = i;
        }
        return min;
    }

    /**
     * @param collection of numbers to get the maximum from
     * @return maximum value within the collection passed in as param
     */
    public int getBigestOf(int[] collection){
        this.setCollection(collection);
        int max = Integer.MIN_VALUE;
        for(int i:this.collection){
            if(i > max)
                max = i;
        }
        return max;
    }
}
