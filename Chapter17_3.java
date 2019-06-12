/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                         Chapter 17: Problem 3                                            *****
 *****__________________________________________________________________________________________________________*****
 *****                      3. Repeat #2 but input each item in the file as an int value.                       *****
 *****                          You will get what looks like a random list of numbers:                          *****
 *****    25993864881646619168458762368157763211314334238820972576946923707793420971845046350517742420971892    *****
 *****                0972335374035550505629491527667830779890479298883473462360453637355845898288              *****
 *****__________________________________________________________________________________________________________*****
 *****                                Instructions for Chapter 17, Problem #2                                   *****
 *****----------------------------------------------------------------------------------------------------------*****
 *****       2. Write a program that will input from the disk file ch17_ex.dat each byte (1 byte at a time)     *****
 *****         as a character and output each character using System.out.print.  Test it out on the file.       *****
 *****               NOTE:  to detect eof of file, use an infinite while loop to input the file and             *****
 *****          have a catch with the exception EOFException.  You will also need a catch for IOException.      *****
 *****         HINT:  consider solving this problem using two nested try blocks.  Data file:  ch17_ex2.dat      *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;


public class Chapter17_3 {


    public static void main(String[] args) {

        // LOCAL VARIABLE(s) declaration(s)
        int temp;			// used to store each char value upon inputting it
        try {						// try to open the file
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("ch17_ex2.dat"));
            try {					// with the file open, try to input the next char
                while(true) {
                    temp = dataInputStream.readInt();		// get the char
                    System.out.print(temp);		// output it to the console
                }
            }
            catch(EOFException e) 	// reach here once we have hit the end of file
            {
                System.out.println("\n\nReached end of file");
            }
            dataInputStream.close();			// close the file
        }
        catch(IOException e) {		// reach here if we have an IO error
            System.out.println(e);
        }
    }
}
