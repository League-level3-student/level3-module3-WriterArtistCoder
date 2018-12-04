package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i%2 == 1) {
				if (i == s.length()-1) {
					s = s.substring(0, i-1) + s.substring(i, i).toUpperCase();
				} else {
					s = s.substring(0, i-1) + s.substring(i, i).toUpperCase() + s.substring(i+1);
				}
			} else {
				if (i == s.length()-1) {
					s = s.substring(0, i-1) + s.substring(i, i).toLowerCase();
				} else {
					s = s.substring(0, i-1) + s.substring(i, i).toLowerCase() + s.substring(i+1);
				}
			}
		}
		return s;
	}

}
