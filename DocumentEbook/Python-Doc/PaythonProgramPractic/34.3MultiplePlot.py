# we can used multiple graph using plot() function
# MatPlotlib Basic Coloring and SubPlots
#


import  matplotlib
import  matplotlib.pyplot as plt
fig = plt.figure()

# change backgroound color in main graph
rect = fig.patch
rect.set_facecolor('green')

x=[0,7,8,13]
y=[5,13,2,8]

# Add 2nd graph axis
x2 = [0,4,7,13]
y2 = [3,7,1,12]
x3= [0,4,6,13]
y3 = [13,5,8,2]



# change graph color

# grape1 = fig.add_subplot(1,1,1,axisbg='blue')

#  we can used axisbg for that we have to used
#set_facecolor
graph1 = fig.add_subplot(1,1,1)  # add subplot in the main graph
graph1.set_facecolor('xkcd:black')

# change line backgroud color
graph1.plot(x,y,'red',linewidth='4.0')
graph1.plot(x2,y2,'yellow',linewidth='2.0')
graph1.plot(x3,y3,'orange',linewidth='6.0')

# used tick_param
graph1.tick_params(axis = "x",color = "white")
graph1.tick_params(axis="y",color = "red")

# add tick_params into  graph
graph1.spines["top"].set_color('white')
graph1.spines["left"].set_color('white')
graph1.spines["right"].set_color('white')
graph1.spines["bottom"].set_color('white')

# add text and title
graph1.set_title('Random Graph',color = 'white')
graph1.set_xlabel('This is the x axis',color = 'white')
graph1.set_ylabel('This is the y axis',color = 'white')

plt.show()