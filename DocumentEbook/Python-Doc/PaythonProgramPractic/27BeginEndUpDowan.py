#using Turtle model 

import turtle
t = turtle.Pen()

t.left(180)
t.forward(100)
t.right(180)
for i in range(1,20):
    t.forward(100)
    t.left(95)
# the pen will be up from GUI
t.up()
t.forward(100)
t.forward(40)
#the pen will be down and drowing to GUI
t.down()
for i in range(1,20):
    t.forward(100)
    t.left(95)

t.up()
t.right(90)
t.forward(100)
t.down()
for i in range(1,20):
    t.forward(100)
    t.left(95)
