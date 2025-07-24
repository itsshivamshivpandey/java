import java.util.Scanner;

public class TicTacToe {

    public static void drawBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        // Rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' },
            { ' ', ' ', ' ' }
        };
        char player = 'X';
        int turn;

        System.out.println("Welcome to Tic-Tac-Toe!");

        for (turn = 0; turn < 9; turn++) {
            drawBoard(board);
            int row, col;

            while (true) {
                System.out.print("Player " + player + ", enter row (0-2) and column (0-2): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                    System.out.println("Invalid move. Try again.");
                } else {
                    break;
                }
            }

            board[row][col] = player;

            if (checkWin(board, player)) {
                drawBoard(board);
                System.out.println("Player " + player + " wins!");
                return;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        drawBoard(board);
        System.out.println("It's a draw!");
        scanner.close();
    }
}
