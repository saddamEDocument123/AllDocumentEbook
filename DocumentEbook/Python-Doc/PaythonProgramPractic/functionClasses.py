#Functions in classes
class Students:
    def __init__(self,name,age):
        self.name=name
        self.age = age
    def displayStudents(self):
        return ("Student name is " +self.name + " and age is "+ str(self.age))
stu=Students("sadd",34)
print stu.displayStudents()

##Class Attributes
# 4 function 
#hasattr  return true or false vale for attribute exist or not
# how to add my attribute explecitly
# that time we used setattr

print "this is class Attributes"
class Students:
    def __init__(self,name,age):
        self.name=name
        self.age = age
stud =Students("ss",17)
stud2 = Students("rr",22)
print hasattr(stud,"name")
print hasattr(stud,"grade")
#set any attribute used setattr function
print "using set attribute"
setattr(stud,'grade','5th')
print hasattr(stud,"grade")
#get any attribute used getattr function
print "using get attribute"
print getattr(stud,'grade')
print getattr(stud2,'age')

#delete attribute
print 'delete the attribute'
delattr(stud,'grade')

print "grade attribute is ther or not"
print hasattr(stud,'grade')