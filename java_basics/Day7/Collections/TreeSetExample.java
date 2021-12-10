package Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Pair
{
    int x;
    int y;
    Pair(int p, int q)
    {
        this.x = p;
        this.y = q;
    }
}

public class TreeSetExample
{
    private HashMap<Pair, HashSet<Pair>>adjMatrix;

    public char getChar(char A[][], Pair p)
    {
        return A[p.x][p.y];
    }

    public boolean contains(Pair pair, HashSet<Pair> visited)
    {
        for(Pair p:visited)
        {
            if(p.x==pair.x && p.y==pair.y)return true;
        }
        return false;
    }

    public TreeSet<String> solve(char A[][], Pair pair, HashSet<Pair> visited)
    {
        TreeSet<String> soln = new TreeSet<String>();
        HashSet<Pair> neighbours = getNeighbours(pair);
        for(Pair p: neighbours)
        {
            if(contains(p, visited)==false)
            {
                HashSet<Pair> visited2 = new HashSet<Pair>();
                copy(visited2, visited);
                visited2.add(pair);


                TreeSet<String> adjWords = solve(A, p, visited2);

                for(String adjWord: adjWords)
                {
                    soln.add(getChar(A, pair)+adjWord);
                }
            }
            else
            {
            }
        }
        soln.add("");
        soln.add(Character.toString(getChar(A, pair)));
        return soln;
    }

    private void copy(HashSet<Pair> visited2, HashSet<Pair> visited)
    {

        for(Pair p:visited)
            visited2.add(p);
    }

    public static void main(String args[])
    {
        char A[][] = {
                {'M','G','I','K'},
                {'A','T','T','O'},
                {'B','C','E','S'},
                {'N','U','C','P'}
        };
        TreeSetExample treeSetExample = new TreeSetExample();
        treeSetExample.buildAdjMatrix(A);
        TreeSet<String>temp = treeSetExample.solve(A, new Pair(0,0), new HashSet<Pair>() );
        for(String t : temp)
        {
            System.out.println(t);
        }
    }

    public HashSet<Pair> getNeighbours(Pair p)
    {

        Set<Pair> keys = adjMatrix.keySet();
        for(Pair key:keys)
        {
            if(key.x==p.x && key.y==p.y)
                return adjMatrix.get(key);
        }
        return null;
    }

    public void buildAdjMatrix(char A[][])
    {
        adjMatrix = new HashMap<Pair, HashSet<Pair>>();
        for(int i=0;i<A.length;i++)
        {
            for(int j=0; j<A[0].length;j++)
            {
                Pair p = new Pair(i, j);
                HashSet<Pair> toAdd = new HashSet<Pair>();
                HashSet<Pair>possible = new HashSet<Pair>();
                possible.add(new Pair(i+1,j+1));
                possible.add(new Pair(i+1,j));
                possible.add(new Pair(i,j+1));
                possible.add(new Pair(i-1,j));
                possible.add(new Pair(i,j-1));
                possible.add(new Pair(i-1,j-1));
                possible.add(new Pair(i+1,j-1));
                possible.add(new Pair(i-1,j+1));

                for(Pair pair: possible)
                {
                    if(pair.x>=0 && pair.x<A.length)
                        if(pair.y>=0 && pair.y<A[0].length)
                            toAdd.add(pair);
                }
                adjMatrix.put(p, toAdd);

            }
        }
    }
}