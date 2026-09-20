public class ValueDemo7 {
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
      g.getAge();
      g.getName();

    }
}
