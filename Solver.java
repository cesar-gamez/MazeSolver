import java.util.Stack;

public class Solver
{
    public static Stack<Cell> solve(Cell[][] maze, int r, int c, Stack<Cell> s) {
        Cell openCell = findOpenCell(maze, r, c);
        if(r == maze.length-1 && c == maze[r].length-1) {
            maze[r][c].setOpen("-");
            s.push(maze[r][c]);
            return s;
        }
        if(openCell != null) {
            s.push(maze[r][c]);
            maze[r][c].setOpen("-");
            return solve(maze, openCell.getRow(), openCell.getCol(), s);
        }
        if(!s.empty()) {
            maze[r][c].setOpen("X");
            int row = s.peek().getRow();
            int col = s.peek().getCol();
            s.pop();
            return solve(maze, row, col, s);
        }
        return s;
    }
    public static Cell findOpenCell(Cell[][] maze, int r, int c) {
        if(r+1 < maze.length && maze[r+1][c].getOpen().equals("0")) {
            return maze[r+1][c];
        }
        if(r-1 >= 0 && maze[r-1][c].getOpen().equals("0")) {
            return maze[r-1][c];
        }
        if(c+1 < maze[r].length && maze[r][c+1].getOpen().equals("0")) {
            return maze[r][c+1];
        }
        if(c-1 >= 0 && maze[r][c-1].getOpen().equals("0")) {
            return maze[r][c-1];
        }
        return null;
    }
}
