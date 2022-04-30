package commit.comp1011.commit099;

import java.util.ArrayList;
import java.util.List;

public class Study099 {
    public int study099(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    nums.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }

            }

        }
        for (int k = 0; k < nums.size(); k++) {
            if (k != (nums.size() - 1)) {
                if (nums.get(k) == nums.get(k + 1)) {
                    nums.remove(k);
                    nums.remove(k);
                    answer++;
                    k = -1;

                }

            }
        }

        return answer * 2;
    }

    public static void main(String[] args) {

    }
}
