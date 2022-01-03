package book;

public class loops_targil16 {
    public static void main(String[] args) {
        final int TOTAL_YADID = 10;
        int yadid = 0;
        int counter = 0, num = 2, holdNum = 0;

        while (counter < TOTAL_YADID) {

            if (num == totalDividerSum(totalDividerSum(num))
                    && num != totalDividerSum(num)
                    && num != holdNum) {
                System.out.println(num + " " + totalDividerSum(num));
                holdNum = totalDividerSum(num);
                counter++;

            }
            num++;
        }
    }

    public static int totalDividerSum(int num) {
        int result = 0;
        for (int counter = 1; counter <= num / 2; counter++) {
            if (num % counter == 0) {
                result += counter;
            }
        }
        return result;
    }
}
