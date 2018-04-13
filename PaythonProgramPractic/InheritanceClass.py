#Inheritanc

class Parent:
    count = 10
    def __init__(self):
        print("class initilized")

    def ParentFunc(self):
        print "parent funtion being called"
    def setCount(self,num):
        Parent.count = num
    def showConut(self):
        print(str(Parent.count))

class Child1:
    def __init__(self):
        print "child class bbeing initiiiii.."
    def childFunc1(self):
        print "child function bneing called"

class Child(Parent,Child1):
    def __init__(self):
        print "child class being initi.."
    def childFunc(self):
        print "childddd func being called"

c=Child()
c

c.childFunc()
c.ParentFunc()
c.count
c.setCount(20)
c.showConut() 
c.childFunc1()