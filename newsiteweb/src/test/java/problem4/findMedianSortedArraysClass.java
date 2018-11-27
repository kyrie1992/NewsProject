package problem4;

/**
 * Created by nawei on 2018/11/22.
 */
public class findMedianSortedArraysClass {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergeArray = new int[nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                mergeArray[k++] = nums1[i++];
            }else{
                mergeArray[k++] = nums2[j++];
            }
        }
        while(i<nums1.length){
            mergeArray[k++] = nums1[i++];
        }
        while(j<nums2.length){
            mergeArray[k++] = nums2[j++];
        }
        if(k%2==0){
            int middleTemp = k/2;
            return (mergeArray[middleTemp] + mergeArray[middleTemp-1])*1.0/2;
        }else{
            return mergeArray[k/2];
        }
    }
}
