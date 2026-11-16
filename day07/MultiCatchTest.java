package exception;

public class MultiCatchTest {

	public static void main(String[] args) {

	    System.out.println("======== 프로그램 시작 ========");

	    String[] array = {"100", "1oo"};

	    for (int i = 0; i < array.length; i++) {
	        try {
	            int value = Integer.parseInt(array[i]);
	            System.out.println("array[" + i + "]의 value = " + value);
	        } catch (NumberFormatException e) {
	            // System.out.println(e.toString());
	            System.out.println("array[" + i + "]의 값" + array[i] + "숫자가 아님");
	        } catch (ArrayIndexOutOfBoundsException e) {
	        	// System.out.println(e.toString());
	        	System.out.println(i + "는 배열의 범위를 벗어났습니다.");
	        }
	    }
	
        System.out.println("======== 프로그램 종료 =========");
    }
}