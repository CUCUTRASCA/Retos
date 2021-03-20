import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarryCounter {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			long carries = 0;
			int lastCarry = 0;
			int diferencia = 0;
			int aux = 0;
			while (!(str = br.readLine()).equals("0 0")) {
				String[] nums = str.split(" ");
				diferencia = Math.abs(nums[0].length() - nums[1].length());
				carries = 0;
				for (int i = Math.max(nums[0].length(), nums[1].length()) - 1; i >= 0; i--) {
					if (nums[0].length() >= nums[1].length())
						aux = lastCarry + Character.getNumericValue(nums[0].charAt(i));
					else
						aux = lastCarry + Character.getNumericValue(nums[1].charAt(i));
					if (i - diferencia >= 0) {
						if (nums[0].length() >= nums[1].length())
							aux += Character.getNumericValue(nums[1].charAt(i - diferencia));
						else
							aux += Character.getNumericValue(nums[0].charAt(i - diferencia));
					}
					if (aux > 9) {
						carries++;
						lastCarry = 1;
					} else {
						lastCarry = 0;
					}
				}
				System.out.println(carries);
				lastCarry = 0;
			}
		} catch (IOException e) {
		}
	}
}