public class ValueDemo7 {
    //javabean类
    //类名见名知意；成员变量要用private修饰；至少提供两个构造方法；对应的成员变量要setxxx/getxxx;
    //一个 .java 文件里 public 类只能有一个，且必须和文件名同名，所以下面三个类都没有 public
    public static void main(String[] args){
        Phone p = new Phone();
        p.setBrand("iqoo");
        p.setPrice(9999);
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());
        p.call();
        p.playgame();

        Girl g = new Girl();
        g.setAge(18);
        g.setName("静静");
        System.out.println(g.getAge());
        System.out.println(g.getName());

        Dog dog = new Dog("zhou");
        dog.bark();
    }
}

class Phone {
    //成员变量 private：外部不能直接改，只能走 set/get，保证数据安全
    private String brand;
    private int price;

    //参数名和成员变量同名时，用 this. 区分：this 指向当前对象（堆里的那个）
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void call(){
        System.out.println("calling");
    }
    public void playgame(){
        System.out.println("csgo");
    }
}

class Girl {
    //学习private关键字，this关键字
    //只能在本类使用，保证数据安全
    //this关键字指向全局变量否则就近原则
    private String name;
    private int age;
    public void setName(String n ){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

class Dog {
    private String name;
    //构造方法（只执行一次，new自动调用；没有返回值,方法名要一致）
    //this关键字指向堆；指向调用者；
    public Dog(String name){
        this.name = name;
        System.out.println(name);
    }
    public void bark(){
        System.out.println("wangwang");
    }
}
