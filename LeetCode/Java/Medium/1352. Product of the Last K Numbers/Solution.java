class ProductOfNumbers {
  ArrayList<Integer> ans=new ArrayList<>();
    public ProductOfNumbers() { }
    
    public void add(int num) {
        ans.add(num);
    }
    
    public int getProduct(int k) {
        int prod=1;
        int n=ans.size(),m=n-k;
        while(m<n){
            prod*=ans.get(m);
            m++;
        }
        return prod;

    }
 
}

