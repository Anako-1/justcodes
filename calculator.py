#
def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):

    if y != 0:
        return x / y
    else:
        return "Error: Cannot divide by zero"
        
def modulo(x , y):
    return x % y
    

print("Select an operation:")
print("\n1. Addition")
print("\n2. Subtraction")
print("\n3. Multiplication")
print("\n4. Division")
print("\n5. Modulo")

choice = input("\nEnter your choice (1/2/3/4/5): ")

num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

if choice == '1':
    print(num1, "+", num2, "=", add(num1, num2))
elif choice == '2':
    print(num1, "-", num2, "=", subtract(num1, num2))
elif choice == '3':
    print(num1, "*", num2, "=", multiply(num1, num2))
elif choice == '4':
    print(num1, "/", num2, "=", divide(num1, num2))
elif choice == '5':
    print(num1, "%",num2, "=", modulo(num1, num2))
else:
    print("Invalid input")
