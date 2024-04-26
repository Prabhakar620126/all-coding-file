# write a  python program  to check either the given string is palindrome or not 

def is_palindrome(s):
    i=0
    j=len(s)
    while(i<j):
        if(s[i]==s[j-1]):
            i=i+1
            j=j-1
        else:
            return False
    return True
            
        


a=input("Enter a string to check palindrome: ")
x=is_palindrome(a)
print(x)