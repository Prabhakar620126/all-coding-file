public class test {
    public static int[] test1 (int b[]){
        int c[]= b;
        for (int i = 0;i<b.length;i++){
            c[i] += 5;
        }
        return c;
    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6};
        int d[] = test1(a);
        for (int i = 0;i<d.length;i++){
           System.out.println(d[i]);
        }

    }
}
