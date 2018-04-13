age = 10
age1 = 34
print age+age1

random = "varl,ww,rr,tt"
print random

random = "saddam jjaheio jljfo"
print random[3]
print random[2:5]
print random[3:]

shopingList = ["dd","rr","3","4"]
print shopingList

print shopingList[3]

shopingList[2] = "saddam"

print shopingList

del shopingList[1]
print shopingList

array1 = [23,54,64]
array2 = [43,23]
array3 = array1+array2;
print array3

print len(array3)

numArray = [32,45,500,-9,54]
print max(numArray)

print min(numArray)

shopingList.append("saddam2")
print shopingList

shopingList.append("saddam2")
print shopingList

print shopingList.count("dd")
print shopingList.count("saddam2")

student = ["sadda",12,"tarun",32,"newlo",22]

students ={'saddam':12,'tarun':32,'newlo':22}
print students['tarun']

students['tarun']=33
print students

del students['tarun']
print students

students.clear()
print students

print students

#create dictonary 
students1 ={'saddam':12,'tarun':32,'newlo':22}
print students1

#get only key vaue 
print students1.keys()

#get only values from dictionary 
print students1.values()

print students1

student2 = {'saddam2':23,'tarun2':24}
print student2

#update dictionary using student1 and student2 dictionary
#using update() function
students1.update(student2)
print "Updated dictionary {} ".format(students1)


#tuples datatype
#tuples is a immutable 
#it can not change
#i create tuples , delte tuples
#there is no append function
#ther is no item deletion or delete or del fuction
#only we can add

tup1 =('maths',23,'dogs') #we can create like this tuples

print "this is my 1st Tuples {}".format(tup1)

tup1= ('saddam')
print "2nd tuples {}".format(tup1)

#indexing is ther in tuples

tup1 =(12,34,56)
print "indexing value {}" .format(tup1[1])

#tup1 =(12,34,56)
#slice concept also we can used in tuples like
print "slice concept {}" .format(tup1[0:2]) 
print tup1[1:]
print "before deleting {}" .format(tup1)
#Delete function using we can delete full tuples 

#del tup1
print "delete tuples {}" .format(tup1) 

