package Number;


//seive of Erast
public class PrimeNumber {
	public static int countPrimes(int n){
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for (int i=2; i<n; i++){
			if (notPrime[i] == false){
				count++;
				for(int j = 2; i*j<n; j++){
					notPrime[i*j] = true;
				}
			}
		}
		for (int i=2; i<n; i++){
			if (notPrime[i] == false){
				System.out.println(i + " ");
			}
		}
		return count;s
		
		
	}
	
	
	public static void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
	
	public static void main(String[] args) {
		System.out.println(countPrimes(15));
		sieveOfEratosthenes(30);
	}

}
