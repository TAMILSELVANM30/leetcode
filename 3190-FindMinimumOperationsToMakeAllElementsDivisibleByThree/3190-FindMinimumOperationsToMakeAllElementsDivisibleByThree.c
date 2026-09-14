// Last updated: 9/14/2026, 11:54:52 PM
int minimumOperations(int* num, int n) {
    int c=0;
    for(int i=0;i<n;i++)
    {
        if(num[i]%3!=0)
        c=c+1;
    }
    return c;
}