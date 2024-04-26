def  palindrome(s2):
    s=(s2.replace(" ","")).lower()
    s1=s[::-1]
    if s==s1 :
        return True
    else:
        return False


s= input("Enter the string :" )
print(palindrome(s))
