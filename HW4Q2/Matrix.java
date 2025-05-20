import java.util.Scanner;

public class Matrix implements Arithmetic, InputOutput, Cloneable {
	private int[][] data;

	public Matrix(int h, int w) throws NegativeArraySizeException, ZeroArraySizeException {
		if (h == 0 || w == 0)
			throw new ZeroArraySizeException();
		data = new int[h][w];
	}

	public Matrix add(Object o) throws OparatingOnMatrixesWithoutTheSameLengthExeption {
		if (o == null)
			return null;
		if (!(o instanceof Matrix))
			return null;
		Matrix m = (Matrix) (o);
		if (data.length != m.data.length || data[0].length != m.data[0].length)
			throw new OparatingOnMatrixesWithoutTheSameLengthExeption();
		Matrix res = new Matrix(data.length, data[0].length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				res.data[i][j] = data[i][j] + m.data[i][j];
			}
		}
		return res;
	}

	public Matrix sub(Object o) throws OparatingOnMatrixesWithoutTheSameLengthExeption {
		if (o == null)
			return null;
		if (!(o instanceof Matrix))
			return null;
		Matrix m = (Matrix) (o);
		if (data.length != m.data.length || data[0].length != m.data[0].length)
			throw new OparatingOnMatrixesWithoutTheSameLengthExeption();
		Matrix res = new Matrix(data.length, data[0].length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				res.data[i][j] = data[i][j] - m.data[i][j];
			}
		}
		return res;
	}

	public Matrix mul(Object o) throws mulOperationNotSupported {
		throw new mulOperationNotSupported();
	}

	public Matrix div(Object o) throws divOperationNotSupported {
		throw new divOperationNotSupported();
	}

	public void write() {
		System.out.print("{ ");
		for (int i = 0; i < data.length; i++) {
			System.out.print("{ ");
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j]);
				if (j < data[0].length - 1)
					System.out.print(", ");
			}
			System.out.print(" }");
			if (i < data.length - 1)
				System.out.print(", ");
		}
		System.out.println(" }");
	}

	public void read() throws RuntimeException {
		Scanner s = new Scanner(System.in);
		System.out.println("What is the hight you want?");
		int h = s.nextInt();
		System.out.println("What is the width you want?");
		int w = s.nextInt();
		this.data = new int[h][w];
		for (int i = 0; i < h; i++) {
			System.out.println("Array number " + i + 1);
			for (int j = 0; j < data[0].length; j++) {
				this.write();
				System.out.println("What do you want slot number " + j + 1 + " to be?");
				this.data[i][j] = s.nextInt();
			}
		}
	}

	public boolean equals(Object o)
			throws OparatingOnMatrixesWithoutTheSameLengthExeption, ComparingMatrixToNoneMatrixExeption {
		if (o == null)
			throw new ComparingMatrixToNoneMatrixExeption();
		if (!(o instanceof Matrix))
			throw new ComparingMatrixToNoneMatrixExeption();
		Matrix m = (Matrix) o;
		if (m.data.length != data.length || m.data[0].length != data[0].length)
			throw new OparatingOnMatrixesWithoutTheSameLengthExeption();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				if (data[i][j] != m.data[i][j])
					return false;
			}
		}
		return true;
	}

	public Matrix clone() {
		Matrix res = new Matrix(data.length, data[0].length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				res.data[i][j] = data[i][j];
			}
		}
		return res;
	}

	public int valueAt(int i, int j) throws ArrayIndexOutOfBoundsException {
		return data[i][j];
	}
}
