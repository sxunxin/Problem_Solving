import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            map.merge(genres[i], plays[i], Integer::sum);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue()); 
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : list) {
            String genre = entry.getKey();
            List<int[]> genreList = new ArrayList<>();
            
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(genre)) genreList.add(new int[]{i, plays[i]});
            }
            
            genreList.sort((a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1];
                return a[0] - b[0];
            });
            
            int count = Math.min(2, genreList.size());
            for (int i = 0; i < count; i++) {
                result.add(genreList.get(i)[0]);                  
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);                          
        }
        
        return answer;
    }
}