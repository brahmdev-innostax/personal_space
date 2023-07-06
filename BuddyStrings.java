class Solution {
    public boolean buddyStrings(String s, String goal) {
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                // create a new array temp
                char temp[] = arr.clone();
                // swap i and j elements of temp
                char t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
                if(new String(temp).equals(goal))
                    return true; 
            }
        }
        return false;
    }
}
