package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String x = "";
		
		for (char c : s.toCharArray()) {
			x=c+x;
		}
		return x;
	}

}
