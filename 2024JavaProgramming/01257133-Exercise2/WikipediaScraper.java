package ntou.cs.java2024;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/*
In this example, we define the URL of the Wikipedia page for "The Mythical Man-Month" 
and use the Jsoup.connect(url).get() method to fetch the HTML content of the page. 
We then use the select() method of the Document class to extract various pieces of 
information about the book, such as the title, author, publisher, publication date, 
and plot summary, using their respective HTML element selectors. 
Finally, we print out this information to the console.
*/

public class WikipediaScraper {

	public static void main(String[] args) {
		try {
			String bookName = "The_Mythical_Man-Month";
			String url = "https://en.wikipedia.org/wiki/" + bookName;

			Document doc = Jsoup.connect(url).get();

			// Extract the book title
			Element titleElem = doc.select("#firstHeading").first();
			String title = titleElem.text();
			System.out.println("\nTitle: " + title);

			// Extract the author
			Element authorElem = doc.select(".infobox-data a").first();
			String author = authorElem.text();
			System.out.println("Author: " + author);

			// Extract the publisher
			Element infoBoxElem = doc.select(".infobox.vcard").first();
			Element publisherElem = infoBoxElem.select("th:contains(Publisher)").first().nextElementSibling();
			String publisher = publisherElem.text();
			System.out.println("Publisher: " + publisher);
			// Code here (Please refer to the above code block)

			// Extract the publication date
			Element pubDateElem = infoBoxElem.select("th:contains(Published), th:contains(Publication date)").first().nextElementSibling();
			String pubDate = pubDateElem.text();
			System.out.println("Publication date: " + pubDate);
			// Code here (Please refer to the above code block)

			// Extract the plot summary
			Element plotElem = infoBoxElem.nextElementSibling();
			String plot = plotElem.text();
			System.out.println("Summary: " + plot);
			// Code here (Please refer to the above code block)
		} catch (IOException | NullPointerException exception) {
			System.out.println("\nSomething cannot be fetched.");
		}
	}
}
