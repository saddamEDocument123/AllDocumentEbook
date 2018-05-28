# 3D Graphics
# add one more axis x , y, z

from mpl_toolkits.mplot3d import axes3d
import  matplotlib.pyplot as plt

# Createing figure just like mutilple graph
fig = plt.figure()

# ax for axis and we can used chart
# It is define 1 by 1 dimention chart no 1
# and projection telling us hey matplotib it is 3d

chart = fig.add_subplot(1,1,1,projection='3d')

# the number of point used in x the u must be used same number of point in y, z

X,Y,Z = [1,2,3,4,5,6,7,8],[2,5,3,8,9,5,6,1],[3,6,2,7,5,4,5,6]

# now we will be plot
#chart.plot(X,Y,Z)
#chart.plot_wireframe(X,Y,Z)

# scatter plot ..bunch of dot representing value
chart.scatter(X,Y,Z,c='red',marker='o')

# set x leabel and y
chart.set_xlabel('x axis')
chart.set_ylabel('y axis')
chart.set_zlabel('z axis')
plt.show()