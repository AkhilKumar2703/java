#204. Count Primes
------------------------------------
class Solution {
    public int countPrimes(int n) {
       return soe(n);

    }
    static int soe(int n ){
        //false in array means number is prime
         boolean[] prime = new boolean[n+1];
        for(int i = 2; i*i<n;i++){
            if(!prime[i]){
                for(int j =i*2;j<n;j+=i ){
                    prime[j]=true;
                }
            }
        }
        int count =0;
        for(int i=2;i<n;i++){
            if(!prime[i]){
                count++;
            }
        }
        return count;
    }
}