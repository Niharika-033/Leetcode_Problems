
class Solution {
    public int countCollisions(String d) {
        int i = 0;
        int j = d.length() - 1;

        while (i < d.length() && d.charAt(i) == 'L') {
            i++;
        }

        while (j >= i && d.charAt(j) == 'R') {
            j--;
        }

        int count = 0;

        for (int k = i; k <= j; k++) {
            if (d.charAt(k) != 'S') {
                count++;
            }
        }

        return count;
    }
}