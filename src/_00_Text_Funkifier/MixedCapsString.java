package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

    public MixedCapsString(String s) {
        super(s);
    }

    @Override
    public String funkifyText(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i%2 == 0) {
                if (i == s.length()-1) {
                    s = s.substring(0, i) + s.substring(i).toLowerCase();
                } else if (i == 0) {
                    s = s.substring(0, 1).toLowerCase() + s.substring(1);
                } else {
                    s = s.substring(0, i) + s.substring(i, i+1).toLowerCase() + s.substring(i+1);
                }
            } else {
                if (i == s.length()-1) {
                    s = s.substring(0, i) + s.substring(i, i+1).toUpperCase();
                } else {
                    s = s.substring(0, i) + s.substring(i, i+1).toUpperCase() + s.substring(i+1);
                }
            }
        }
        return s;
    }

}
