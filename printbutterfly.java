public class printbutterfly {
    public static void main(String[] args) {
        int n= 5;
        for(int i= 1; i<=n; i++){
            for(int j= 1;j<=2*n;j++){
                if(j==i|| j==2*n+1-i||j==1||j== 2*n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             System.out.println();
        }
             for(int x =n ; x>=1;x--){
                for(int y = 1; y<=2*n;y++){
                    if(x==y||y==2*n+1-x||y==1||y==2*n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
             }   
    }
}
