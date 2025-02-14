package org.curso.array;

import java.util.Arrays;

public class SortingSearchingComparingMain {

    public static void main(String... args) {
        var numbers = new int[] {2,16,5,100,99,1};
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 99)); //This method returns unpredictable outcomes if the array is not sorted


        var numbers2 = new int[] {3,16,5,100,99,1};
        System.out.println(Arrays.compare(numbers, numbers2)); // negative number

        var string = new String[] {"c", "Rivera"};
        var string2 = new String[] {"C", "Rivera"};
        System.out.println(Arrays.compare(string, string2)); // positive number

        var string3 = new String[] {"ab", "Rivera"};
        var string4 = new String[] {"abc", "Rivera"};
        System.out.println(Arrays.compare(string3, string4)); // negative number

        var string5 = new String[] {"xy", "Rivera"};
        var string6 = new String[] {"abc", "Rivera"};
        System.out.println(Arrays.compare(string5, string6)); // positive number

    }
}
