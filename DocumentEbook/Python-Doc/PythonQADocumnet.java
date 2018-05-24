



/*
Crawling The Web - Stocks 
 */ 
1. How to used Crawling 
=>
   import re
   import urllib.request
   //https://www.google.co.in/search?q=fb
   url = 'https://www.google.co.in/search?q='
   stock = Input('Enter your stock')
   url = url + stock //concatenation of string 
   print(url)
   data = urllib.request.urlopen(url).read()
   //decode the data
   data1 = data.decode("utf-8") //decoding the data and its convert bit and bytes
   print(data1)
   //now we used to search function 

   m = re.search("meta itemprop='price'",data1)
   print(m) //now we know where the data is
   start = m.start()
   end = start + 50
   newString = data1[start:end]
   print(newString)
   m=re.search('content="',newString)
   start = m.end()
   newString1 = newString[start:]
   m = re.search('/',newString1)
   start =0
   end = m.end()-3 
   final = newString1[0:end]
   print(final)



   /*
    Crawling The Web - Whether program
    */

    import re
    import urllib.request
/*
Crawlling the web - Defenation
 */

 import re
 improt urllib.request

 //http://www.dictionary.com/browse/stock?s=t

 /*
  Beautiful Soup:
32. Installing Pip, BS4 and Request
  */
 * u have to install beautifulsoup 
 * and request also install

32. what is the pip ?
  =>
    its allows us to install python packges and python 
    module.

33. How to check pip?
=>
    goto ur macStorage -> library -> framwork -> python.framework -> versions -> 3.4 -> lib -
    >  python3.4 -> site-packges -> pip 
        
            OR   

    $ pip3.6

33. how to install beautiful Soup
=>
    sudo pip3.6 install beautifulsoup4

34. How to instll request ?
=>
    sudo pip3.6 install request 

/*
Beautiful Soup : Prettify! 
 */

 
35.  what Prettify does ?
=>
    * pass any html code of errore so it will be resove the code like :

    from bs4 import BeautifulSoup
    soup = BeautifulSoup("<html><p>adddfaf<strong>Hello <a>hello</html>") //cannto close all tage

    * now u have called the Prettify then c - 

    soup = BeautifulSoup("<html><p>adddfaf<strong>Hello <a>hello</html>","html.parser")
    soup.prettify()
        '<html>\n <p>\n  adddfaf\n  <strong>\n   Hello\n   <a>\n    hello\n   </a>\n  </strong>\n </p>\n</html>'
    print(soup.prettify())
    <html>
    <p>
    adddfaf
    <strong>
    Hello
    <a>
        hello
    </a>
    </strong>
    </p>
    </html>

    36.  

    >>> html_doc="""  <html><head><title> The Do strory </title> </head>
    <body>
    <p class="title"><b>The Dormouse story</b></p>
    
    <p class="story"> Once upone a time were three little sis
    <a href="jlajjjaj aj "> elsie</a>,
    <a href="jlajjjaj aj "> elsie2</a> and
    <a href="jlajjjaj aj "> elsie<3/a>;

    jljajf jaf a</p>

    <p class= "story">... </p>"""


    >>> from bs4 import BeautifulSoup
    
    >>> soup = BeautifulSoup(html_doc,"html.parser")
   
    >>> soup
        <html><head><title> The Do strory </title> </head>
        <body>
        <p class="title"><b>The Dormouse story</b></p>
        <p class="story"> Once upone a time were three little sis
            <a href="jlajjjaj aj "> elsie</a>,
            <a href="jlajjjaj aj "> elsie2</a> and
            <a href="jlajjjaj aj "> elsie&lt;3/a&gt;;

            jljajf jaf a</a></p>
        <p class="story">... </p></body></html>
        >>> soup.prettify()
        '<html>\n <head>\n  <title>\n   The Do strory\n  </title>\n </head>\n <body>\n  <p class="title">\n   <b>\n    The Dormouse story\n   </b>\n  </p>\n  <p class="story">\n   Once upone a time were three little sis\n   <a href="jlajjjaj aj ">\n    elsie\n   </a>\n   ,\n   <a href="jlajjjaj aj ">\n    elsie2\n   </a>\n   and\n   <a href="jlajjjaj aj ">\n    elsie&lt;3/a&gt;;\n\n    jljajf jaf a\n   </a>\n  </p>\n  <p class="story">\n   ...\n  </p>\n </body>\n</html>'
    
    >>> print(soup.prettify())
            <html>
            <head>
            <title>
            The Do strory
            </title>
            </head>
            <body>
            <p class="title">
            <b>
                The Dormouse story
            </b>
            </p>
            <p class="story">
            Once upone a time were three little sis
            <a href="jlajjjaj aj ">
                elsie
            </a>
            ,
            <a href="jlajjjaj aj ">
                elsie2
            </a>
            and
            <a href="jlajjjaj aj ">
                elsie&lt;3/a&gt;;

                jljajf jaf a
            </a>
            </p>
            <p class="story">
            ...
            </p>
            </body>
            </html>
            >>> 

