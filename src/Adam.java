public class Adam {

    // The method that prints all
    // possible strings of length k.
    // It is mainly a wrapper over
    // recursive function printAllKLengthRec()

    static void printAllKLength(char[] set, int k){
        int n = set.length;
        printAllKLengthRec(set, "", n, k);
    }

    // The main recursive method
    // to print all possible
    // strings of length k

    static void printAllKLengthRec(char[] set, String prefix, int n, int k){
        // Base case: k is 0,
        // print prefix
        if (k == 0){
            System.out.println(prefix);
            return;
        }
        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i){
            // Next character of input added
            String newPrefix = prefix + set[i];
            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix, n, k - 1);
        }
    }

    // Driver Code
    public static void main(String[] args){
        System.out.println("First Test");
        char[] set1 = {'a', 'b'};
        int k = 3;
        printAllKLength(set1, k);
        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
        printAllKLength(set2, k);

        System.out.println("\n");
        Ex810 ex = new Ex810();
        int A[] = {10, 15, 25};
        int B[] = {1, 5, 20, 30};
        int n = A.length;
        int m = B.length;
        Ex810 generate = new Ex810();
        generate.generate(A, B, n, m);
        System.out.println("\n");
        myVersion mine = new myVersion();
        mine.start(A, B);
    }

}
