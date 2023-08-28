class PrimeNumbers {
    public static void main (String[] args) {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= 1000; i++) {
            int counter=0;
            for(num =1; num<=i; num++) {
                if(i%num==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 1000 are :");
        System.out.println(primeNumbers);
    }
}
//so , we find remainder in the division in second loop and if we get a remainder of 0 only two times , i.e
//number is divisible by itself and 1 only {prime} , recorded on the counter here as 2 under if command and then
//checked outside in another if only if counter =2 then its prime, value stored in string and we print em.