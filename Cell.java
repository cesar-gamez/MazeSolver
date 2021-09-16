class Cell
{
    private String open;
    private int row;
    private int col;
    public Cell(int r, int c, String o) {
        row = r;
        col = c;
        open = o;
    }
    public void setOpen(String o) {
        open = o;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public String getOpen() {
        return open;
    }
    public String toString() {
        return "(" + row + ", " + col + ")";
    }
}

