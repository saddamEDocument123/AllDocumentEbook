# it is basically circle , inside the circle cut off into different picess
# and pice is the part of the hol and hol is consider 100%
# 1St modification is color
# 2nd adding legend

import  matplotlib.pyplot as plt

# we have to create list of sizes
# the sizes is the size of piecharts
# and the list totle indicate the 100
sizes = [50,23,15,7,5]
labels =['Android','Apple','Windows','Blackberry','Xiaomi']

# create color array
colors = ['yellow','orange','cyan','Magenta','red']

# add color into the pychart for change the color of every part of the pychars
# how to change the angle of the pycharts means when evey part of the pychart will be stated it will be startd in 90 degree
# using startangle funtion
plt.pie(sizes, colors=colors, startangle=90,labels=labels)
plt.title('Pie Chart')

# call legend() function two add legend into pichart
# Add location for that legend
plt.legend(title='Legend', loc = 'lower left')



# modify the axis ... means x and y axics both are equal
plt.axis('equal')

plt.show()