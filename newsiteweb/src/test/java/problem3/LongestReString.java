package problem3;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 最长子串分析
 * Created by nawei on 2018/11/22.
 */
public class LongestReString {

    public static void main(String[] args) {
        String testStr = "bacadc";
        int numIndex = longestSubstringMethod2(testStr);
        System.out.println(numIndex);
    }
    public static int longestSubstring(String A) {
        //charPosition统计A中每种字符之前出现的位置
        Map<Character, Integer> charPosition = new HashMap<Character, Integer>();
        //preArr代表以s[i-1]结尾的情况下，最长无重复子串的长度
        int[] preArr = new int[A.length()];
        char[] str2charArr = A.toCharArray();
        //从头到尾遍历str2charArr，统计出以每个字符为当前位置的向前最长无重复子串的长度
        for(int i=0; i<A.length(); i++){
            Integer lastPosOfChar = charPosition.get(str2charArr[i]);
            if(lastPosOfChar == null){//说明当前字符第一次出现
                //更新最长无重复子串的长度
                preArr[i] = i == 0 ? 1 : preArr[i-1] + 1;
                //记录当前字符出现的位置
                charPosition.put(str2charArr[i], i);
            }
            else{//当前字符不是第一次出现(既然不是第一次出现，那也不是在第一个位置),也就是之前出现过该字符
                //获取前一个字符最长无重复子串的长度
                int aPos = lastPosOfChar + 1;
                int unRepeatLen = preArr[i-1];
                int bPos = i - unRepeatLen;
                if(aPos >= bPos){
                    //当前位置的最长无重复子串长度
                    preArr[i] = i - aPos + 1;
                }
                else{
                    //当前位置的最长无重复子串长度
                    preArr[i] = i - bPos + 1;
                }
                //跟新当前字符出现的位置
                charPosition.put(str2charArr[i], i);
            }
        }
        //遍历preArr,最大值即为所求
        int max = preArr[0];
        for(int i: preArr) if(i > max) max = i;
        return max;
    }

    /**abcdabcd
     * 最长重复子串暴力解决方法
     * @param obejctStr
     * @return
     */
    public static int longestSubstringMethod1(String obejctStr){
        int maxLength = 0;
        int objectLength = obejctStr.length();
        for(int i=0;i<objectLength;i++){
            for(int j=i;j<objectLength;j++) {
                if (isExistIncludeSet(obejctStr,i,j)) {
                    break;
                }else{
                    maxLength = (j-i)>maxLength?(j-i):maxLength;
                }
            }
        }
        return maxLength;
    }

    /**
     * 借助set集合的特性，不准含有重复的对象
     * 判断字符是否在set中
     * @param objectStr
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static boolean isExistIncludeSet(String objectStr,int startIndex,int endIndex){
        HashSet set = new HashSet();
        for(int i=startIndex;i<endIndex;i++){
            if(set.contains(objectStr.charAt(i))){
                return true;
            }else{
                set.add(objectStr.charAt(i));
            }
        }
        return false;
    }

    /**
     * 利用数组记录当前字符位置进行优化处理
     * abcdabcd
     * @return
     */
    public static int longestSubstringMethod2(String s){
        //记录字符上次出现的位置
        int last[] = new int[200];
        //记录当前子串的起始位置
        int start = 0;
        int maxLen = 0;
        //记录字符上次出现的位置
        for(int i=0;i<200;i++){
            last[i] = -1;
        }
        for(int i=0;i<s.length();i++){
            int tempIndex = s.charAt(i) - 'a';
            //当前元素重复
            if(last[tempIndex]>=start) {
                maxLen = (i-start) > maxLen ? (i-start) : maxLen;
                //移动当前位置到上一个重复元素的下一位
                start = last[tempIndex] + 1;
            }
            last[tempIndex] = i;
        }
        maxLen = maxLen>(s.length()-start)?maxLen:(s.length()-start);
        return maxLen;
    }
}
