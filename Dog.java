
   public class Dog {
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

