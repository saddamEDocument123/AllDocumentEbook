# how to modify the  Bar graph
# Using MatPlotLib and Bar Graphs
# how to change bar option , bar name automatically

import matplotlib.pyplot as plt
import  numpy as np

# the arrange() function basically create array
# 0.5 is the distance of each bar of the bar graph
# this arrange function used in numpy

pos = np.arange(6) + 0.5

# what type of bar graph ...vertical or horizontal
# barh() function used for horizontal bar graph

plt.barh(pos, (4,8,12,3,17,6), align = 'center', color = 'red')

# define 6 array for the name of bar
names = ['saddam','saddam1','saddam2','saddam3','saddam4','saddam5']

# Now we have to add some label into bar graph using xlabel() and ylabel() function

plt.xlabel('Height in Inches',color='red')
plt.ylabel('Students',color='red')
plt.title('Height of Student in Inches',color='blue')

# tick_params used for tick the bar  for different color in x and y axis
plt.tick_params(axis='x',colors='green')
plt.tick_params(axis='y',colors='black')

# now we have each bar have different name that function calld yticks
# yticks() take two parameter position and name of the bar
# now we are using 6 bar so we have to give 6 bar name o

plt.yticks(pos,names)

# how to set graph how we want to be using programmetically
# and we can set left , bottom in out graph using subplot_adjust() function

plt.subplots_adjust(left =.11,bottom=.12,right=.94)

# how to get help for any function using help() function
#help(plt)

plt.show()