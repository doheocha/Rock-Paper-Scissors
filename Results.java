public class Results {
	//variables
	private int[][] results;
	private int[][] averageArray = new int[4][5];
	private int [] answer1 = new int[5];
	private int answer2;
	//set
	public void setResults(int[][] results) {
		this.results = results;
		}
	//compute
	public void getAverage() {
		for (int y = 0; y<4; y++) {
				for (int z = 0; z<5; z++) {
					averageArray[y][z] = (results[y][z])/4;
					answer1[y] += averageArray[y];
				}
			}
		for (int b = 0; b<5; b++) {
			answer2 += (answer1[b]/5);
			}
		}
	//get
	public int[] getAverages() {
		return answer1;
	}
	public int getAnswer2() {
		return answer2;
	}

}