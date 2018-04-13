#using turtle and for loop we can make anything 

import turtle
t = turtle.Pen()
for i in range(0,8):
    t.forward(50)
    t.left(45)
t.reset()  #reste the t 

for i in range(1,38):
    t.forward(100)
    t.left(175)
t.reset()

for i in range(1,25):
    t.forward(100)
    t.left(95)
t.right(90)
t.forward(100)
for i in range(1,20):
    t.forward(100)
    t.left(95)

t.reset()
t.left(180)
t.forward(100)
t.right(180)
for i in range(1,20):
    t.forward(100)
    t.left(95)

t.up()
t.forward(100)
t.forward(40)
for i in range(1,20):
    t.forward(100)
    t.left(95)