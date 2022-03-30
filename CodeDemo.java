package fuction.sum;

public class CodeDemo{
    int a;
    int b;
    static{
        System.out.println("静态代码块！");
    }
    {
        System.out.println("构造代码块！");
    }
    public CodeDemo(){
        System.out.println("构造方法(1)");
    }
    public CodeDemo(int a){
        this.a = a;
        System.out.println("构造方法(2)");
    }
    public CodeDemo(int a, int b){
        this(a);
        this.b = b;
        System.out.println("构造方法(3)");
    }
    public void common(){
        System.out.println("普通代码块！");
    }

    public static void main(String[] args){
        //无参构造方法
        CodeDemo cd1 = new CodeDemo();
        cd1.common();                               //用于测试普通代码块

        CodeDemo cd2 = new CodeDemo(2);          //用于测试构造代码块

        CodeDemo cd3 = new CodeDemo(7,7);     //用于测试构造代码块与this()调用

    }
}
