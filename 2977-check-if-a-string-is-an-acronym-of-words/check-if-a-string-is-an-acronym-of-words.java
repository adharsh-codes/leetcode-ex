class Solution {
    public boolean isAcronym(List<String> words, String s) {
        //List<String> letters = new ArrayList<>();
        if(words.size()!=s.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.size();i++){
            //words.get(i).charAt(0);
            //StringBuilder sb = new StringBuilder();
            sb.append(words.get(i).charAt(0));

        }
        return sb.toString().equals(s);
    }
}