def sum_1_to_n(n):
    sum=0
    if n==1:
        return 1
    sum+=n
    
    return sum + sum_1_to_n(n-1)
print(sum_1_to_n(4))

def power(a,b):
    if b==0:
        return 1
    ans= a*power(a,b-1)
    return ans
print(power(2,3))
    