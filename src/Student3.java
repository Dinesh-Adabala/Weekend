public class Student3 {
    private int a;
    private int b;
    private int c;

    public Student3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private int add(int a,int b,int c){
        if (a>5 && b>5 && c>5){
            int total = a+b+c;
            System.out.println(total);
        }
    }
}