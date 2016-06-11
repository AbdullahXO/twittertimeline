/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twittertest;

import twitter4j.*;

import java.util.List;

/**
 *
 * @author jarvis
 */
public class Twittertest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Twitter twitter = new TwitterFactory().getInstance();
        java.util.List tweets = null;
        
        
        try 
        {
            String userName =""; // Twitter's username
            Paging page = new Paging (1, 100);//page number, number per page
            tweets = twitter.getUserTimeline(userName, page);
            
            
            for (int i=0; i < tweets.size() ; i++) 
            {
                Status tweet = (Status)tweets.get(i);
 
                    //println(status.getUser().getName() + ": " + status.getText());
                System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText() );
            }
            /*
            Query query = new Query("just got real");
            QueryResult result;
            do 
            {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) 
                {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                }
            } while ( (query = result.nextQuery() ) != null);
            
            * */
            //System.exit(0);
        }
        catch (TwitterException te) 
        {
            te.printStackTrace();
            System.out.println("Failed: " + te.getMessage());
            //System.exit(-1);
        }
    }
}
