package Day16.src.ui;

import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

public class GameJFrame extends JFrame implements KeyListener, ActionListener{

    // 创建一个二维数组，用来存放打乱后的图片数据
    int[][] new_arr = new int[4][4];
    // 记录空白图片所在的位置
    int x = 0;
    int y = 0;

    // 记录图片路径
    String path = ramdomPath();

    // 定义一个记录正确顺序的数组，如果new_arr与win_arr一致，成功
    int[][] win_arr = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    // 定义一个统计步数的对象
    int step = 0;

    // 按钮
    JMenuItem replay_item = new JMenuItem("重新游戏");
    JMenuItem relogin_item = new JMenuItem("重新登录");
    JMenuItem close_item = new JMenuItem("关闭游戏");

    JMenuItem accout_item = new JMenuItem("公众号");

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    // 创建一个游戏的主界面
    public GameJFrame(){
        
        // 初始化界面设置
        initJFrame();

        // 初始化菜单设置
        initJMenuBar();

        // 初始化数据（打乱图片）
        initData();
        
        // 初始化图片（根据打乱后的顺序生成全图）
        initImage();

        // 默认是隐藏的，在最后展示出来
        this.setVisible(true);
    }

    private void initData() {
        // 1、定义一个一维数组
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // 2、打乱内部顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            // 获取随机索引
            int ram_index = r.nextInt(arr.length);
            // 将随机索引对应的数字与i对应的交换位置
            int temp = arr[i];
            arr[i] = arr[ram_index];
            arr[ram_index] = temp;
        }
        // 3、给二维数组添加数据
        for (int i = 0; i < arr.length; i++) {
            // 4、记录0这个空白图片在二维数组的位置
            if(arr[i] == 0){
                x = i / 4;
                y = i % 4;
            }
            new_arr[i / 4][i % 4] = arr[i];
        }
        System.out.println(x);
        System.out.println(y);
    }

    // 初始化，随机抽取图片，选择路径
    private String ramdomPath(){
        // 1、随机从动物，运动，美女中选
        Random r = new Random();
        int leibie = r.nextInt(3);
        if (leibie == 0) {
            // 2、从动物中随机
            int animal = r.nextInt(8)+1;
            path = "Day16\\image\\animal\\animal" + animal + "\\";
        }else if (leibie == 1) {
            // 3、从女生里面随机
            int girl = r.nextInt(13) + 1;
            path = "Day16\\image\\girl\\girl" + girl + "\\";
        }else if (leibie == 2) {
            // 3、从运动里面随机
            int sport = r.nextInt(10) + 1;
            path = "Day16\\image\\sport\\sport" + sport + "\\";
        }
        return path;
    }

    // 按照打乱后的顺序，二维数组中的顺序
    private void initImage() {
        // 每次调用重新加载图片顺序时，都需要把之前已经出现的图片清理掉
        this.getContentPane().removeAll();
        // 先加载的图片在上方，后加载的图片在下面

        // path = "Day16\\image\\girl\\girl13\\";
        System.out.println(path+"1.jpg");
        // 判断是否完成
        if (victory()) {
            // 显示胜利的图标
            ImageIcon v = new ImageIcon("Day16\\image\\win.png");
            JLabel vJLabel = new JLabel(v);
            vJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(vJLabel);
        }
        
        // 定义一个可以显示步数的标签
        JLabel stepCount = new JLabel("步数： " + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        // 外循环：循环生成了四行。 i代表行索引
        for (int i = 0; i < 4; i++) {
            // 内循环：在一行里面添加了四张图片  j代表列索引
            for (int j = 0; j < 4; j++) {
                // 获取当前的二维数组中的数据
                int number = new_arr[i][j];
                // 创建一个图片ImageIcon的对象
                ImageIcon icon = new ImageIcon(path + number + ".jpg");
                // 创建一个JLabel的对象（管理容器），把图片放到这个容器里面
                JLabel jl = new JLabel(icon);
                // 设置JLabel的位置  
                // 先铺第0行：此时i=0，后一个图片都是之前图片往右移一个单位，第一个参数增长
                jl.setBounds(105 * j + 83,105 * i + 134,105,105);
                // 给图片添加边框
                // 0：图片凸起
                // 1：图片凹下去
                jl.setBorder(new BevelBorder(1));
                // 把管理容器添加到界面中
                // this.add(jl);
                // 通过getContentPane()获取JFrame下面的空白部分
                this.getContentPane().add(jl);
            }
        }

        // 背景图片
        ImageIcon backgroud = new ImageIcon("Day16\\image\\background.png");
        JLabel backgroudjl = new JLabel(backgroud);
        backgroudjl.setBounds(40, 40, 500, 560);
        this.getContentPane().add(backgroudjl);

        // 刷新一下界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        // 创建菜单
        JMenuBar jmb = new JMenuBar();
        // 创建菜单上的选项
        JMenu function_jm = new JMenu("功能");
        JMenu about_jm = new JMenu("关于我们");
        JMenu changeImage = new JMenu("更换图片");


        // 监控这几个按钮
        replay_item.addActionListener(this);     
        relogin_item.addActionListener(this);
        close_item.addActionListener(this);
        accout_item.addActionListener(this);

        // 把选项的具体内容放到第一级菜单里面
        function_jm.add(replay_item);
        function_jm.add(relogin_item);
        function_jm.add(close_item);
        about_jm.add(accout_item);

        // 把更换图片放到功能里面
        function_jm.add(changeImage);
        // 把不同类别放到更换图片里面
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        // 为更换具体类别的图片添加监控
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        // 把两个菜单放到顶部
        jmb.add(function_jm);
        jmb.add(about_jm);

        // 把JMenuBar放到界面上
        this.setJMenuBar(jmb);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        // 设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面指定
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式，关闭窗口直接停止java虚拟机。或者写3
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置，这样才能通过指定xy轴的形式控制组件的位置
        this.setLayout(null);
        // 对于整个界面实现键盘监听
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // 重写父类方法，没有方法体
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 按住A不松开，显示完整图片
        int code = e.getKeyCode();
        if (code == 65) {
            // 删除之前的图片
            this.getContentPane().removeAll();
            // 获取完整的图片
            ImageIcon icon = new ImageIcon(path + "all.jpg");
            // 创建一个JLabel的对象（管理容器），把图片放到这个容器里面
            JLabel all = new JLabel(icon);
            // 设置容器的大小
            all.setBounds(83, 134, 420, 420);
            // 加载图片到窗口上
            this.getContentPane().add(all);

            // 加载背景图片
            JLabel backgroudjl = new JLabel(new ImageIcon("Day16\\image\\background.png"));
            backgroudjl.setBounds(40, 40, 500, 560);
            this.getContentPane().add(backgroudjl);

            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 首先判断游戏是否胜利，如果胜利了，直接返回，不再执行
        if (victory()) {
            return;
        }

        // 获取松开的键盘键位对应的编号
        // 左：37  上：38  右：39  下：40
        int code = e.getKeyCode();
        if (code == 37) {
            // 当空白图在最右边一列时，无法向左移动
            if(y == 3){
                return;
            }
            // 空白方块(x,y) 右边的图片(x,(y+1))
            // 把右方图片放到（x,y）
            new_arr[x][y] = new_arr[x][y + 1];
            // 把原来的位置设置为空白
            new_arr[x][y + 1] = 0;     
            // 把（x,y）对应的图片还原为空白
            y++;     
            step++;
            // 调用展示图片的方法，按照新的二维数组的顺序展示图片，显示最新的步数
            initImage();
            System.out.println("左");

        } else if (code ==38){
            // 当空白图在最下面时，无法向上移动
            if (x == 3) {
                return;
            }
            // 向上移动：空白方块下方的图片向上移动
            // 空白方块(x,y)  下方的图片((x+1),y)
            // 把下方图片放到（x,y）
            new_arr[x][y] = new_arr[x + 1][y];
            // 把原来的位置设置为空白
            new_arr[x + 1][y] = 0;
            // 把（x,y）对应的图片还原为空白
            x++;
            step++;
            initImage();
            System.out.println("上");

        } else if (code == 39){
            // 当空白图在最左边一列时，无法向右移动
            if (y == 0) {
                return;
            }
            // 空白方块(x,y) 左边的图片(x,(y-1))
            // 把左方图片放到（x,y）
            new_arr[x][y] = new_arr[x][y - 1];
            // 把原来的位置设置为空白
            new_arr[x][y - 1] = 0;     
            // 把（x,y）对应的图片还原为空白
            y--;       
            step++;
            initImage();
            System.out.println("右");

        } else if (code == 40){
            // 当空白图在最上边一行时，无法向下移动
            if (x == 0) {
                return;
            }
            // 空白方块(x,y) 上方的图片((x-1),y)
            // 把左方图片放到（x,y）
            new_arr[x][y] = new_arr[x - 1][y];
            // 把原来的位置设置为空白
            new_arr[x - 1][y] = 0;  
            // 把（x,y）对应的图片还原为空白
            x--;   
            step++;
            initImage();     
            System.out.println("下");

        }else if (code == 65) {
            // 重新调用图片显示功能
            initImage();

        // 当按下w时，直接通关
        }else if (code == 87) {
            // 将图片按照二维数组的顺序展示
            new_arr = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
            };
            // 然后调用展示的方法，图片就是按照这里的二维数组顺序了
            initImage();
        }

    }

    // 判断new_arr与win_arr
    public boolean victory(){
        for (int i = 0; i < new_arr.length; i++) {
            for (int j = 0; j < new_arr.length; j++) {
                // 一旦有一个不一样
                if (new_arr[i][j] != win_arr[i][j]) {
                    return false;
                }
            }
        }
        // 循环结束，说明全都一样
        return true;
    }

    // 要知道按的按钮是哪一个，所以按钮应该是成员变量
    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被点击的
        Object obj = e.getSource();
        if (obj == replay_item) {
            System.out.println("重新游戏");
            // 打乱二维数组数据
            initData();
            // 计步器归零
            step = 0;
            // 重新加载图片
            initImage();

        }else if (obj == relogin_item) {
            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();

        }else if (obj == close_item) {
            System.out.println("关闭游戏");
            // 关闭java虚拟机
            System.exit(0);;

        }else if (obj == accout_item) {
            System.out.println("关于我们");
            // 创建一个弹窗对象
            JDialog jdialog = new JDialog();
            JLabel gongzonghao = new JLabel(new ImageIcon("Day16\\image\\about.png"));
            // 设置这个label位于弹窗的位置
            gongzonghao.setBounds(0, 0, 258, 258);
            // 把label加到弹窗
            jdialog.getContentPane().add(gongzonghao);
            // 给弹窗设置大小
            jdialog.setSize(344,344);
            jdialog.setAlwaysOnTop(true);
            // 居中
            jdialog.setLocationRelativeTo(null);
            // 弹窗不关闭，就不能干别的
            jdialog.setModal(true);
            // 让弹窗显示
            jdialog.setVisible(true);
        }

        else if (obj == girl) {
            System.out.println("girl");
            // 1、修改路径
            Random r = new Random();
            // 随机在1到13中抽一个
            int ramdom = r.nextInt(13) + 1;
            path = "Day16\\image\\girl\\girl" + ramdom +"\\";
            // 2、重新开始游戏
            // 打乱二维数组数据
            initData();
            // 计步器归零
            step = 0;
            // 重新加载图片
            initImage();
            
        }
        else if (obj == animal) {
            System.out.println("animal");
            // 1、修改路径
            Random r = new Random();
            // 随机在1到8中抽一个
            int ramdom = r.nextInt(8) + 1;
            path = "Day16\\image\\animal\\animal" + ramdom + "\\";
            // 2、重新开始游戏
            // 打乱二维数组数据
            initData();
            // 计步器归零
            step = 0;
            // 重新加载图片
            initImage();
        }
        else if (obj == sport) {
            System.out.println("sport");
            // 1、修改路径
            Random r = new Random();
            // 随机在1到10中抽一个
            int ramdom = r.nextInt(10) + 1;
            path = "Day16\\image\\sport\\sport" + ramdom + "\\";
            // 2、重新开始游戏
            // 打乱二维数组数据
            initData();
            // 计步器归零
            step = 0;
            // 重新加载图片
            initImage();
        }
    }
}
