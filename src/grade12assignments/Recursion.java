/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade12assignments;

/**
 *
 * @author lamon
 */
public class Recursion {

    // calculate fib sequence with recursion
    public int fib(int n){
        // base case
        if(n == 1 || n== 0){
            return 1;
        }
        // recursive call
        return fib(n-1) + fib(n-2);
    }
    
    public void solveMaze(int[][] maze, int startX, int startY, int finX, int finY){
        // mark our spot
        maze[startX][startY]=2;
        // base case
        if(startX == finX && startY == finY){
            // print solution
        }
        // recursive call section
        int up = startY - 1;
        int down = startY + 1;
        int right = startX + 1;
        int left = startX - 1;
        
        // make sure they are valid before calling
        if(up >= 0 && up < maze[startX].length){
            solveMaze(maze, startX, up, finX, finY);
        }
        // make sure they are valid before calling
        if(right >= 0 && right < maze.length){
            solveMaze(maze, right, startY, finX, finY);
        }
        // make sure they are valid before calling
        if(down >= 0 && down < maze[startX].length){
            solveMaze(maze, startX, down, finX, finY);
        }
        // make sure they are valid before calling
        if(left >= 0 && left < maze.length){
            solveMaze(maze, left, startY, finX, finY);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a variable to test the methods
        Recursion test = new Recursion();
        
        int n = test.fib(100);
        System.out.println("Fib 4 = " + n);
    }
    
}
