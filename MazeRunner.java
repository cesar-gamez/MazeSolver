import java.util.Stack;
public class MazeRunner
{
    public static void main(String[] args) {
        //Maze 1
        System.out.println("Maze 1:" + "\n");
        Maze mOne = new Maze("U:\\CS3\\basicMaze (1).dat");
        System.out.print(mOne + "\n");
        Stack<Cell> cellStackOne = new Stack<Cell>();
        System.out.print(Solver.solve(mOne.getMaze(), 0, 0, cellStackOne) + "\n" + "\n");
        System.out.println(mOne);
        
        //Maze 2
        System.out.println("Maze 2:" + "\n");
        Maze mTwo = new Maze("U:\\CS3\\maze3.dat");
        System.out.print(mTwo + "\n");
        Stack<Cell> cellStackTwo = new Stack<Cell>();
        System.out.print(Solver.solve(mTwo.getMaze(), 0, 0, cellStackTwo) + "\n" + "\n");
        System.out.println(mTwo);
       
        //Maze 3
        System.out.println("Maze 3:" + "\n");
        Maze mThree = new Maze("U:\\CS3\\bigmaze5.dat");
        System.out.print(mThree + "\n");
        Stack<Cell> cellStackThree = new Stack<Cell>();
        System.out.print(Solver.solve(mThree.getMaze(), 0, 0, cellStackThree) + "\n" + "\n");
        System.out.println(mThree);
    }
}

