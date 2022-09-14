package propackage;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Project1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		double CGPA, tcgpa=0;
		//String Grade;
		double Credit, i, tc=0;
		//System.out.print("Enter the nnumber of courses: ");
		//noc = sc.nextInt();
		int noc = Integer.parseInt(JOptionPane.showInputDialog("Enter number of courses: "));
		for(i=1; i<=noc; i++)
		{
			//System.out.print("Enter credit of course " + i + ": ");
			//Credit = sc.nextDouble();
			int Credit1 = Integer.parseInt(JOptionPane.showInputDialog("Enter credit of course " + i + ": "));
			//System.out.print("Enter Grade of course " + i + ": ");
			//Grade = sc2.next();
			String Grade = JOptionPane.showInputDialog("Enter Grade of course " + i + ": ");
			
		    switch(Grade)
			{
			case "A":
				CGPA = 4;
			break;
			case "A-":
				CGPA = 3.7;
			break;
			case "B+":
				CGPA = 3.3;
			break;
			case "B":
				CGPA = 3;
			break;
			case "B-":
				CGPA = 2.7;
			break;
			case "C+":
				CGPA = 2.3;
			break;
			case "C":
				CGPA = 2;
			break;
			case "C-":
				CGPA = 1.7;
			break;
			case "D+":
				CGPA = 1.3;
			break;
			case "D":
				CGPA = 1;
			break;
			default :
				CGPA = 0;
			break;
			
			}
		    tc+=Credit1;
		    tcgpa+=(CGPA*Credit1);
		}
		
		//System.out.println("Your CGPA is: " + (tcgpa/tc));
		JOptionPane.showMessageDialog(null, "Your CGPA is: " + (tcgpa/tc));
	}

	
}
