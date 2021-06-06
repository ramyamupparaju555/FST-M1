
#numList = [10, 20, 30, 40, 10]

numbers = list(input("Enter a sequence of comma separated values: ").split(", "))
print("Given list is ", numbers)

firstElement = numbers[0]
lastElement = numbers[-1]

if (firstElement == lastElement):
    print(True)
else:
    print(False)