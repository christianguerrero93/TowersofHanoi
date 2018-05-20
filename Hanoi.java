
public class Hanoi {

	public static void solveHanoi(int n, String source, String dest, String spare){
		int numSteps = 0;
		
		if(n==1){
			numSteps++;
			System.out.println("Move disk"+ n + " from "+ source + " to "+ dest);
		}
		else{
			numSteps++;
			solveHanoi(n-1, source, spare, dest);//swap the spare with the destination for where we move to
			System.out.println("Move disk"+ n + " from "+ source + " to "+ dest);
			solveHanoi(n-1,spare, dest, source);//swap the spare with the source.. move frome spare to dest using source as spare
		}
		
	}
	
}
