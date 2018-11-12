/**
 * 求最大子序列和
 * Created by nawei on 2018/11/9.
 */
public class ContinuousSubsequenceMax {

    public static int[] waitingArray =  { -2, 11, -4, 13, -5, -2 };

    /**
     * 穷举法
     * 遍历以任意开头的子序列之和最大值
     */
    public static void test1(){
        int maxSum = 0;
        for (int i=0;i<waitingArray.length;i++){
            int tempSum = 0;
            for(int j=i;j<waitingArray.length;j++){
                tempSum+=waitingArray[j];
                if(tempSum>maxSum){
                    maxSum = tempSum;
                }
            }
        }
        System.out.println("最大值是："+maxSum);
    }

    /**
     * 分治法
     */
    public static void test2(int start,int end,int[] array){


    }

    /**
     * dp法动态规划
     *
     * 假设有序列{a1,a2,...,an}，求子序列的和最大问题，我们用dp[i]表示以ai结尾的子序列的最大和。

     dp[1] = a1; (a1>=0 && i == 1)

     dp[i] = dp[i-1]+ai; (ai>=0 && i>=2)

     dp[i] = 0; (dp[i-1] + ai <=0 && i>=2)
     *
     * sum(i) = max(sum(i-1)+a[i],a[i])
     */
    public static void test3(){
        int sumMax = 0;
        int tempMax =0;
        for(int i=0;i<waitingArray.length;i++){
             if(tempMax+waitingArray[i]>waitingArray[i]){
                 tempMax+=waitingArray[i];
             }else{
                 tempMax=waitingArray[i];
             }
             if(tempMax>sumMax){
                 sumMax=tempMax;
             }
        }
        System.out.println(sumMax);
    }

    public static void main(String[] args) {
        test1();
        test3();
    }

}
