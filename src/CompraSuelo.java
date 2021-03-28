//Problema nº 413
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompraSuelo {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str = br.readLine();
			int numero = Integer.parseInt(str);
			int multiplicacion = 0;
			while (numero > 0) {
				str = br.readLine();
				String[] arr = str.split(" ");
				multiplicacion = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
				if (multiplicacion % 2 == 0)
					System.out.println(multiplicacion / 2 + " " + multiplicacion / 2);
				else
					System.out.println(multiplicacion / 2 + 1 + " " + multiplicacion / 2);
				numero--;
			}
		} catch (IOException e) {
		}
	}
}
