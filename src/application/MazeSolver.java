package application;
public class MazeSolver {
    private static final int[][] DIRECTIONS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static boolean solveMaze(char[][] maze, int x, int y) {
        if (maze[x][y] == 'E') {
            // وصلنا إلى النهاية
            return true;
        }

        if (maze[x][y] == '1' || maze[x][y] == 'V') {
            // إما أنه طريق مسدود أو تمت زيارته بالفعل
            return false;
        }

        // علامة الخلية على أنها تمت زيارتها
        maze[x][y] = 'V';

        for (int[] direction : DIRECTIONS) {
            int newX = x + direction[0], newY = y + direction[1];
            if (newX >= 0 && newY >= 0 && newX < maze.length && newY < maze[0].length) {
                if (solveMaze(maze, newX, newY)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] maze = {
            {'1', '1', '1', '1', '1', '1'},
            {'1', 'S', '0', '1', '0', '1'},
            {'1', '0', '0', '0', '0', '1'},
            {'1', '0', '1', '0', '1', '1'},
            {'1', '0', '1', '0', '0', 'E'},
            {'1', '1', '1', '1', '1', '1'}
        };

        boolean result = solveMaze(maze, 1, 1);
        System.out.println("Is there a way to solve the maze? " + result);
    }
}
