class Solution {
    public int fib(int n) {
        if(n == 0) {return 0;}
        if(n == 1) {return 1;}
        int[] sol = new int[n+1];
        sol[0] = 0;
        sol[1] = 1;
        for(int i = 2; i < sol.length; i++) {
            sol[i] = sol[i-2] + sol[i-1];
        }
        return sol[n];
    }
}