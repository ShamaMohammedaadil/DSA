class TowerOfHanoi1{
    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if(n == 0) {
            return;
        }
        towerOfHanoi(n-1, fromRod, auxRod, toRod);
        System.out.println("Moved Disk " + n + " from " + fromRod + " to " + toRod);
        towerOfHanoi(n-1, auxRod, toRod, fromRod);
    }
    public static void main(String []args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods

    }
}
