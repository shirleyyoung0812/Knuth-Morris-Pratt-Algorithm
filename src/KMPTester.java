import java.util.*;
public class KMPTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KMP k = new KMP();
		String text = "bbaba";
		String pattern = "bbb";
		//k.searchSubString(text, pattern);
		List<Integer> rst = k.searchSubString(text, pattern);
		for (Integer i : rst)
			System.out.println(i);
	}

}
