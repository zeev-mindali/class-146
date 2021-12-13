package loops;

public class MyPyramid {
    public static void main(String[] args) {
        final int SIZE=5;
        for (int rows=1;rows<=SIZE;rows+=1){
            for(int cols=SIZE-rows;cols>0;cols--){
                System.out.print(" ");
            }
            for(int cols=0;cols<rows*2-1;cols++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
