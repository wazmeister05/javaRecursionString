public class myVersion {

    void start(int[] A, int[] B){
        int[] C = new int[A.length + B.length];
        gohere(A, B, C, true, 0, 0, 0);
    }

    void gohere(int[] A, int[] B, int[] C, boolean flag, int forI, int forJ, int len){
        if(flag){
            if(len != 0){
                printArr(C, len+1);
            }
            for(int i = forI; i < A.length; i++){
                if(len == 0){
                    C[len] = A[len];
                    gohere(A, B, C, !flag, forI + 1, forJ, len);
                }
                else if (A[forI] > C[forI -1]){
                    C[len+1] = B[forI];
                    gohere(A, B, C, !flag, forI + 1, forJ, len+1);
                }
            }
        }
        else{
            for(int j = forJ; j < B.length; j++){
                if(B[forJ] > C[forJ -1]){
                    C[forJ] = B[forJ];
                    gohere(A, B, C, !flag, forI, forJ+1, len+1);
                }
            }
        }
    }

    void printArr(int arr[], int c) {
        for (int i = 0; i < c; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

}
