package org.sample;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][][] data = new String[5][6][2];

        // Semester 1
        data[0][0][0] = "Mathematics I";       data[0][0][1] = "Pass(78)";
        data[0][1][0] = "Physics";             data[0][1][1] = "Pass(85)";
        data[0][2][0] = "Chemistry";           data[0][2][1] = "Fail(21)";
        data[0][3][0] = "Computer Programming";data[0][3][1] = "Pass(74)";
        data[0][4][0] = "Engineering Drawing"; data[0][4][1] = "Pass(88)";
        data[0][5][0] = "Basic Electrical Eng.";data[0][5][1] = "Pass(79)";

        // Semester 2
        data[1][0][0] = "Mathematics II";      data[1][0][1] = "Pass(82)";
        data[1][1][0] = "Mechanics";           data[1][1][1] = "Pass(77)";
        data[1][2][0] = "Environmental Sci.";  data[1][2][1] = "Pass(93)";
        data[1][3][0] = "Basic Electronics";   data[1][3][1] = "Fail(19)";
        data[1][4][0] = "Engineering Physics"; data[1][4][1] = "Fail(24)";
        data[1][5][0] = "Engineering Graphics";data[1][5][1] = "Pass(90)";

        // Semester 3
        data[2][0][0] = "Data Structures";     data[2][0][1] = "Pass(88)";
        data[2][1][0] = "Discrete Mathematics";data[2][1][1] = "Pass(81)";
        data[2][2][0] = "Digital Electronics"; data[2][2][1] = "Pass(76)";
        data[2][3][0] = "Operating Systems";   data[2][3][1] = "Fail(32)";
        data[2][4][0] = "Signals and Systems"; data[2][4][1] = "Pass(85)";
        data[2][5][0] = "Object-Oriented Prog.";data[2][5][1] = "Pass(78)";

        // Semester 4
        data[3][0][0] = "Algorithms";          data[3][0][1] = "Pass(91)";
        data[3][1][0] = "Computer Networks";   data[3][1][1] = "Pass(73)";
        data[3][2][0] = "Database Systems";    data[3][2][1] = "Fail(19)";
        data[3][3][0] = "Microprocessors";     data[3][3][1] = "Pass(80)";
        data[3][4][0] = "Communication Eng.";  data[3][4][1] = "Pass(76)";
        data[3][5][0] = "Software Engineering";data[3][5][1] = "Pass(87)";

        // Semester 5
        data[4][0][0] = "Probability & Stats"; data[4][0][1] = "Pass(86)";
        data[4][1][0] = "Machine Learning";    data[4][1][1] = "Pass(88)";
        data[4][2][0] = "Compiler Design";     data[4][2][1] = "Pass(84)";
        data[4][3][0] = "Theory of Computation";data[4][3][1] = "Pass(95)";
        data[4][4][0] = "Embedded Systems";    data[4][4][1] = "Pass(73)";
        data[4][5][0] = "Computer Graphics";   data[4][5][1] = "Pass(90)";

        // Requirement 1: Print Semester 2 Subject 4 and Subject 5 names
        System.out.println("Semester 2 Subject 4: " + data[1][3][0]);
        System.out.println("Semester 2 Subject 5: " + data[1][4][0]);

        // Requirement 2: Print Status/Marks of Semester 4 Subject 3 and Subject 6
        System.out.println("Semester 4 Subject 3 Marks: " + data[3][2][1]);
        System.out.println("Semester 4 Subject 6 Marks: " + data[3][5][1]);

        // Print size of the array
        System.out.println("Total semesters: " + data.length);
        System.out.println("Subjects per semester: " + data[0].length);
        System.out.println("Values per subject: " + data[0][0].length);
        System.out.println("Total elements: " + (data.length * data[0].length * data[0][0].length));
	}

}
