package test0519;


import java.util.TreeMap;

public class Test02 {

    public static void main(String[] args) {
        String str = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";

        print(findMaxLenChildString(str));

    }

    public static String findMaxLenChildString(String paramString) {
        if ("".equals(paramString) || null == paramString) {
            return "";
        }
        TreeMap<Integer, String> map = new TreeMap<>();

        int length = paramString.length();

        for (int j = 0; j < length; j ++) {
            for (int i = j; i < length; i ++) {
                String s = paramString.substring(j, i + 1);
                if (weatherPalindromeString(s)) {
                    map.put(s.length(), s);
                }
            }
        }
        return map.get(map.lastKey());
    }


    public static boolean weatherPalindromeString(String paramString) {
        // 原始数组(字符串转字符数组)
        char[] originalCharArray = paramString.toCharArray();

        // 得到原数组长度
        int originalCharArrayLength = originalCharArray.length;

        // 定义一个登场等长新数组
        char[] newCharArray = new char[originalCharArrayLength];

        // 循环向新数组中做入数据
        for (int i = 0, j = originalCharArrayLength - 1;
             i < originalCharArrayLength && j >= 0;
             i ++, j --) {
            newCharArray[j] = originalCharArray[i];
        }

        // 遍历比较两个数组中的数据,除非一模一样,否则就不是回文字符串
        for (int i = 0; i < originalCharArrayLength; i ++) {
            if (newCharArray[i] != originalCharArray[i]) {
                return false;
            }
        }

        return true;
    }



    public static void print(Object object) {
        System.out.println(object == null ? "null" : object.toString());
    }

}
