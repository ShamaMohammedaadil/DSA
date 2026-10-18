class TowerOfHanoi2{
    //steps to move n disks from source to destination using auxiliary
    // 2n - 1 moves are required to move n disks from source to destination using auxiliary
    // Time complexity is O(2^n)
    //space complexity is O(n) due to recursion stack
    
    public static int towerOfHanai(int x, char from, char to, char aux){
        if(x==0){
            return 0;
        }
        int moves = 0;
        moves += towerOfHanai(x-1, from, aux, to);
        moves++;
        moves += towerOfHanai(x-1, aux, to, from);

        return moves;
    }
    public static void main(String []args){
        System.out.println(towerOfHanai(3, 'A', 'B', 'C'));
    }
}
