public class Leetcode81 {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    static int findPivotWithDuplicates(int[]arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at mid, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //Note - what if these elements at start and end are pivot??
                //check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }

                start ++;

                // check if end is pivot

                if(arr[end] < arr[end-1]){
                    return end - 1;
                }
                end --;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int search(int [] nums, int target){
        int pivot = findPivotWithDuplicates(nums);

        //if you did not find a pivot it means array is not rotated
        if(pivot == -1){
            //do normal binary search
            return binSearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found you have found 2 ascending sorted array
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binSearch(nums, target, 0, pivot-1);

        }else{
            return binSearch(nums, target, pivot+1, nums.length-1);
        }

    }
    static int binSearch(int []arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;//element does not exist in the array
    }
}
