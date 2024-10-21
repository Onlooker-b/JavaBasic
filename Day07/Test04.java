public class Test04 {
    public static void main(String[] args) {
        /* 需求：
         * 把一个数组中的元素复制到另一个新数组中去。
         */

        // 1、先写一个老数组
        int[] arr = {1,2,3,4,5};
        // 2、再写一个新数组
        int[] new_arr = new int[arr.length];
        // 3、遍历老数组，把老数组的元素一个一个给新数组
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        // 4、输出新数组
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i]);
        }
    }
}
