#usign python
#range of the input
ip = int(input("Enter the range of the array : "))
#declare the array
inputArray = []
for i in range(0,ip):
    #take the array value from user
    inputValue = int(input())
    #insert into array
    inputArray.append(inputValue)
#now we have to get sorting array
for i in range(0,ip):
    for j in range(1,(len(inputArray)-1)):
        if inputArray[j-1] > inputArray[j]:
            temp = inputArray[j-1]
            inputArray[j - 1] = inputArray[j]
            inputArray[j] = temp
print("The Bubble sort result is :")
for i in range(0,ip):
    print(inputArray[i])