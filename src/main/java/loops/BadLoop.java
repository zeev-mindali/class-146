package loops;

public class BadLoop {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //Bad example for loop by for loop
//        int counter=0;
//        for (;counter<10;){
//            System.out.print(counter++ + " ");
//        }


//        final int SIZE=5;
//        for (int row=0;row<SIZE;row++){
//            for (int col=0;col<SIZE;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int row=1;row<=10;row++){
            for(int col=1;col<=10;col++){
                System.out.print(row*col+"\t");
            }
            System.out.println();
        }
    }

}
