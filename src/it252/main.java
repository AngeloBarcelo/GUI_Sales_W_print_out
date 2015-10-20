/*
 *This program is a total sales record keeper. It takes the entered info and 
 *writes a file with the entered info. It has two main frames: frame 1 "RepInfo"
 *is all the reps info. Frame 2 "SalesInfo" is all the sales totals info. The 3rd 
 *frame "DisplayText" is ment only to display information to the user...Might 
 *delete it later. 
 *
 *If you see "Added for Ui experiance ++" == Means this feature or code was only 
 *added to make the user experiance better. It is not part or functionality of 
 *the program or requirments unless other wise stated.
 */
package it252;

/**
 *
 * @author Angelo 
 * angelobarcelo@hotmail.com
 */
public class main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        RepInfo hello = new RepInfo();
        
        hello.setVisible(true);
    }
    
}
