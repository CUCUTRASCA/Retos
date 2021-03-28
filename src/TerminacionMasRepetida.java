//Problema nº 387
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminacionMasRepetida {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			while (!(str = br.readLine()).equals("0")) {
				int numero = Integer.parseInt(str);
				str = br.readLine();
				if (numero == 1)
					System.out.println(Character.getNumericValue(str.charAt(str.length() - 1)));
				else {
					String[] nums = str.split(" ");
					int[] memoria = new int[10];
					for (int i = 0; i < numero; i++) {
						memoria[Character.getNumericValue(nums[i].charAt(nums[i].length() - 1))]++;
					}
					int max = 0;
					boolean varios = false;
					int maxCantidad = 0;
					for (int i = 0; i < memoria.length; i++) {
						if (memoria[i] == maxCantidad && i > 0) {
							varios = true;
						} else if (memoria[i] > maxCantidad) {
							max = i;
							varios = false;
							maxCantidad = memoria[i];
						}
					}
					if (varios)
						System.out.println("VARIAS");
					else
						System.out.println(max);
				}
			}
		} catch (IOException e) {
		}
	}
}
