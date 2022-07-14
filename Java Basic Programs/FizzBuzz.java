class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for(int i=1;i<n+1;i++){

            boolean divby3 = (i%3==0);
            boolean divby5 = (i%5==0);

        if(divby3 && divby5){

            ans.add("FizzBuzz");

        } else if (divby3) {

            ans.add("Fizz");

        } else if (divby5){

            ans.add("Buzz");

        } else {

            ans.add(Integer.toString(i));
        }

        }
        return ans;
    }
}
