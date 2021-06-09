public class ArrayGenerator {
    private ArrayGenerator(){} // 用户不需要生成这样一个对象 把构造函数置 空

    public  static Integer[] generateOrderedArray(int n){
        Integer [] arr = new Integer[n];

        for(int i = 0;i<n;i++)
            arr[i]=i;

        return arr;
    }

}
