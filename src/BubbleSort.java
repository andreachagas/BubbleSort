/**
 * Created by andrealimachagas on 26/08/2014.
 */
// This program sorts an array's values into ascending order

import java.awt.*;
import javax.swing.*;

public class BubbleSort extends JApplet {
    public void init()
    {
        JTextArea outputArea = new JTextArea();
        Container c = getContentPane();
        c.add( outputArea );

        int a[] = { 49, 2, 4, 12, 10, 8, 89, 68, 6, 37 };

        String output = "Data items in original order\n";

        for ( int i = 0; i < a.length; i++ )
            output += "   " + a[ i ];

        bubbleSort( a );

        output += "\n\nData items in ascending order\n";

        for ( int i = 0; i < a.length; i++ )
            output += "   " + a[ i ];

        outputArea.setText( output );
    }

    // sort the elements of an array with bubble sort
    public void bubbleSort( int b[] )
    {
        for ( int pass = 1; pass < b.length; pass++ ) // passes
            for ( int i = 0; i < b.length - 1; i++ ) // one pass
                if ( b[ i ] > b[ i + 1 ] )        // one comparison
                    swap( b, i, i + 1 );           // one swap
    }

    // swap two elements of an array
    public void swap( int c[], int first, int second )
    {
        int hold;  // temporary holding area for swap

        hold = c[ first ];
        c[ first ] = c[ second ];
        c[ second ] = hold;
    }
}