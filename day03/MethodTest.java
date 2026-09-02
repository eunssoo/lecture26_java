package method;

public class MethodTest {

    public static void main(String[] args) {

        int[] numArr = {3, 6, 2, 4, 8};

        System.out.println("getSum의 결과값 = " + getSum(numArr));
        System.out.println("getMax의 결과값 = " + getMax(numArr));
        System.out.println("getCount의 결과값 = " + getCount(numArr, 4));

        int[] resultArr = swapArray(numArr);

        System.out.print("swapArray의 결과값 = ");
        for (int i = 0; i < resultArr.length; i++) {
            System.out.print(resultArr[i] + " ");
        }
    }

    // 배열의 모든 값을 더해서 반환
    public static int getSum(int[] numArr) {
    	
    	if(numArr == null) return -1;
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        return sum;
    }

    // 배열에서 가장 큰 값 반환
    public static int getMax(int[] numArr) {

        int max = numArr[0];

        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }

        return max;
    }

    // target보다 큰 숫자의 개수 반환
    public static int getCount(int[] numArr, int target) {

        int count = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > target) {
                count++;
            }
        }

        return count;
    }

    // 배열의 값을 역순으로 저장한 새로운 배열 반환
    public static int[] swapArray(int[] numArr) {

        int[] resultArr = new int[numArr.length];

        for (int i = 0; i < numArr.length; i++) {
            resultArr[i] = numArr[numArr.length - 1 - i];
        }

        return resultArr;
    }
}