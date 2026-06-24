public class CountVowels {
    public static void main(String args[]) {
        if(args.length < 1) {
            System.out.println("Usage: java CountVowels hello");
            return;
        }

        String str = args[0].toLowerCase();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Total vowels = " + count);
    }
}