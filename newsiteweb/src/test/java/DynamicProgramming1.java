/**
 * Created by nawei on 2018/11/23.
 */
public class DynamicProgramming1 {

    public static void main(String[] args) {
        int n = 5;
        int w = 10;
        int[] g = {100,90,200,200,300};
        int[] p = {5,3,5,2,3};
        getMostGold1(n,w,g,p);
        /*int result = getMostGold(n,w,g,p);
        System.out.println(result);*/
    }

    /**
     * 获取最多的金矿价值
     * @param n 金矿数量
     * @param w 工人数量
     * @param g 每个金矿的价值
     * @param p 每个金矿需要的员工个数
     * @return
     */
    public static int getMostGold(int n,int w,int[] g,int[] p){
        int[] preResults = new int[p.length];
        int[] results = new int[p.length];

        //填充边界格子的值
        for (int i=0;i<p.length;i++){
            if(i<p[0]){
                preResults[i] = 0;
            }else{
                preResults[i] = g[0];
            }
        }

        //填充其余格子的值，外层循环是金矿数量，内层循环是工人数
        for (int i=0;i<n;i++){
            for (int j=0;j<=w;j++){
                if (j<p[i]){
                    results[j] = preResults[j];
                }else {
                    results[j] = Math.max(preResults[j],preResults[j-p[i]] + g[i]);
                }
                preResults = results;
            }
        }
        return results[n];
    }

    /**
     * 优化算法
     * @param n 金矿个数
     * @param w 矿工个数
     * @param g 每个金矿的价值
     * @param p 每个金矿的人数
     *   f(n,w) = 0 (w<p[0] and n<=1)
     *   f(n,w) = g[0](w>p[0] || n==1)
     *   f(n,w) = f(n-1,w) (w<p(n-1))
     *   f(n,w) = max(f(n-1,w),f(n,w-p[n-1])+g[n]) (w>=p[n-1])
     *
     * 边界问题：
     *  f(n,w) = g[0](w>p[0] || n==1)
     *  f(n,w) = 0 (w<p[0] and n<=1)
     *
     * 状态转移方程
     * f(n,w) = max{f(n-1,w),f(n-1,w-p[n-1]+g[n])}
     */
    public static void getMostGold1(int n,int w,int[] g,int[] p){
         int[][] tableCalculate = new int[n][w];
         //初始化列表项为0
         for(int i=0;i<n;i++){
             for(int j=0;j<w;j++) {
                 if (i >= p[0]) {
                     tableCalculate[i][j] = g[0];
                 } else {
                     tableCalculate[i][j] = 0;
                 }
             }
         }

         int max = 0;
         for(int i=1;i<n;i++){
             for(int j=0;j<w;j++){
                 //人数达到
                 if (j>=p[i]){
                     tableCalculate[i][j] = Math.max(tableCalculate[i-1][j],tableCalculate[i-1][j-p[i]]+g[i]);
                 }else{
                     tableCalculate[i][j] = tableCalculate[i-1][j];
                 }
                 max = max>tableCalculate[i][j]?max:tableCalculate[i][j];
             }
         }
         System.out.println("最大值为："+max);
    }

    /**
     * 最大数值和
     * 最有子结构：是否是以当前数结尾
     * 状态转移方程：sum(n) = Max(sum(n-1),sum(n-1)+array[n])
     * 边界：sum(n) = array[0]
     * @param array
     */
    public static void LongestSum(int[] array){
        int max = 0;
        int temp = 0;
        for (int i=0;i<array.length;i++){
            if ((temp+array[i])>temp){
                temp = temp + array[i];
            }else{
                temp = array[i];
            }
            if(temp>max){
                max = temp;
            }
        }
        System.out.println("输出最大值："+max);
    }
}
