package javaSrcRead.dataStructure.sort;

import java.util.Arrays;

public class SortMain {
    /**
     * If the length of an array to be sorted is less than this
     * constant, insertion sort is used in preference to Quicksort.
     */
    private static final int INSERTION_SORT_THRESHOLD = 47;

    public static void dualPivotQuicksort(int[] a, int left, int right, boolean leftmost) {
        int length = right - left + 1;
        if (length < INSERTION_SORT_THRESHOLD) {
            // 对于小数组，直接使用插入排序
            // 小数组认为是小于47的数组
            insertionsort(a, left, right, leftmost);
            return;
        }
        else
        {
            // 双枢轴快速排序
            // 首先确定五个点，对这五个点排序
            // Inexpensive approximation of length / 7
            int seventh = (length >> 3) + (length >> 6) + 1;

            /*
             * Sort five evenly spaced elements around (and including) the
             * center element in the range. These elements will be used for
             * pivot selection as described below. The choice for spacing
             * these elements was empirically determined to work well on
             * a wide variety of inputs.
             */
            int e3 = (left + right) >>> 1; // The midpoint
            int e2 = e3 - seventh;
            int e1 = e2 - seventh;
            int e4 = e3 + seventh;
            int e5 = e4 + seventh;

            // Sort these elements using insertion sort
            if (a[e2] < a[e1]) { int t = a[e2]; a[e2] = a[e1]; a[e1] = t; }

            if (a[e3] < a[e2]) { int t = a[e3]; a[e3] = a[e2]; a[e2] = t;
                if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
            }
            if (a[e4] < a[e3]) { int t = a[e4]; a[e4] = a[e3]; a[e3] = t;
                if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
                    if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
                }
            }
            if (a[e5] < a[e4]) { int t = a[e5]; a[e5] = a[e4]; a[e4] = t;
                if (t < a[e3]) { a[e4] = a[e3]; a[e3] = t;
                    if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
                        if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
                    }
                }
            }

        }
    }

    public static void insertionsort(int[] a, int left, int right, boolean leftmost) {
        if (leftmost)
        {
            insertionsortLeftmost(a, left, right, leftmost);
        }
        else
        {
            insertionsortNotLeftmost(a, left, right, leftmost);
        }

    }
    public static void insertionsortLeftmost(int[] a, int left, int right, boolean leftmost) {
        /*
         * Traditional (without sentinel) insertion sort,
         * optimized for server VM, is used in case of
         * the leftmost part.
         * 传统的插入排序，没有哨兵
         * 对服务vm进行优化，适用于最左部分
         */
        // ++i; j = i;
        for (int i = left, j = i; i < right; j = ++i) {
            int ai = a[i + 1];//temp
            while (ai < a[j]) {
                a[j + 1] = a[j];
                // j == left; j--;
                if (j-- == left) {
                    break;
                }
            }
            a[j + 1] = ai;
        }

    }
    public static void traditionalInsertsort(int[] arr)
    {
        int j = 0;
        int temp = 0;
        for (int i = 1 ; i < arr.length ; i++)
        {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && temp < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void insertionsortNotLeftmost(int[] a, int left, int right, boolean leftmost) {
        /*
         * Skip the longest ascending sequence.
         * 跳过最长的上升序列。
         * 为了提高算法效率，在算法开始前，
         * 我们可以跳过数组前面已经有序的部分，
         * 从第一个无序的元素开始遍历、插入
         */
        do {
            if (left >= right) {
                return;
            }
            // ++left; a[left] >= a[left - 1]
        } while (a[++left] >= a[left - 1]);
        /*
         * Every element from adjoining part plays the role
         * of sentinel, therefore this allows us to avoid the
         * left range check on each iteration. Moreover, we use
         * the more optimized algorithm, so called pair insertion
         * sort, which is faster (in the context of Quicksort)
         * than traditional implementation of insertion sort.
         * 相邻部分中的每个元素都扮演了哨兵的角色，
         * 因此这允许我们在每次迭代中避免左范围检查。??
         * 此外，我们使用更优化的算法，即所谓的对插入排序，
         * 它比传统的插入排序实现更快（在Quicksort上下文中）。
         */
        // ++left;left <= right;
        for (int k = left; ++left <= right; k = ++left) {
            // 初始时，left == k + 1
            int a1 = a[k], a2 = a[left];

            if (a1 < a2) {
                // a2 < a1
                a2 = a1; a1 = a[left];
            }
            // --k;a1 < a[k]
            while (a1 < a[--k]) {
                a[k + 2] = a[k];
            }
            // ++k;k + 1
            a[++k + 1] = a1;

            while (a2 < a[--k]) {
                a[k + 1] = a[k];
            }
            a[k + 1] = a2;
        }
        int last = a[right];

        while (last < a[--right]) {
            a[right + 1] = a[right];
        }
        a[right + 1] = last;

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 2, 1, 2, 3, 4};
        int left = 0;
        int right = a.length - 1;
        boolean leftmost = true;
        traditionalInsertsort(a);
        // dualPivotQuicksort(a, left, right, true);
        System.out.print(Arrays.toString(a));

    }
}
