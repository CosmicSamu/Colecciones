import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Strings {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Ana");
		nombres.add("Antonio");
		nombres.add("Carlos");

		Iterator<String> it = nombres.iterator();

		while (it.hasNext()) {
			if (it.next().equals("Antonio")) {
				it.remove();
			}
		}
		for(String S:nombres) {
			System.out.println(S);
		}

	}

}
