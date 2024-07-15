package practice;
class MultiTimePrint {
    
    void sayHelloWorld(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World " + i + "th time");
        }
    }
    
    public static void main(String[] args) {
        MultiTimePrint printer = new MultiTimePrint();
        printer.sayHelloWorld(5);
    }
}

