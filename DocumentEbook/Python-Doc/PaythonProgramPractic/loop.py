###
#Loop
#we can used in dictionary
#we can used in tuples also
##

for i in range(0,5):
    print(i)

#using dictionary

shoplist=['a','b','c']
print "This for loop using Dictionary"
for i in shoplist:
    print(i)

#using tuples 
print "this is for tuples"
tup = (2,3,4)
for i in tup:
    print(i)

#range(0,101,2)
#range contain 1st one starting value ,
#2nd one is ending value +1 and 
#3rd one is between or distence or gape of the value 
print "all prime value from o to 100"
for i in range(0,8,2):
    print(i)
#if i want ending value to stating value 
print "ending to starting value"
for i in range(8,0,-2):
    print(i)



#
## While loop
#
#if condition true then execute
#keep on check the condition

print "while loop"
coutn = 5
while coutn<10:
    print(coutn)
    coutn =coutn+1

#
## Nested for loop
#
#
print "nested for loop"
for i in range(0,5):
    for a in range(0,5):
        print(a)


