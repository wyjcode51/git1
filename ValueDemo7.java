public class ValueDemo7 {
    //javabean类
    //类名见名知意；成员变量要用private修饰；至少提供两个构造方法；对应的成员变量要setxxx/getxxx;
    public static void main(String[] args){
        phone p = new phone();
        p.brand="iqoo";
        p.price=9999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playgame();
      girl g = new girl();
      g.setAge(18);
      g.setName("静静");
      System.out.println(g.getAge());
      System.out.println(g.getName());
      Dog dog = new Dog("zhou");
      dog.bark();
    }





}
