package Day21.a02searchingalgorithm;

public class BlockSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = { 27, 22, 30, 40, 36,
                    13, 19, 16, 20,
                    7, 10,
                    43, 50, 48};
        
        Block_N b1 = new Block_N(22, 40, 0, 4);
        Block_N b2 = new Block_N(13, 20, 5, 8);
        Block_N b3 = new Block_N(7, 10, 9, 10);
        Block_N b4 = new Block_N(43, 50, 11, 13);

        Block_N[] blockArr = {b1,b2,b3,b4};

        // 传递索引表，数组，需要查找的值
        System.out.println(blockSearch(blockArr, arr, 7));
    }

    private static int blockSearch(Block_N[] blockArr, int[] arr, int value) {
        // 1、确定在哪块
        int blockIndex = findIndexBlock(blockArr,value);
        if (blockIndex == -1) {
            // value不在数组中
            return -1;
        }
        Block_N block = blockArr[blockIndex];

        // 2、在这个块中查找
        int min = block.getStartIndex();
        int max = block.getEndIndex();
        for (int i = min; i <= max; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexBlock(Block_N[] blockArr, int value) {
        // 从0索引开始遍历blockArr，如果number小于max且大于min，那么就表示number是在这一块当中的
        for (int i = 0; i < blockArr.length; i++) {
            Block_N block = blockArr[i];
            if (value <= block.getMax() && value >= block.getMin()) {
                return i;
            }
        }
        return -1;
    }
}
/**
 * Block
 */
class Block_N {
    private int max;// 最大值
    private int min;// 最小值
    private int startIndex;// 起始索引
    private int endIndex;// 结束索引
    public Block_N() {
    }
    public Block_N(int min, int max, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
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