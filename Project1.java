package propackage;
import javax.swing.JOptionPane;

public class Project1 {

	public static void main(String[] args) {
		
		double CGPA, tcgpa=0;
		double i, tc=0;
		int noc = Integer.parseInt(JOptionPane.showInputDialog("Enter number of courses: "));
		for(i=1; i<=noc; i++)
		{
			int Credit1 = Integer.parseInt(JOptionPane.showInputDialog("Enter credit of course " + i + ": "));
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
		
		JOptionPane.showMessageDialog(null, "Your CGPA is: " + (tcgpa/tc));
	}

	
}
