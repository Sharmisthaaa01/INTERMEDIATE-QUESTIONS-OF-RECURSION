
// Q1. Tower of Hanoi -
// Transfer n disks from source to destination over 3 towers.


public class TowerOfHanoi {

//    calling the fn
    public static void towerOfHanoi(int n, String src, String help, String dest) {

        if(n == 1){
            System.out.println(src + " -> " + dest);
            return;
        }



        //calling the first disk to transfer from src to help as n-1 disk
        towerOfHanoi(n-1, src, dest, help);

        //transfer nth from src to dest
        System.out.println("Transfer disk "+ n + "from " + src + " to " + dest);

        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, help, dest, src);

    }

    public static void main(String[] args) {

        int n = 3; // n = no. of disks
        towerOfHanoi(n, "S", "H", "D");

    }
}
