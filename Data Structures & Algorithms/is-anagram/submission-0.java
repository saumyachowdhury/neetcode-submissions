class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] ch1=s.toCharArray();
        // char[] ch2=t.toCharArray();

        List<String> strList1 =Arrays.asList(s.split(""));
        List<String> strList2 =Arrays.asList(t.split(""));       
        Collections.sort(strList1);
        Collections.sort(strList2);
        if((strList1).equals(strList2))
         return true;
         else 
         return false;

    }
}
