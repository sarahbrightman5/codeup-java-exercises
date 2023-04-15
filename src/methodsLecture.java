public class methodsLecture {
    public static void main(String[] args) {
        System.out.println(sayHello("sarah"));
        System.out.println(sayHello());
        System.out.println(returnThree());
        String myName ="sarah";
        count(5);
    }
    public static String sayHello(){
        return "hello i have no idea who u are";
    }
    public static String sayHello(String name) {
        return "hello, "+name;
    }
    public static int returnThree(){
        return 3;
    }
    public static void count(int n){
        if(n<=0){
            System.out.println("all done");
        }
        System.out.println(n);
        count(n-1);
    }
}