37. how can i access each part of html ?
        OR
    Navigetting for each part of html ?
=>
    >>> soup.body.b
        <b>The Dormouse story</b>

    >>> soup.a
        <a href="jlajjjaj aj "> elsie</a>

38. how to find particuler module using html doc ?
=>
    >>> soup.find_all('a') //find a from html doc

        [<a href="jlajjjaj aj "> elsie</a>, <a href="jlajjjaj aj "> elsie2</a>, <a href="jlajjjaj aj "> elsie&lt;3/a&gt;;

         jljajf jaf a</a>]

    >>> array = soup.find_all('a')
    >>> array[0]

        <a href="jlajjjaj aj "> elsie</a>


    >>> array[1]

        <a href="jlajjjaj aj "> elsie2</a>

    >>> array[2]

        <a href="jlajjjaj aj "> elsie&lt;3/a&gt;;

        jljajf jaf a</a>



/****
* Beautiful Soup : BS Function
***/

    >>> body_tag = soup.body

    >>> for i in body_tag.children:
	print(i)



            <p class="title"><b>The Dormouse story</b></p>


            <p class="story"> Once upone a time were three little sis
                <a href="jlajjjaj aj "> elsie</a>,
                <a href="jlajjjaj aj "> elsie2</a> and
                <a href="jlajjjaj aj "> elsie&lt;3/a&gt;;

                jljajf jaf a</a></p>


            <p class="story">... </p>
            
39. descendants function ?
=>
    descendants go through the every single tag no matter what

    >>> for i in body_tag.descendants:
	            print(i)


            <p class="title"><b>The Dormouse story</b></p>
            <b>The Dormouse story</b>
            The Dormouse story


            <p class="story"> Once upone a time were three little sis
                <a href="jlajjjaj aj "> elsie</a>,
                <a href="jlajjjaj aj "> elsie2</a> and
                <a href="jlajjjaj aj "> elsie&lt;3/a&gt;;

                jljajf jaf a</a></p>
            Once upone a time were three little sis
                
            <a href="jlajjjaj aj "> elsie</a>
            elsie
            ,
                
            <a href="jlajjjaj aj "> elsie2</a>
            elsie2
            and
                
            <a href="jlajjjaj aj "> elsie&lt;3/a&gt;;

                jljajf jaf a</a>
            elsie<3/a>;

                jljajf jaf a


            <p class="story">... </p>
            ... 

/***
*   .Parent and .String 
**/

40. How to get particuler String ?
=>
   // .String function  or tag

        >>> head_tag = soup.head

        >>> head_tag.title

        <title> The Do strory </title>

        >>> head_tag.title.string

        ' The Do strory '
        >>> 

// .parent funtion or tag

    >>> head_tag.title.parent
        <head><title> The Do strory </title> </head>
        >>> head_tag.parent
        <html><head><title> The Do strory </title> </head>
        <body>
        <p class="title"><b>The Dormouse story</b></p>
        <p class="story"> Once upone a time were three little sis
            <a href="jlajjjaj aj "> elsie</a>,
            <a href="jlajjjaj aj "> elsie2</a> and
            <a href="jlajjjaj aj "> elsie&lt;3/a&gt;;

            jljajf jaf a</a></p>
        <p class="story">... </p></body></html>

