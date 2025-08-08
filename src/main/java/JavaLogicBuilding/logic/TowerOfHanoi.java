package JavaLogicBuilding.logic;

public class TowerOfHanoi {

    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: Only 1 disk -> directly move from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromRod + " to " + toRod);
            return;
        }

        // Step 1: Move top n-1 disks from source to auxiliary rod
        solveHanoi(n - 1, fromRod, auxRod, toRod);

        // Step 2: Move the largest disk from source to destination
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);

        // Step 3: Move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks
        solveHanoi(n, 'A', 'C', 'B'); // A=Source, C=Destination, B=Auxiliary
    }
}

