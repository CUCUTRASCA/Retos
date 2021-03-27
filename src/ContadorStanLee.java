//Problema 475
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContadorStanLee {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str = br.readLine();
			int numero = Integer.parseInt(str);
			String original = "stanlee";
			while (numero > 0) {
				int contador = 0;
				int j = 0;
				str = br.readLine().toLowerCase();
				for (int i = 0; i < str.length(); i++) {
					if (str.charAt(i) == original.charAt(j))
						j++;
					if (j == 7) {
						contador++;
						j = 0;
					}
				}
				System.out.println(contador);
				numero--;
			}
		} catch (IOException e) {
		}
	}
}