public class MatrixUtils {
    public Matrix plus(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(A.M, A.N);
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                C.data[i][j] = A.data[i][j] + B.data[i][j];
        return C;
    }

    public Matrix get(Matrix A,int n) throws Exception {
        double[][] t =new double[1][A.N];
        t[0]=A.data[n].clone();
        Matrix C = new Matrix(t);
        return C;
    }

    public Matrix minus(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(A.M,A.N);
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                C.data[i][j] = A.data[i][j] - B.data[i][j];
        return C;
    }

    public boolean equal(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                if (A.data[i][j] != B.data[i][j]) return false;
        return true;
    }
    public boolean equal(int a, int b) {
        return a==b;
    }

    public boolean notEqual(Matrix A, Matrix B) {
        if (B.M != A.M || B.N != A.N) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < A.M; i++)
            for (int j = 0; j < A.N; j++)
                if (A.data[i][j] != B.data[i][j]) return true;
        return false;
    }

    public boolean notEqual(int A, int B) {
        return A!=B ;
    }
    public boolean less(int A, int B) {
        return A<B ;
    }
    public boolean greater(int A, int B) {
        return A>B ;
    }

    public Matrix multiplication(Matrix A, Matrix B) {
        if (A.N != B.M) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(A.M, B.N);
        for (int i = 0; i < C.M; i++)
            for (int j = 0; j < C.N; j++)
                for (int k = 0; k < A.N; k++)
                    C.data[i][j] += (A.data[i][k] * B.data[k][j]);
        return C;
    }

    public Matrix multiplication(Matrix A, double n) {
        Matrix C = new Matrix(A.M, A.N);
        for (int i = 0; i < C.M; i++)
            for (int j = 0; j < C.N; j++)
                C.data[i][j] = A.data[i][j] *n ;
        return C;
    }
}
