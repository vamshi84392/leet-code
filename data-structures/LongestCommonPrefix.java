public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        return recursiveCheck(new StringBuilder(strs[0]), strs);
    }

    private String recursiveCheck (StringBuilder finalString, String[] strs) {
        for(int i=1;i<strs.length;i++) {
            if (!strs[i].startsWith(finalString.toString())) {
                finalString.setLength(finalString.length() - 1);
                recursiveCheck(finalString, strs);
            }
        }
        return finalString.toString();
    }
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
