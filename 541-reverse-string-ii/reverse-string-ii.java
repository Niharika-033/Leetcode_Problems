class Solution {
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       return new String(arr);
    }
    public String reverseStr(String str, int k) {
        String s = "";
    for (int i = 0; i < str.length(); i = i + 2 * k) {
            int end = Math.min(i + k, str.length());
            String a = str.substring(i, end);

            a = reverse(a);
            s = s + a;

            if (i + k < str.length()) {
                int end2 = Math.min(i + 2 * k, str.length());
                s = s + str.substring(i + k, end2);
            }
        }

        return s;
    }
}