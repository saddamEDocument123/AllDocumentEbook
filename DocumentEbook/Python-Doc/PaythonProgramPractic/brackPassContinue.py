#Brack
#it is brack the loop termination

counter = 0
while counter < 1000:
    print(counter)
    counter+=1

#now brack 
#pass is when don't wont to any conde to run
#
counter = 0
while counter < 100:
    if counter == 4:
        break
    else:
        pass
    print(counter)
    counter+=1

#continue statement 
#
print "This is for continue statement"
for i in "saddam":
    if i == "d":
        continue
    print(i)

print "it is for number continue statement"
 
for i in range(0,5):
    if i<2:
         continue
    print(i)