import java.util.*;

public class L_55_stack_problem {
    public static void display(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
    }

    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                }
                if (st.peek() == '(') {
                    st.pop();
                }
            }
        }
        if (st.size() > 0)
            return false;
        else
            return true;
    }

    public static int bracketRemove(String s) {
        int ans = 0;
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    ans++;
                } else {
                    st.pop();
                }

            }

        }
        return ans;

    }

    public static int[] removeconsecutiveSubsequ(int[] arr) {// without using stack
        int n = arr.length;
        int index = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {

                    a[index] = arr[i];
                    index++;
                }
            } else if (i == n - 1) {
                if (arr[i] != arr[i - 1]) {
                    a[index] = arr[i];
                }

            } else {
                if (arr[i] != arr[i + 1]) {
                    if (arr[i - 1] != arr[i]) {
                        a[index] = arr[i];
                        index++;

                    }
                }

            }

        }
        return a;

    }

    public static int[] removeConsecutiveDuplicates(int[] arr) {
        int n = arr.length;
        int index = 0;

        // Count the number of non-consecutive elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                index++;
            }
        }

        // Create a new array with the correct size
        int[] result = new int[index + 1];
        index = 0;

        // Populate the new array with non-consecutive elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result[index] = arr[i];
                index++;
            }
        }

        // Add the last element of the input array
        result[index] = arr[n - 1];

        return result;
    }

    public static int[] removeConSeq_stack1(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            } else {
                st.push(arr[i]);
            }
        }

        int p = st.size();
        int[] res = new int[p];

        for (int j = p - 1; j >= 0; j--) {
            res[j] = st.peek();
            st.pop();
        }

        return res;
    }

    public static int[] removeConSeq_stack(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (st.size() == 0) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (i == n - 1) {
                    st.pop();
                }
                if (arr[i] != arr[i + 1]) {
                    st.pop();

                }

            } else {
                st.push(arr[i]);
            }
        }
        int p = st.size();
        int[] res = new int[p];
        for (int j = p; j > 0; j--) {
            res[j] = st.peek();
            st.pop();
        }
        return res;

    }

    public static int[] nextgreater(int[] arr) {
        int n = arr.length;
        
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        res[n-1]=-1;

        for (int i = n - 2; i >= 0; i--) {

            while (st.peek() < arr[i] && st.size() < 0) {
                st.pop();

            }
            if (st.size() == 0)
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(arr[i]);

        }
        return res;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(isBalanced(str));
        // System.out.println(bracketRemove(str));
        int[] arr = { 1, 2, 2, 3, 10, 10, 4, 4, 4, 5, 7, 7, 1, 2 };
        // int[] res = removeconsecutiveSubsequ(arr);
        // display(res);
        // int[] re = removeConsecutiveDuplicates(arr);
        // display(re);
        // int[] ans = removeConSeq_stack1(arr);
        // display(ans);
        // int[] an = removeConSeq_stack1(arr);
        // display(an);
        display(arr);
        int[] a = nextgreater(arr);
        display(a);

    }

}
