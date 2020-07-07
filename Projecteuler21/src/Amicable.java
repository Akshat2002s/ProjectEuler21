public class Amicable {


	public static void main(String[] args) {
		int sum= 0;
		int arr[] = new int[10000];
		for(int i = 1; i< 10000;i++)
			arr[i] = i;
		for(int i = 1; i< 10000; i++){
			if(arr[i]==0)
		    continue;
			int a = d(i);
			int b = d(a);
			if((i!=a)&&(i== b)) {
				arr[a] = 0;
				arr[b] = 0;
				sum+=(a+b);
		}
	}
		System.out.println(sum);
}
		static int d(int a){
		int sum = 0;
		for(int i = 1; i <a; i++) {
			if(a%i==0) {
				sum += i;
			}
		}

		return sum;
		}
}

