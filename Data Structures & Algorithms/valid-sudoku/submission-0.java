class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i  = 0 ; i < 9 ; i++){
            HashSet<Character>seen = new HashSet<>();
            for(int j = 0 ; j < 9 ; j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if(seen.contains(ch)){
                    return false;
                }
                seen.add(ch);
            }
        }
        for(int j = 0 ; j < 9 ; j++){
            HashSet<Character>seen = new HashSet<>();
            for(int i = 0 ; i < 9 ; i++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if(seen.contains(ch)){
                    return false;
                }
                seen.add(ch);
            }    
        }
        for(int i = 0 ; i < 9  ;i += 3){
            for(int j = 0 ; j < 9 ;j += 3){
                HashSet<Character>seen = new HashSet<>();
                for(int m = i ; m < i + 3 ; m++){
                    for(int n = j ; n < j + 3 ; n++){
                        char  ch = board[m][n];
                        if(ch == '.'){
                            continue;
                        }
                        if(seen.contains(ch)){
                            return false;
                        }
                        seen.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
