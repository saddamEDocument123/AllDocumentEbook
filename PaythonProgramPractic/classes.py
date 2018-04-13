#user define prototype of an object the define a set of attrebute any class have
#class have set of attrebute
# 

#class className:
  #  pass
#instance = className()
# after def we are using  double underscore
#if we give single underscore then it is trite like
# general method 
#how to initialized class 
#how to set the class attribute
class Students:
    def __init__(self,name,age,grade): #this is the constructor
        self.name=name
        self.age=age
        self.grade=grade
stu1 = Students("saddam",22,"4th")
print stu1.name
print stu1.age


class Stude:
    def __init__(self,value):
        self.value=value
stu = Stude(23)
print "this is 2nd class"
print stu.value