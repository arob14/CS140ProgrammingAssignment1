class roberts_p1
{
	// constructor for the class
	public roberts_p1()
	{	
	}
	
	// method to sort an array of String values using selection sort
	// sorting the array element starting at lowerBound and ending at upperBound
	public String[] selectionSort(String[] values, int lowerBound, int upperBound)
	{
		for (int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values.length; j++){
				if (values[i].compareTo(values[j]) <0) {
					String temp = values[i];
					values[i] = values [j];
					values[j] = temp;
				}
			}
		}
		return values;
	}
	
	// method to return the number of array elements <= testValue with indices in [lowerBound, upperBound]
	// using a for loop to examine the array elements
	public int forLoopTest(int lowerBound, int upperBound, int testValue, int[] values)
	{
		int count = 0;
		for ( int i = lowerBound; i < upperBound; i++) {
			if (values[i] <= testValue) {
				count++;
			}
		}
		return count;
	}
	
	// method to return the number of array elements >= testValue with indices in [lowerBound, upperBound]
	// using a while loop to examine the array elements
	public int whileLoopTest(int lowerBound, int upperBound, int testValue, int[] values)
	{
		int count = 0;
		int i = lowerBound;
		while (i < upperBound) {
			if ( values[i] >= testValue) {
				count++;
			}
		}
		return count;
	}
	
	// method to return the number of array elements in [testValue1, testValue2] or [testValue2, testValue1] with 
	// indices in [lowerBound, upperBound] using a do-while loop to examine the array elements
	public int doWhileLoopTest(int lowerBound, int upperBound, int testValue1, int testValue2, int[] values)
	{
		int i = lowerBound;
		int count = 0;
		do {
			if (testValue1 == testValue2) {
				if (values[i] == testValue1) {
					count++;
				}
			}
			if ( testValue1 < testValue2) {
				if (values[i] >= testValue1 && values[i] <= testValue2) {
					count++;
				}
			}
			if ( testValue1 > testValue2) {
				if (values[i] <= testValue1 && values[i] >= testValue2) {
					count++;
				}
			}
			i++;
		}
		while (i < upperBound);

		return count;
	}
	
	// method to return the number of array elements that match the switch cases [0, 2, 4, 6, 8, 10, 12, 14, 16, 18] and the default case with 
	// indices in [lowerBound, upperBound]
	public int[] switchTest(int lowerBound, int upperBound, int[] values)
	{
		int[] count = new int[11];
		for (int i = lowerBound; i < upperBound; i++){
			switch(values[i]) {
				case 0:
					count[0]++;
					break;
				case 2:
					count[1]++;
					break;
				case 4:
					count[2]++;
					break;
				case 6:
					count[3]++;
					break;
				case 8:
					count[4]++;
					break;
				case 10:
					count[5]++;
					break;
				case 12:
					count[6]++;
					break;
				case 14:
					count[7]++;
					break;
				case 16:
					count[8]++;
					break;
				case 18:
					count[9]++;
					break;
				default:
					count[10]++;
			}
		}
		return count;
	}
}
