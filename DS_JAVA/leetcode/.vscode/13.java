class Solution {
    public int romanToInt(String s) {

        int[] nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
            // switch(s.charAt(i)){

            // case "I":
            // a[i] = 1;
            // break;

            // case "V":
            // a[i] = 5;
            // break;

            // case "X":
            // a[i] = 10;
            // break;

            // case "L":
            // a[i] = 50;
            // break;

            // case "C":
            // a[i] = 100;
            // break;

            // case "D":
            // a[i] = 500;
            // break;

            // case "M":
            // a[i] = 1000;
            // break;
            // }
        }

        int sum = 0;
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum = sum + nums[i + 1] - nums[i];
                i++;
            } else {
                sum = sum + nums[i];
            }
        }
        if (i == nums.length - 1)
            return sum + nums[i];
        else
            return sum;

    }
}