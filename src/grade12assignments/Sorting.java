/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade12assignments;

import java.util.Arrays;

/**
 *
 * @author lamon
 */
public class Sorting {

    public void swap(int[] n, int pos1, int pos2){
        int temp = n[pos1];
        n[pos1] = n[pos2];
        n[pos2] = temp;
    }
    
    public void bubbleSort(int[] n){
        // have we swapped anything
        boolean swap = true;
        // keep going if we have swapped
        while(swap){
            // assume we will make NO swaps!
            swap = false;
            // go down the list looking for swaps
            for(int i = 0; i < n.length - 1; i++){
                // do we swap the pairs?
                if(n[i] > n[i+1]){
                    // swap the positions
                    swap(n, i, i+1);
                    // let the alg know we swapped
                    swap = true;
                }
            }
        }
    }
    
    public void selectionSort(int[] n){
        // go through the list
        for(int i = 0; i < n.length - 1; i++){
            // start tracking the minimum spot
            int min = i;
            // go through looking for smaller
            for(int j = i + 1; j < n.length; j++){
                // did you find smaller?
                if(n[min] > n[j]){
                    // track that position instead
                    min = j;
                }
            }
            // put the minimum in position
            swap(n,i,min);
        }
    }
    
    public void insertionSort(int[] n){
        // start going down the list
        for(int i = 0; i < n.length - 1; i++){
            int j = i + 1;
            // while it is out of position
            while(j > 0 && n[j] < n[j-1]){
                swap(n, j, j-1);
                // move j down
                j--;
            }
        }
    }
    
    public int linearSearch(int num, int[] n){
        // go through each element
        for(int i = 0; i < n.length; i++){
            // is this the one?
            if(n[i] == num){
                return i;
            }
        }
        // did not find it
        return -1;
    }
    
    int binarySearch(int num, int[] n){
        // which section are we looking
        int start = 0;
        int end = n.length;
        while(start <= end){
            // where to look
            int mid = (start + end)/2;
            // is the number here?
            if(n[mid] == num){
                return mid;
            }else if(n[mid] < num){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        // haven't found
        return -1;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array of numbers to sort
        int[] nums = new int[10];
        
        // randomly assign values
        for (int i = 0; i < nums.length; i++) {
            // assign a random number between 0 and 100
            nums[i] = (int)(Math.random()*101);
        }
        
        Sorting test = new Sorting();
        
        System.out.println("BEFORE:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        
        //Arrays.sort(nums);
        //test.bubbleSort(nums);
        //test.selectionSort(nums);
        test.insertionSort(nums);
        
        System.out.println("AFTER:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        
        int location = test.binarySearch(35, nums);
        if(location != -1){
            System.out.println("found at " + location);
        }else{
            System.out.println("Not found");
        }
    }
    
}
