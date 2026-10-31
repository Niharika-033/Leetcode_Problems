class Solution {
    private int[] memo;
    private int robFrom(int[] houses, int i) {
        if (i < 0) {
            return 0;
        }
        if (memo[i] != -1) {
            return memo[i];
        }
        int robCurrent = houses[i] + robFrom(houses, i - 2);
        int skipCurrent = robFrom(houses, i - 1);
        return memo[i] = Math.max(robCurrent, skipCurrent);
    }
     public int rob(int[] houses) {
        memo = new int[houses.length];
        Arrays.fill(memo, -1);
        
        return robFrom(houses, houses.length - 1);
    }
}