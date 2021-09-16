import java.util.Stack;
import java.io.*;
import java.util.Scanner;

public class Maze
{
    private Cell[][] maze;
    public Maze(String filePath) {
        try(BufferedReader bReader = new BufferedReader(new FileReader(filePath))) {
            Scanner in = new Scanner(bReader.readLine());
            int row = in.nextInt();
            int col = in.nextInt();
            maze = new Cell[row][col];
            
            for(int r = 0; r < row; r++) {
                Scanner input = new Scanner(bReader.readLine());
                for(int c = 0; c < col; c++) {
                    maze[r][c] = new Cell(r, c, input.next());
                }
            }
        }
        catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
    public void setCellStatus(String o, Cell c) {
        c.setOpen(o);
    }
    public Cell getCell(Cell c) {
        return c;
    }
    public Cell[][] getMaze() {
        return maze;
    }
    
    public String toString() {
        String str = "";
        for(Cell[] m : maze) {
            for(Cell c : m) {
                str += c.getOpen() + " ";
            }
            str += "\n";
        }
        return str;
    }
}
