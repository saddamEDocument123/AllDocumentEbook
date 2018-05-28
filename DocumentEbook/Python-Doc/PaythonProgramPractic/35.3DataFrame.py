# 2nd DataStructure  : Data Frame

import  pandas as pd
data = {'Student':["Aj","Mark","Bob","Rachel","Steven"], 'Maths':[98,50,23,72,87],
        'Science':[96,45,76,54,1], 'Sports':["Basketball","Swimming","TT","Badminton","Tae"]}

students =pd.DataFrame(data, columns=["Student","Maths","Science","Sports"])
print(students)