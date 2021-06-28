public class StringManipulator {

    public String trimAndConcat(String str1, String str2) {
        String newString = str1.trim() + str2.trim();
        return newString;
    }
    public Integer getIndexOrNull(String someStr, char someChar) {
        Integer value = someStr.indexOf(someChar);
        return value;
    }
    public Integer getIndexOrNull(String aString, String subString) {
        Integer value = aString.indexOf(subString);
        return value;
    }
    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String str3 = str1.substring(int1, int2);
        String finalString = str3 + str2;
        return finalString;
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat(" Hello "," World ");
        System.out.println(str);

        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
       // System.out.println(a);
       // System.out.println(b);
        System.out.println(c);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull(word, subString);
        Integer e = manipulator.getIndexOrNull(word, notSubString);
        //System.out.println(d);
        System.out.println(e);

        String Word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(Word);



    }


}
