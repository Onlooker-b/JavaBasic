package Day23.a04mygenerics;

import java.util.ArrayList;

public class ListUtil {
    // 因为是工具类，所以进行私有化，不允许外界创建对象
    private ListUtil(){};

    // 定义一个静态方法addAll，用来添加多个集合的元素
    // E...e表示不确定后面有多少个e 
    public static<E> void addAll(ArrayList<E> list, E...e){
        for (E element : e) {
            list.add(element);
        }
    }

}
