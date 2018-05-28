# Using MatPlotLib and Bar Graphs

import matplotlib.pyplot as plt
import  numpy as np

# the arrange() function basically create array
# 0.5 is the distance of each bar of the bar graph
# this arrange function used in numpy

pos = np.arange(6) + 0.5

# what type of bar graph ...vertical or horizontal
# barh() function used for horizontal bar graph

plt.barh(pos, (4,8,12,3,17,6), align = 'center', color = 'red')

# how to get help for any function using help() function
#help(plt)

plt.show()
