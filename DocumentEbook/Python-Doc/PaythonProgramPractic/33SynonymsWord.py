from bs4 import *
import requests
inputWord = input("Enter the Word : ")
url = "http://www.synonym.com/synonyms/"+inputWord
headers={'user-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36'}
data=requests.get(url,headers=headers)
#print(data)
soup=BeautifulSoup(data.text,"html.parser")
data1 = soup.find('meta',{'property':'og:description'})
print(data1)
data2 = data1.find('meta',{'content':'synonyms'})
print(data2)