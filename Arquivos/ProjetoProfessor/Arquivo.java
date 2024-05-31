import java.io.FileWriter;
import java.io.PrintWriter;
public class Arquivo {
	public static void main(String[] args) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("numeros.txt");
			arquivo = new PrintWriter(out);
			for (int i = 0; i < 100; i++) {
				arquivo.println(Math.round(Math.random() * 100));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			arquivo.close();
		}
	}
}