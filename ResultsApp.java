//Write a program that allows a user to enter 5 results for each year of a 4 year course. The app should:
//Give an average for each year
//Give a total average

import javax.swing.JOptionPane;
public class ResultsApp {
    public static void main(String[] args) {
        //variables
        int[][] results;
        results = new int[4][5];
		int[][] averageArray;
		int[] answer1;
		int answer2;
        //input
        for (int i = 0; i<4; i++) {
			for (int x = 0; x<5; x++) {
				if (x == 0) {
					results[i][x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your grades for year 1:"));
				}
				else if (x == 1) {
									results[i][x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your grades for year 2:"));
				}
				else if (x == 2) {
									results[i][x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your grades for year 3:"));
				}
				else if (x == 3) {
									results[i][x] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your grades for year 4:"));
				}
				else {continue;}
				}}

		//object
		Results r;
		r = new Results();
		//set
		r.setResults(results);
		//compute
		r.getAverage();
		//get
		answer1 = r.getAverages();
		answer2 = r.getAnswer2();
		//output
		for (int a = 0; a<4; a++){
			System.out.println("Year " + a + " avg = " + answer1[a]);
			}
			System.out.println(answer2);
		}
		}