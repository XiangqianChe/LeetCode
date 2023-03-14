/**
 * 表示论文引用次数的整型数组，如果有N篇论文的引用次数都大于N，则N的最大值为H指数
 */
public class L0274_H_Index {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n + 1]; // 计数排序，多一个桶放超出范围的数字
        for (int c : citations) {
            if (c >= n) buckets[n]++; // 论文引用次数大于n的记入多加的n号桶
            else buckets[c]++; // 其余引用次数为几，就计入几号桶
        }
        int count = 0;
        for (int i = n; i >= 0; i--) {
            count += buckets[i]; // 倒序计数
            if (count >= i) return i; // 按照定义，如果累计论文数量count此时刚好超过当前引用次数i，返回
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
}
