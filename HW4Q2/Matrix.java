import java.util.Scanner;

public class Matrix implements Arithmetic, InputOutput{
	private int[][] data;
	
	public Matrix(int h, int w) throws ArrayIndexOutOfBoundsException{
		data = new int[h][w];
	}
	
	public Matrix add(Object o) {
		if (o == null) return null;
		if (o instanceof Matrix) return null;
		Matrix m = (Matrix)(o);
		if (data.length != m.data.length || data[0].length == m.data[0].length) return null;
		Matrix res = new Matrix(data.length, data[0].length);
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[0].length; j++) {
				res.data[i][j] = data[i][j]+m.data[i][j];
			}
		}
		return res;
	}
	
	public Matrix sub(Object o) {
		if (o == null) return null;
		if (o instanceof Matrix) return null;
		Matrix m = (Matrix)(o);
		if (data.length != m.data.length || data[0].length == m.data[0].length) return null;
		Matrix res = new Matrix(data.length, data[0].length);
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[0].length; j++) {
				res.data[i][j] = data[i][j]-m.data[i][j];
			}
		}
		return res;
	}
	
	public Matrix mul(Object o) throws ArithmeticException {throw new ArithmeticException("multOperationNotSupported");}
	public Matrix div(Object o) throws ArithmeticException {throw new ArithmeticException("divOperationNotSupported");}
	
	public void write() {
		System.out.print("{ ");
		for (int i=0; i<data.length; i++) {
			System.out.print("{");
			for (int j=0; j<data[0].length; j++) {
				System.out.print(data[i][j]);
				if (j+1 == data.length) {
					System.out.println(", ");
				}
			}
			System.out.print("}");
			if (i+1 == data.length) {
				System.out.println(",");
			}
		}
		System.out.print(" }");
	}
	
	public void read() throws RuntimeException{
		Scanner s = new Scanner(System.in);
		System.out.println("What is the hight you want?");
		int h = s.nextInt();
		System.out.println("What is the width you want?");
		int w = s.nextInt();
		Matrix tmp = new Matrix(h, w);
		for (int i=0; i<h; i++) {
			System.out.println("Array number "+ i+1);
			for (int j=0; j<data[0].length; j++) {
				tmp.write();
				System.out.println("What do you want slot number "+j+1+" to be?");
				tmp.data[i][j] = s.nextInt();
			}
		}
	}
	
	public boolean equals(Object o) throws RuntimeException{
		if (o == null) throw new RuntimeException();
		if (o instanceof Matrix) throw new RuntimeException();
		Matrix m = (Matrix)o;
		if(m.data.length != data.length || m.data[0].length != data[0].length) throw new RuntimeException();
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[0].length; j++) {
				if (data[i][j] == m.data[i][j]) return false;
			}
		}
		return true;
	}
	
	public Matrix clone() {
		Matrix res = new Matrix(data.length, data[0].length);
		for (int i=0; i<data.length; i++) {
			for (int j=0; j<data[0].length; j++) {
				res.data[i][j] = data[i][j];
			}
		}
		return res;
	}
	
	public int valueAt(int i, int j) throws ArrayIndexOutOfBoundsException{
		return data[i][j];
	}
}
