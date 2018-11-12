/**
 * Created by nawei on 2018/11/8.
 */
public class TwoNumAdd {

    public static String addTwoNum(String num1,String num2){
        String result = "";
        String tempNum1 = new StringBuilder(num1).reverse().toString();
        String tempNum2 = new StringBuilder(num2).reverse().toString();
        System.out.println(tempNum1+","+tempNum2);
        int length1 = tempNum1.length();
        int length2 = tempNum2.length();
        int length = length1>length2?length1:length2;
        int diffLength = length1 - length2;
        String addZero = "";
        for (int i=0;i<diffLength;i++){
            addZero+="0";
        }
        if(diffLength>=0){
            tempNum2+=addZero;
        }else {
            tempNum1+=addZero;
        }
        int tempCarry = 0;
        int overFlag = 0;
        for(int i=0;i<length;i++){
            int tempAdd = (Integer.valueOf(tempNum1.charAt(i)) - Integer.valueOf('0')) + (Integer.valueOf(tempNum2.charAt(i)) - Integer.valueOf('0')) + tempCarry;
            if(tempAdd>=10){
                tempAdd = tempAdd - 10;
                tempCarry = 1;
                if(i==length-1){
                    overFlag = 1;
                }
            }else{
                tempCarry = 0;
            }
            result+= String.valueOf(tempAdd);
        }
        if(overFlag==1){
            result+="1";
        }
        result = new StringBuilder(result).reverse().toString();
        return result;
    }

    public static void main(String[] args) {
        int a=122,b=998;
        System.out.println("正确的结果为："+(a+b));
        System.out.println(addTwoNum(String.valueOf(a),String.valueOf(b)));
    }
}
