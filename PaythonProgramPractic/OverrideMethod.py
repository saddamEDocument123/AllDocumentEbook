#override mehtod 
class Parent:
    def func(self):
        print "this is Parent class method"

class Child(Parent):
    def func(self):
        print "this is Child class method"
c=Child()
c.func()