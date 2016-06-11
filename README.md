# twittertimeline
Get 100 tweets from a Twitter user


Setup Instructions:----------------------------------------------------------------------------------------------------------------

Easy to use Java program to get 100 tweets from a user in Twitter.

Two things to do before using this program:
1) Download the Twitter4J library and add it to your project:
(I shall add the steps to do that in the future)

2) You need to add consumer key and secert:
http://twitter4j.org/en/configuration.html
Follow the first method (create a textfile and put your tokens in it and save it in your project's directory).
To get tokens, see this link:
http://www.codeproject.com/Tips/1076400/Twitter-API-for-beginners

----------------------------------------------------------------------------------------------------------------

Running the program will give you 100 tweets only.
You can get more by doing the following:

page.setPage(2);

As described here: 
https://forum.processing.org/two/discussion/148/how-to-get-more-than-20-results-from-a-user-timeline-with-twitter4j

Hope this helps!
