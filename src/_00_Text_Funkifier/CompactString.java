package _00_Text_Funkifier;

public class CompactString extends SpecialString {

    public CompactString(String s) {
        super(s);
    }

    @Override
    public String funkifyText(String s) {
        String x = "";
        for (int i = 0; i < s.length(); i++) {
            if (i%2 == 0) {
                x += s.charAt(i);
            }
        }
        
        return x;
    }

}

