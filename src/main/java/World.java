// TODO Package?


public class World {

    public int[][] grid;

    public int[][] createCurrentGrid(String currentStringGrid) {

        String[] gridRows = currentStringGrid.split(",");
        grid = new int[gridRows.length][gridRows[0].length()];
        int row = 0;
        for(String currentRow :gridRows){
            for(int position=0; position<currentRow.length(); position++){
                char x =  currentRow.charAt(position);
                int a = Character.getNumericValue(x);
                grid[row][position] = a;
            }
            row++;
        }
        return grid;
    }

    public int[][] changeGridState(int[][] currentGrid){


        for(int r=0; r<11; r++) {
            for (int p = 0; p < 15; p++) {

                int living = 0;

                living = grid[r-1][p-1] + grid[r-1][p] + grid[r-1][p+1]+
                        grid[r][p-1] +                    grid[r][p+1] +
                        grid[r+1][p-1] + grid[r+1][p] + grid[r+1][p+1] ;

                if(grid[r][p] == 0 && living == 3){
                        grid[r][p] = 1;
                }else {
                    if(living < 2 || living > 3){
                        grid[r][p] = 0;
                    }
                }

            }
        }


        return grid;
    }


// TODO Grid's current
//   { [0,0,0,0],[0,0,1,0],[0,0,0,0],[0,0,0,0,]}

// TODO grids next state
//   { [0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0,]}

}
