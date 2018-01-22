// TODO Package?

public class World {

    public int[][] grid;

    public int[][] createCurrentGrid(String currentStringGrid) {

        String[] gridRows = currentStringGrid.split(",");

        int row = 0;
        for(String currentRow :gridRows){
            for(int position=0; position<currentRow.length(); position++){
                grid[row][position] = (int) currentRow.charAt(position);
            }
            row++;
        }
        return grid;
    }

// "0000010000" -> [0,0,0,1,0,0,0,0,0]

// Grid's current
//   { [0,0,0,0],[0,0,1,0],[0,0,0,0],[0,0,0,0,]}

// grids next state
//   { [0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0,]}

}
