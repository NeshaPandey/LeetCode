class  Index_Of_The_First_Occurrence_InString {
    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();

        if(haylength==1){
            return 0;
        }

        if(haylength<needlelength){
            return -1;
        }
        
        for(int i=0;i<=haylength-needlelength;i++){
            int j=0;
            while(j<needlelength && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==needlelength){
                return i;
            }
        }
        return -1;
        
    }
}
