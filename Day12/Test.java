package Day12;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String s = getCode();
        System.out.println(s);
        
        ArrayList<User> list = new ArrayList<>();
        User u = new User("yuanjiayi", "0416", "11111", "1234");
        list.add(u);
        System.out.println(checkUserInfo(list, "yuanjiayi", "041"));
    }
    private static String getCode(){
        //1、创建一个有大小写字母的集合
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) (97 + i)); // 小写
        }
        for (int i = 0; i < 26; i++) {
            list.add((char) (65 + i)); // 大写
        }
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        // 3、把随机生成的数字放到末尾
        int number = r.nextInt(10);
        sb.append(number);
        // 4、把字符串变为字符数组，再使用随机索引改变顺序
        char[] arr = sb.toString().toCharArray();
        int ram_index = r.nextInt(arr.length);
        char temp = arr[ram_index];
        arr[ram_index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        String s = new String(arr);
        return s;
    }
    
    private static boolean checkUserInfo(ArrayList<User> list, String username, String password) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            // 获取username
            if (u.getUsername().equals(username)) {
                if (u.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
}
