package fuction.sum;

public class StaticDemo{
    String name = "Bob";
    static int age = 18;

    public static void test1(){
        System.out.println("test1");
    }
    //在非静态方法中直接调用静态方法
    public void test2(){
        System.out.println("test2");
        test1();
    }
    //在静态方法中间接调用非静态方法
    public static void test3(){
        System.out.println("test3");
        new StaticDemo().test2();				//注意理解❗❗
    }

    public static void main(String[] args){
        StaticDemo sd = new StaticDemo();

        System.out.println(sd.name);
        //静态成员变量可以通过对象名调用，也可以通过类名调用
        System.out.println(sd.age);					//输出：18
        System.out.println(StaticDemo.age);			//输出：18

        //静态方法可以被类名调用
        StaticDemo.test1();
        sd.test2();
        StaticDemo.test3();

        //静态成员变量被所有对象共享，对象和类都可以调用修改其值，建议使用类调用
        sd.age = 20;
        System.out.println(sd.age);					//输出：20
        System.out.println(StaticDemo.age);			//输出：20
        StaticDemo.age = 30;
        System.out.println(sd.age);					//输出：30
        System.out.println(StaticDemo.age);			//输出：30
        StaticDemo sd2 = new StaticDemo();
        System.out.println(sd2.age);					//输出：30
        System.out.println(StaticDemo.age);			//输出：30
    }
}
