public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) return 0;
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int add = add(7, 6); // = 13
        int dif = dif(15, 4); // = 11
        int times = times(add, dif); // = 143
        int div = div(times, 11); // = 13

        return div;
    }
}
