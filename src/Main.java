public class Main {
    public static void main(String[] args) {
        char[] charArray = array(4);
        stampa(charArray);
    }


    public static char[] array(int size) {
        char[] charArray = new char[size];
        for (int i = 0; i < 4; i++) {
            charArray[i] = Math.random() < 0.5 ? 'a' : (char) (Math.random() * 10 + 'c');
            System.out.println(charArray);
        }
        return charArray;
    }

        public static void stampa(char[] charArray) {
        int count = 0;
        for (char c : charArray) {
            if (c == 'a') {
                count++;
                System.out.print("a ");
            }
        }
        if (count == 0) {
            System.out.print("0");
        }
    }
}