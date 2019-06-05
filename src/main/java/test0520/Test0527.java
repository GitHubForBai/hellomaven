package test0520;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Stack;

public class Test0527 {

    public static void main(String[] args) {
//        String res = longestCommonPrefix(new String[]{" a", " aracecar", " acar"});
//        System.out.println(res);

//        System.out.println(isValid("()()()()"));

//        ListNode listNode1 = new ListNode(4);
//        listNode1.next = null;
//
//
//        ListNode listNode2 = new ListNode(2);
//        listNode2.next = listNode1;

//        System.out.println( removeElement(new int[]{1, 2, 2, 3, 5}, 5) );

//        System.out.println( test2("", "") );

//        System.out.println(Arrays.toString(plusOne(new int[] {9, 9, 9, 9, 9})));

//        System.out.println(addBinary("1010", "1011"));

        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {

        double dd = Math.sqrt(x);
        String ss = String.valueOf(dd);
        String[] sp = ss.split("\\.");
        String oo = sp[0];
        int ii = Integer.valueOf(oo);
        return ii;
//        return Integer.valueOf(String.valueOf(dd).split("//.")[0]);
    }


    public static String addBinary(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(intA + intB);
    }


    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        // 最后一位不等于9,直接加1返回
        if (digits[length - 1] != 9) {
            digits[length - 1] = digits[length - 1] + 1;
            return digits;
        }

        // 最后一位等于9,特殊处理
        // 1.最后一位赋值0
        digits[length - 1] = 0;
        for (int i = length - 2; i >= 0; i --) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                break;
            }
        }

        if (digits[0] == 0) {
            digits = Arrays.copyOf(digits, length + 1);
            digits[0] = 1;
        }

        return digits;

    }

    public static int[] plusOne11111111(int[] digits) {
        int length = digits.length;
        boolean addFlag = false;

        for (int i = length - 1 ; i >= 0; i --) {
            if (addFlag) {
                if (digits[i] + 1 > 9) {
                    digits[i] = 0;
                    addFlag = true;
                } else {
                    digits[i] = digits[i] + 1;
                    addFlag = false;
                }
            } else {
                if (digits[i] + 1 > 9) {
                    digits[i] = 0;
                    addFlag = true;
                } else {
                    digits[i] = digits[i] + 1;
                    addFlag = false;
                }
            }

            if (!addFlag) {
                break;
            }
        }

        return null;

    }



    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String[] strArray = s.split(" ");
        if (strArray.length == 0) {
            return 0;
        }

        return strArray[strArray.length - 1].length();
    }




    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s1 = getNext("1");

        for (int i = 2; i < n; i ++) {
            if (n == 2) {
                return s1;
            }
            s1 = getNext(s1);
        }

        return s1;
    }

    public static String getNext(String numSeq) {
        if (numSeq == null || numSeq.length() == 0) {
            return "zzzzzzzzzzzzz";
        }
        int len = numSeq.length();
        StringBuilder stringBuilder = new StringBuilder();
        int breakIndex;
        for (int i = 0; i < len; i = breakIndex + 1) {

            char a0 = numSeq.charAt(i);
            int count = 1;
            breakIndex = i;
            for (int j = i + 1; j < len; ++ j) {
                if (a0 == numSeq.charAt(j)) {
                    count ++;
                    breakIndex = j;
                    continue;
                }
                break;
            }
            if (count != 0) {
                stringBuilder.append(count).append(a0);
            }
        }
        return stringBuilder.toString();
    }




    public static int test2(String haystack, String needle) {
        String a1 = "aaaaa";
        String a2 = "bba";

        int i = a1.indexOf(a2);
        System.out.println(i);

        return i;
    }


    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int pos = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] != val) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }



    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return set.size();
    }


//    static class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int x) { val = x; }
//    }
//
//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//    }


    public static boolean isValid(String s) {
        // (((((((()
        HashMap<Character, Character> mappings = new HashMap<>(16);
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');


        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }


    /**
     * 最长公共前缀
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length <= 0) {
            return "";
        }

        String strOne = strs[0];
        int i = 0;
        String obj = "";

        while (i < strOne.length()) {
            String temp = strOne.substring(0, i + 1);

            for (String s : strs) {
                if (!s.startsWith(temp)) {
                    return obj;
                }
            }

            obj = temp;
            i ++;
        }

        return obj;
    }
}
