public class Template {
    public static final String PROGRAM = """
  
    MatrixUtils u = new MatrixUtils();

    public static void main(String[] args) {
        try {
            new Program().run();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }"

    void run() throws Exception {
main_program
 begin
    matrix a = {{1,2,3},{4,5,6},{7,8,9}}
	matrix b = {{1,2,3},{4,5,6},{7,8,9}}
	int p = (int) 2
	print("matrix_a")
	print(a)
	print("matrix_b")
	print(b)
	vector res = (vector) qwe(a,p)
	vector aac = {1,2,3}
	print(res)
	int i = (int) 0
end

sub_program vector qwe (matrix d, int x) begin
	vector c = d[x]
	return c
end

sub_program matrix abc (vector a, int b) begin
    matrix c = (matrix) a
    return c
end
    }
""";
}
