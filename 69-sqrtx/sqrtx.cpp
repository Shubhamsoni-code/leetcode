class Solution {
public:
    int mySqrt(int x) {

    int i=0,j=x;
    while(i<=j){
           long long int mid=(i+j)/2 ;
            if(mid*mid == x){
                return mid ;
            }
            else if(mid*mid > x){
                j=mid-1;
            }else{
                i=mid+1;
            }
        
    }
    return j;

    }
};