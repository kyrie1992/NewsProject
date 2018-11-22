import java.util.HashMap;
import java.util.Map;

/**
 * Created by nawei on 2018/11/20.
 */
public class AddTargetSum {

    public static void main(String[] args) {
        int[] targetArray = {1,2,4,5,6,9};
        int targetSum = 10;
        //violenceMethod(targetArray,targetSum);
        mapMethod(targetArray,targetSum);

    }

    /**
     * 暴力法解决，时间复杂度o（n^2）
     * @param targetArray
     * @param targetSum
     */
    public static void violenceMethod(int[] targetArray,int targetSum){
        for (int i=0;i<targetArray.length;i++){
            for (int j=i+1;j<targetArray.length;j++)
            {
                int tempSum = targetArray[i] + targetArray[j];
                if(tempSum == targetSum){
                    System.out.println(targetArray[i]+"-"+targetArray[j]);
                }
            }
        }
    }

    /**
     * 优化查找速度，采用map结构
     * @param targetArray
     * @param targetSum
     */
    public static int[] mapMethod(int[] targetArray,int targetSum){
        Map hashMap = new HashMap();
        for(int i=0;i<targetArray.length;i++){
            int targetNum = targetSum - targetArray[i];
            if(hashMap.containsKey(targetNum)){
                return new int[]{targetArray[i],targetNum};
            }else{
                hashMap.put(targetArray[i],i);
            }
        }
        return null;
    }

    public static void notMapMethod(int[] targetArray,int targetSum){

    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
