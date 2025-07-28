package DS.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
return the majority elements, The majority element is the element that appears more than  n /3 times.*/

public class MajorityElementInArray {


    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        MajorityElementInArray majorityElementInArray = new MajorityElementInArray();
        int majorityElement = majorityElementInArray.findMajorityElement(arr);
        System.out.println("The Majority Element is :" + majorityElement);
    }

    public int findMajorityElement(int arr[]) {
        int frequency, element = 0;
        element = arr[0];
        frequency = 1;
        for (int i = 1; i < arr.length; i++) {
            if (frequency == 0) {
                element = arr[i];
                frequency = 1;
            }
            if (arr[i] != element) {
                frequency--;
            } else {
                frequency++;
            }

        }
        return element;
    }

    public ArrayList<Integer> findTheMajorityElements(int arr[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int val1 = arr[0];
        int count1 = 1;
        int val2 = -7;
        int count2 = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == val1) {
                count1++;
            } else if (arr[i] == val2) {
                count2++;
            } else if (count1 == 0) {
                count1++;
                val1 = arr[i];
            } else if (count2 == 0) {
                count2++;
                val2 = arr[i];
            } else {
                count1--;
                count2--;
            }

        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == val1) {
                count++;
            }


            if (count > arr.length / 3) {
                arrayList.add(arr[i]);
            }

        }
        return arrayList;
    }

    }

