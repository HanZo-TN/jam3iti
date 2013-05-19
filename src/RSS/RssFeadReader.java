/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RSS;

import DAO.ArticleDao;
import Metier.Article;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rednaks
 */
public class RssFeadReader {
        private String baseUrl;

    public RssFeadReader(String url) {
        this.baseUrl = url;
    }
    
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String url) {
        this.baseUrl = url;
    }
    
    public List<Article> getItems() {
        System.out.println(baseUrl);
        List<Article> articles=new ArrayList<Article>();
       
        try {
            URL feedUrl = new URL(baseUrl);
            
            /* SyndFeedInput: parser to process RSS feeds into SyndFeed instance*/
            SyndFeedInput input = new SyndFeedInput();
            
            /* Load the RSS feed
             * XmlReader: reading an XML document
             * SyndFeed: rss feed
             */
            SyndFeed feed = input.build(new XmlReader(feedUrl));
            // Iterate through feed items, display each item title
            Iterator entryIter = feed.getEntries().iterator();
            ArticleDao ad = ArticleDao.getInstance();
            int id = ad.findAll().size();
            
            while (entryIter.hasNext())
            {
                SyndEntry entry = (SyndEntry) entryIter.next();
                Article article=new Article(id++,entry.getTitle(), entry.getDescription().getValue(), new Date(entry.getPublishedDate().getTime()));
                articles.add(article);
            }         
           
        } catch (IOException ex) {
                Logger.getLogger(RssFeadReader.class.getName()).log(Level.SEVERE, null, ex);    
        } catch (IllegalArgumentException ex) {
                Logger.getLogger(RssFeadReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FeedException ex) {
                Logger.getLogger(RssFeadReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return articles;
    }
}
