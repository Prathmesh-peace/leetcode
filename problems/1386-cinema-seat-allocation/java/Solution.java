class Solution {
    public int maxNumberOfFamilies(int n, int[][] rSeats) {
        int count = n*2;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i = 0; i < rSeats.length; i++){
            int x = rSeats[i][0], y = rSeats[i][1];
            if(!map.containsKey(x)) map.put(x, new HashSet<>());
            map.get(x).add(y); 
        }
        for(int key : map.keySet()){
            Set<Integer> s = map.get(key);
            boolean left = true;
            for(int i = 2; i <= 5; i++){
                if(s.contains(i)){
                    left = false;
                    break;
                }
            }
            boolean mid = true;
            for(int i = 4; i <= 7; i++){
                if(s.contains(i)){
                    mid = false;
                    break;
                }
            }
            boolean right = true;
            for(int i = 6; i <= 9; i++){
                if(s.contains(i)){
                    right = false;
                    break;
                }
            }
            if(left && right) count -= 0;
            else if(left || mid || right) count--;
            else count -= 2;
        }
        return count;
    }
}