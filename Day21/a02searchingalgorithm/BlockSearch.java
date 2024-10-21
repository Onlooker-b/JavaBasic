package Day21.a02searchingalgorithm;

public class BlockSearch {
    public static void main(String[] args) {
        /*
         * 分块查找核心思想：
         * 块内无序，块间有序
         * 
         * 分块查找的过程：
         * 1. 需要把数据分成N多小块，块与块之间不能有数据重复的交集。
         * 2. 给每一块创建对象单独存储到数组当中
         * 3. 查找数据的时候，先在数组查，当前数据属于哪一块
         * 4. 再到这一块中顺序查找
         */

        int[] arr = { 16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66 };
        // 18个元素，开根号大概是4.25，分为4组左右

        // 1、创建3个块对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        // 2、创建一个数组管理这三个块（索引表）
        Block[] blockArr = {b1,b2,b3};

        // 3、在这个索引表中查找数据
        // 传递索引表，数组，需要查找的值
        System.out.println(blockSearch(blockArr,arr,52));
    }

    private static int blockSearch(Block[] blockArr, int[] arr, int value) {
        // 1、确定需要查找的值位于那一块
        int Block_index = findIndexBlock(blockArr,value);
        if (Block_index == -1) {
            // value不在数组中
            return -1;
        }
        // 2、在这个块中进行查找
        Block block = blockArr[Block_index];
        int min = block.getStartIndex();
        int max = block.getEndIndex();
        for (int i = min; i <= max; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexBlock(Block[] blockArr, int value) {
        /*
         * Block b1 = new Block(21,0,5);
         * Block b2 = new Block(45, 6, 11);
         * Block b3 = new Block(73, 12, 17);
        */
        // 从0索引开始遍历blockArr，如果number小于max，那么就表示number是在这一块当中的
        for (int i = 0; i < blockArr.length; i++) {
            Block block = blockArr[i];
            if (value <= block.getMax()) {
                return i;
            }
        }
        return -1;
    }
}
/**
 * Block
 */
class Block {
    private int max;// 最大值
    private int startIndex;// 起始索引
    private int endIndex;// 结束索引
    
    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
    
}
