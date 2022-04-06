public class Program {
        MatrixUtils u = new MatrixUtils();

        public static void main(String[] args) {
            try {
                new Program().run();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        void run() throws Exception {
            Matrix a = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
            Matrix b = new Matrix(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
            int p = 2;
            System.out.println("matrix_a");
            System.out.println(a);
            System.out.println("matrix_b");
            System.out.println(b);
            Matrix res = qwe(a, p);
            Matrix aac = new Matrix(new double[][]{{1, 2, 3}});
            System.out.println(res);
            int i = 0;
            while (u.less(i, p)) {
                i = (i + 1);
            }

        }

        private Matrix qwe(Matrix d, int x) throws Exception {
            Matrix c = u.get(d, x);
            return c;
        }

        private Matrix abc(Matrix a, int b) throws Exception {
            Matrix c = new Matrix(a);
            return c;
        }
}
