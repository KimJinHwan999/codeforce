public class test {
    public static void main(String[] args) {
        String hi = sayHi();
        System.out.println(hi);
    }

    public static String sayHi(){
        String name = "KIM";
        int age = 30;

        String sayHi = "hello my name is " + name + " and my age is " + age;
        return sayHi;
    }
}
