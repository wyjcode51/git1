//学习数组初始化
public class ValueDemo5 {
 //数组静态的初始化
    public static void main(String[] args) {

        int[] arr1 ={1,2};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        //数组的动态初始化
        int [] arr2 = new int[2];
       arr2[0]= 1;
       arr2[1] = 2;
       System.out.println(arr2[0]);
       System.out.println(arr2[1]);
       //数组的遍历
        int [] arr3 ={1,2,3};
        for(int i = 0;i< arr3.length;i++){
            System.out.println(arr3[i]);
        }

    }
}