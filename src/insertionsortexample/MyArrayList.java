/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortexample;
import java.util.*;
/**
 *
 * @author cmuntean
 */
public class MyArrayList<ElemType> extends ArrayList<ElemType>
{
     
   int swap;
   int compare;
   int numofSwapB = 0;
   int numofCompareB = 0;
   int numofSwapI = 0;
   int numofCompareI = 0;

    public void bubbleSort()
    {
       int i,j;
       Comparable  elemAtJ,elemAtJPlus;
       for (i=0; i < size(); i++ )
       {
	  for (j=0; j < size()-1 -i ; j++ )
	  {
              elemAtJ = (Comparable)get(j);
              elemAtJPlus = (Comparable)get(j+1);
              numofCompareB = numofCompareB+1;

	      if (elemAtJ.compareTo(elemAtJPlus) > 0)
	      {
		//swap element on postion j with element on position j+1
                  swap(j, j+1);
                  numofSwapB = numofSwapB+1;
	      }
           }
          
       }
        
       
    }

     public void swap(int pos1, int pos2)
     {
         ElemType objPos1 = get(pos1);
         remove(pos1);
         add(pos2, objPos1);
    }

    public void insertionSort()
    {
        int i;
        int pos;
        ElemType keyelement;
        for (i = 1; i< size();i++)
        {
            keyelement = get(i);
            pos = i;  //position of the key element

            while (pos > 0 && ((Comparable)get(pos-1)).compareTo((Comparable)keyelement) >0)
            {
                ElemType elemPosMinusOne = get(pos-1);
                set(pos, elemPosMinusOne);
                pos = pos -1;
                numofCompareI = numofCompareI+1;
            } //end while loop

            set(pos,keyelement); //insert the key element in the correct position
            numofSwapI = numofSwapI+1;
        }
  }    

}


