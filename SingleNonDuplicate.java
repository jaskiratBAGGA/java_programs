public class SingleNonDuplicate {
    public static void main(String[] args) {
        int [] ar = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(ar));
    }
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int lo = 0, hi = n-1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if ((mid % 2 == 0 && mid + 1 < n  && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 == 1 && mid - 1 >= 0 && nums[mid] == nums[mid - 1]))
                lo = mid + 1;
            else
                hi = mid;

            if(mid-1 >= 0 && mid+1 <n && nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) return nums[mid];
        }
        return nums[hi];
    }
}
