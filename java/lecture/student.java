public class student {
    
    String name;
    private int rollnumber;
    double percent;
    final String schoolname="DAV";
    static int noOfStudent;
    private int age;
    
    public  int get(int x){
        rollnumber =x;
        return rollnumber;

    }
    public student(){
        noOfStudent++;

    }
    public student(String name, int rollnumber, double percent){
        this.name= name;
        this.rollnumber= rollnumber;
        this.percent =percent;
        noOfStudent++;
    }
    public int getage(int y){
        age=y;
        return age;

    }
        
    
    
}
