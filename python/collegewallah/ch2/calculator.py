num1=int(input("number 1: "))


print(" 1.-> Add\n 2.-> sub\n 3.-> Multiple \n 4.-> division \n 5.-> modulus \n 6.-> exponent  \n 7.-> floor   ")

number= (input("Enter operation number: "))
num2 = int(input("number 2:"))
match number:
    case "1": print(" Addition is: ", num1 + num2 )

    case "2": print(" subtraction is: ", num1 - num2 )

    case "3": print(" multiplcation is: ", num1 * num2 )

    case "4": print(" division is: ", num1 / num2 )

    case "5": print(" modulus is: ", num1 % num2 )

    case "6": print(" exponent is: ", num1 ** num2 )

    case "7": print(" floor value is: ", num1 // num2 )
    case _ :
        print("Enter valid operation")

    