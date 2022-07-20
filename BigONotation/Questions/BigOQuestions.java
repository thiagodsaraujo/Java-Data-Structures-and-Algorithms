package BigONotation.Questions;

import java.util.ArrayList;
import java.util.List;

public class BigOQuestions {
    public static void main(String[] args) {
        int A[] = {1, 2, 3,10,5,6};
        int n = A.length;
        test t = new test();
        System.out.print("sum of product of all pairs of array elements : ");
        System.out.println(t.findProductSum(A, n));
    }
}

    class test{

        int findProductSum(int A[], int n) {
            int product = 0;
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    product = product + A[i] * A[j];
            return product;
        }
    }

    // Question 1 - Time Complexity of Method tha returns Sum and Product of Array






