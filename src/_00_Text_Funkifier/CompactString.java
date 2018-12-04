package _00_Text_Funkifier;

public class CompactString extends SpecialString {

	public CompactString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i%2 == 1) {
				if (i == s.length()-1) {
					s = s.substring(0, i-1);
				} else {
					s = s.substring(0, i-1) + s.substring(i+1);
				}
			}
		}
		return s;
	}

}
