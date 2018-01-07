import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by think on 2018/1/7.
 */
/*
* �������ݣ�
* �����ݡ������ݡ����ظ���û���ظ�
* */
public class main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10};
        System.out.println(containsDuplicate2(nums));
    }

    //�����ݳ�ʱ
    public static boolean containsDuplicate1(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    //����ok
    //time:O(nlogn) space:O(1)
    public static boolean containsDuplicate2(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    //hashset�ķ���������ȥ��
    //time:O(n) space:O(n)
    public static boolean containsDuplicate3(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
