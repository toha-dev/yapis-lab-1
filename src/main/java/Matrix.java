public class Matrix {
    public final int M;
    public final int N;
    public final double[][] data;

    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        data = new double[M][N];
    }

    public Matrix(double[][] data) throws Exception {
        M = data.length;
        N = data[0].length;
        this.data = new double[M][N];
        try {
            for (int i = 0; i < M; i++)
                for (int j = 0; j < N; j++)
                    this.data[i][j] = data[i][j];
        } catch (Exception e){
            throw new Exception("VariableInitializeError");
        }
    }

    public Matrix(Matrix A) throws Exception { this(A.data.clone()); }

    public Matrix to_vec() throws Exception {
        double[][] d=new double[1][data[0].length];
        d[0]=data[0].clone();
        Matrix C =new Matrix(d);
        return C;
    }

    @Override
    public String toString() {
        String s="";
        for (double[] doubles: data){
            for (double d: doubles)
                s = d + " " + "\n";
        }
        return s;
    }
}
