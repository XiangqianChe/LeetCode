/**
 * 1~n个版本号中，如果版本号bad（<= n）有错，那么bad之后的版本也有错。已知n，如何找到bad。
 */
class VersionControl {
    private static final int bad = 4; // bad为隐藏数据
    static boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class L0278_FirstBadVersion extends VersionControl {
    public static int firstBadVersion(int n) {
        int left = 1, right = n, mid, ret = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                ret = mid; // 保存临时目标值
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}


