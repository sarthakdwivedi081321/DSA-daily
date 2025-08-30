class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String>[] rows = new Set[9];
                Set<String>[] cols = new Set[9];
                        Set<String>[] subGrids = new Set[9];

                                // Initialize the sets
                                        for (int i = 0; i < 9; i++) {
                                                    rows[i] = new HashSet<>();
                                                                cols[i] = new HashSet<>();
                                                                            subGrids[i] = new HashSet<>();
                                                                                    }

                                                                                            // Iterate through the board
                                                                                                    for (int i = 0; i < 9; i++) {
                                                                                                                for (int j = 0; j < 9; j++) {
                                                                                                                                char num = board[i][j];
                                                                                                                                                if (num == '.') continue;  // Skip empty cells

                                                                                                                                                                // Check row for duplicates
                                                                                                                                                                                if (!rows[i].add(String.valueOf(num))) {
                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                    // Check column for duplicates
                                                                                                                                                                                                                                                    if (!cols[j].add(String.valueOf(num))) {
                                                                                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                        // Check 3x3 sub-grid for duplicates
                                                                                                                                                                                                                                                                                                                        int subGridIndex = (i / 3) * 3 + j / 3;
                                                                                                                                                                                                                                                                                                                                        if (!subGrids[subGridIndex].add(String.valueOf(num))) {
                                                                                                                                                                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                                                        // If no duplicates are found, return true
                                                                                                                                                                                                                                                                                                                                                                                                        return true;
        
    }
}