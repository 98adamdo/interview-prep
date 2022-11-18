class Solution {
    public int tribonacci(int n) {
        if(n == 0){return 0;}
        if(n == 1 || n == 2){return 1;}
        int[] sol = new int[n+1];
        sol[0] = 0;
        sol[1] = 1;
        sol[2] = 1;
        for(int i = 3; i < sol.length; i++) {
            sol[i] = sol[i-3] + sol[i-2] + sol[i-1];
        }
        return sol[n];
    }
}