/*
*  Beautiful Soup : Searching
**/

41. Any tag we want to search wher starting letter 'b'
=>
    >>> import re
    >>> for tag in soup.find_all(re.compile("^b")):
        print(tag.name)

            body
            b

42. Request in python :
=>
    * it is enable to do all this html context without using the ulrlib.re.open()
    
43. How to get particuler value from an any website ?
=>
            >>> from bs4 import*

            >>> import requests

            >>> url ="https://www.accuweather.com/en/us/san-jose-ca/95110/weather-forecast/347630"

            >>> headers={'user-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36'}

            >>> data=requests.get(url,headers=headers)

            >>> data
            <Response [200]>

            >>> soup=BeautifulSoup(data.text,"html.parser")

            >>> soup.find('div')
                            
                            <div class="menu menu-list add-interest-menu" id="menu-cities">
                            <div class="menu-head-lt">
                            <div class="menu-head-rt">
                            <div class="menu-head"></div>
                            </div>
                            </div>
                            <!-- /.menu-head-lt -->
                            <div class="menu-body-lt">
                            <div class="menu-body-rt">
                            <div class="menu-body">
                            <ul class="menu-items">
                            <li class="title">MY RECENT LOCATIONS<span>°F</span></li>
                            <li>
                            <a href="https://www.accuweather.com/en/us/san-jose-ca/95110/weather-forecast/347630">San Jose, CA<span class="temp">57°</span><span class="icon i-7-s"></span></a>
                            </li>
                            <li>
                            <a href="https://www.accuweather.com/en/us/new-york-ny/10017/weather-forecast/349727">New York, NY<span class="temp">62°</span><span class="icon i-11-s"></span></a>
                            </li>
                            <li>
                            <a href="https://www.accuweather.com/en/us/miami-fl/33128/weather-forecast/347936">Miami, FL<span class="temp">78°</span><span class="icon i-3-s"></span></a>
                            </li>
                            <li>
                            <a href="https://www.accuweather.com/en/us/los-angeles-ca/90012/weather-forecast/347625">Los Angeles, CA<span class="temp">60°</span><span class="icon i-7-s"></span></a>
                            </li>
                            <li class="more"><a href="https://www.accuweather.com/en/browse-locations">Browse for your location<span></span></a></li>
                            </ul>
                            <span class="arrow"></span><span class="arrow-border"></span>
                            </div>
                            </div>
                            </div>
                            <!-- /.menu-body-lt -->
                            <div class="menu-foot-lt">
                            <div class="menu-foot-rt">
                            <div class="menu-foot"></div>
                            </div>
                            </div>
                            <!-- /.menu-foot-lt -->
                            </div>
                            >>> soup.find('div',{'class':'info'})
                            <div class="info">
                            <div class="temp">
                            <span class="large-temp">57°</span>
                            <span class="real-feel">RealFeel® 55°</span>
                            </div>
                            <ul class="special-forecast"></ul>
                            </div>

            >>> data2 = soup.find('div',{'class':'info'})

            >>> data3 = data2.find('span',{'class':'large-temp'})

            >>> data3
            <span class="large-temp">57°</span>
            
            >>> data3.contents
            ['57°']

            >>> data3.contents[0]
            '57°'
            >>> 


44. How to install pip , tensorflow, beautifulsoup4 and requests in pycharm ?
=>

        import pip
        pip.main(['install', 'tensorflow'])

        pip.main(['install', 'beautifulsoup4'])

        pip.main(['install', 'requests'])

45. How to get array length in python ?
=>
    a=[4,5,3]
    len(a)  //using len

46. BeautifulSoup : Antonym Parsing 





/***

MatPlotLib 
 */

    * create graph and chart 

    pip install matplotlib
    
    pip.main(['install', 'matplotlib'])