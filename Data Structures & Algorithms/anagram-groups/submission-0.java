class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
HashMap<String, List<String>> hm = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];

            for (char a : s.toCharArray()) {
                count[a - 'a']++;
            }
            String key = Arrays.toString(count);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
