public class Student3 {
    private int a;
    private int b;

    public Student3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int add(int a , int b){
        if (a>5 && b>5){
            int total = a + b;
            System.out.println(total);
        }
    }
}