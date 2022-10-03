# Java
For Practice

/*
You have a chat log of n messages. You are given two string arrays messages and senders where messages[i] is a message sent by senders[i].

A message is list of words that are separated by a single space with no leading or trailing spaces. The word count of a sender is the total number of words sent by the sender. Note that a sender may send more than one message.

Return the sender with the largest word count. If there is more than one sender with the largest word count, return the one with the lexicographically largest name.

Note:

Uppercase letters come before lowercase letters in lexicographical order.
"Alice" and "alice" are distinct.
 

Example 1:

Input: messages = ["Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"], senders = ["Alice","userTwo","userThree","Alice"]
Output: "Alice"
Explanation: Alice sends a total of 2 + 3 = 5 words.
userTwo sends a total of 2 words.
userThree sends a total of 3 words.
Since Alice has the largest word count, we return "Alice".
Example 2:

Input: messages = ["How is leetcode for everyone","Leetcode is useful for practice"], senders = ["Bob","Charlie"]
Output: "Charlie"
Explanation: Bob sends a total of 5 words.
Charlie sends a total of 5 words.
Since there is a tie for the largest word count, we return the sender with the lexicographically larger name, Charlie.
*/

#java

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        String res = "";
        int max = 0,index = 0;
        for(int i = 0; i < senders.length; i++){
            String[] words = messages[i].split(" ");
            if(map.containsKey(senders[i])){
                map.put(senders[i], map.get(senders[i]) + words.length);
            }else {
                map.put(senders[i], words.length);
            }
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                res = entry.getKey();
            }
            if(entry.getValue() == max){
                if(res.compareTo(entry.getKey()) < 0){
                    res = entry.getKey();
                    max = entry.getValue();
                }
            }
            index++;
        }
        return res;
    }
}
