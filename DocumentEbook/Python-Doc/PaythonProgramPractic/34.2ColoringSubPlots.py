# MatPlotlib Basic Coloring and SubPlots
#


import  matplotlib
import  matplotlib.pyplot as plt
fig = plt.figure()

# change backgroound color in main graph
rect = fig.patch
rect.set_facecolor('green')

x=[3,7,8,13]
y=[5,13,2,8]

# change graph color

# grape1 = fig.add_subplot(1,1,1,axisbg='blue')

#  we can used axisbg for that we have to used
#set_facecolor
graph1 = fig.add_subplot(1,1,1)  # add subplot in the main graph
graph1.set_facecolor('xkcd:black')

# change line backgroud color
graph1.plot(x,y,'red',linewidth='4.0')

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