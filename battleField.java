public class battleField
{
  private int pb = 4;
  private int dt = 3;
  private int bs = 2;
  private int cr = 1;
  private boolean[][] field;
  
  public battleField() 
  {
    field = new boolean[10][10];
  }

  private boolean detect(int a, int b)
  {
    return(detect(a, b, a, b));
  }

  private boolean detect(int a, int b, int x, int y) //(a,b) is the point from detection, (x,y) is an already known adjacent point
  {
    for(int i = a-1; i<1; i++)
    {
      for(int j = b-1; j<1;j++)
      {
        if((a==i && b==j)||(x==i && y==j))
        {
          try
          {
            if(field[a+i][b+j])
            {
              return true;
            }
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
            System.out.println("on edge");
          }
        }
      }
    }
    return false;
  }
/*    this(10);
  }
  public BattleField(int size)
  {
    this(size, size);
  }
  public BattleField(int rows, int cols)
  {
    if(rows*cols>100)
    {
      field = new boolean[rows][cols];
    }
    else
    {
      this();
    }
  }
*/
  /*
  @method places a patrol boat on the array.
  Precondition: row and col must be array[row].size - 2
  Or if dir = vertical, array[col].size - 2
  Postcondition: returns true if placement was successful,
  else returns false
  */
  /*
  public boolean placePatrolBoat(int row, int col, String dir)
  {

    if()
    for(int i = -1; i<2&& (i+row)>; i++)
    {
      for(int j= -1; j<2; j++)
      {
        if(field[i][j])
        {
          return false;
        }
      }
    }
    field[row][col] = true;
    
    return true;

  }
  /*checks for surrounding ships*/
  /*
  public boolean inArray(int row, int col, String dir, int shipLength)
  {
    if(dir.toLowerCase().equals("v")||dir.toLowerCase().equals("vertical"))
    {
      if(row + shipLength>)
    }
    for(int i = -1; i<2&& (i+row)>; i++)
    {
      for(int j= -1; j<2; j++)
      {
        if(field[i][j])
        {
          return false;
        }
      }
    }
  }
  */
  public void displayBoard() 
  {
    for (boolean[] row : field) {
      for (boolean col : row) {
        if(col) {
          System.out.print("X ");
        }
        else{
          System.out.print("_ ");
        }
      }
      System.out.println("");  
    }
  }

  public String toString()
  {
    return "" ;
  }




}
