//Problema nº 186
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YElGanadorEs {

	private static int maxTeam(int[] arr) {
		boolean empate = false;
		int max = -1;
		int maxTeam = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxTeam = i + 1;
				empate = false;
			} else if (arr[i] == max)
				empate = true;
		}
		if (empate)
			return -2;
		return maxTeam;
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			int globos, teams;
			int[] arr;
			while (!(str = br.readLine()).equals("0 0")) {
				String[] split = str.split(" ");
				teams = Integer.parseInt(split[0]);
				globos = Integer.parseInt(split[1]);
				arr = new int[teams];
				for (int i = 0; i < globos; i++)
					arr[Integer.parseInt(br.readLine().split(" ")[0]) - 1]++;
				int valor = maxTeam(arr);
				if (valor == -2)
					System.out.println("EMPATE");
				else
					System.out.println(valor);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
