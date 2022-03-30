package fuction.sum;

public class ThisDemo{
    int x;
    int y;

    //1.构造方法中
    public ThisDemo(int x,int y){
        this.x = x;		//x表示为形参中的x，而this.x表示在创建对象后，该对象的变量x，即此时的t1.x
        this.y = y;
    }
    //2.普通方法中
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.print("test2\t");
        this.test1();	//此时this.test1()表示t1.test1()
    }
    //3.成员变量中
    public void test3(int x,int y){
        System.out.print(x+","+y);				//此时的x表示形参当中的x
        this.x = x + y;
        this.y = x - y;
        System.out.print(" 改变后：");
        System.out.println(this.x+","+this.y);	//此时this.x表示t1.x
    }


    public static void main(String[] args){
        ThisDemo t1 = new ThisDemo(2,4);
        //1
        System.out.println(t1.x);	//输出：2
        System.out.println(t1.y);	//输出：4
        //2
        t1.test2();					//输出：test2	test1
        //3
        t1.test3(5,3);				//输出：5,3 改变后：8，2
    }
}
