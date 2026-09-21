public class girl{
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
    }public int getAge(){
        return age;
    }
}
