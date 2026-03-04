class Solution {
    public int mostWordsFound(String[] sentences) {
       int maxwords=0;
       for(int i=0;i<sentences.length;i++){
        String[] words = sentences[i].split(" ");
        int currentlength=words.length;
        if(currentlength> maxwords){
            maxwords=currentlength;

        }
       }
       return maxwords;
    }
}