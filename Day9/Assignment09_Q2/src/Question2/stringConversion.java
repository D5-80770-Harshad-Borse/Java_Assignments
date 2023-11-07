package Question2;

public class stringConversion {

    public static String abbreviateBankName(String s) {
        String[] words = s.split(" ");
        StringBuilder abbreviation = new StringBuilder();
        for (String word : words) {
            abbreviation.append(word.charAt(0));
        }
        return abbreviation.toString();
    }

 
    public static String capitalizeFirstLetters(String s) {
        String[] words = s.split(" ");
        StringBuilder capitalizedString = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return capitalizedString.toString().trim();
    }

    public static String toggleCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 1) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static String replaceDomain(String s) {
        if (s.endsWith(".com")) {
            return s.replace(".com", ".in");
        }
        return s;
    }

    public static void main(String[] args) {
        
    	String text1 = "Bank Of Maharashtra";
        String text2 = "this is string";
        String text3 = "Example";
        String text4 = "www.sunbeaminfo.com";

        System.out.println(abbreviateBankName(text1));

        System.out.println(capitalizeFirstLetters(text2));
        
        System.out.println(toggleCase(text3)); 
        
        System.out.println(replaceDomain(text4)); 
    }
}

