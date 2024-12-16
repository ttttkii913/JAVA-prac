import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> race = new HashMap<>();
        
        for (int i = 0; i < players.length; i++)
            race.put(players[i], i);
        
        for (String calling : callings) {
            int currentRank = race.get(calling);
            
            if (currentRank > 0) {
                String frontPlayer = players[currentRank - 1];
                
                players[currentRank - 1] = calling;
                players[currentRank] = frontPlayer;
                
                race.put(calling, currentRank - 1);
                race.put(frontPlayer, currentRank);
            }
        }
         
        return players;
    }
}