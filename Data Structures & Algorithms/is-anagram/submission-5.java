class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        // char sSort[]=s.toCharArray();
        // char tSort[]=t.toCharArray();
        // Arrays.sort(sSort);
        // Arrays.sort(tSort);

        // for(int i=0;i<s.length();i++){
        //     if(sSort[i]!=tSort[i]) return false;
        // }
        // return true;
        // // return Arrays.equals(sSort,tSort);
        HashMap<Character, Integer> sMap=new Hashmap<>();
        HashMap<Character, Integer> tMap=new Hashmap<>();
        for(int i=0;i<s.lenght();i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
                        tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);

        }
        return sMap.equals(tMap);
        



























        // HashMap <Character, Integer> countS=new HashMap<>();
        // HashMap <Character, Integer> countT=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     countS.put(s.charAt(i),countS.getOrDefault(s.charAt(i),0)+1);
        //     countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
        // }
        // return countS.equals(countT);/

        // int count[]=new int[26];
        // for(int i=0;i<s.length();i++){
        //     count[s.charAt(i)-'a']++;
        //     count[t.charAt(i)-'a']--;
        // }
        // for(int val:count){
        //     if(val!=0){
        //         return false;
        //     }
        // }
        // return true;









        // if(str1.length()!=str2.length()) return false;
        // for(int i=0;i<str1.length();i++){
        //     boolean used=false;
        //     j=i+1;
        //     while(j<str2.length()){
        //         if(st1.charAt(i)==str2.chaAt(j)){
        //             used=true;
        //         }
        //         j++;
        //     }
        // }







    
    }
}