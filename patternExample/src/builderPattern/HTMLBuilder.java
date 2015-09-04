package builderPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
	
	private String filename;
	private PrintWriter writer;
	public void makeTitle (String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");
	}
	
	public void makeString(String str) {
		writer.println("<p>" + str + "</p>");
	}
	
	public void makeItems(String[] items) {
		writer.print("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.print("</ul>");
	}
	public void close() {
		writer.print("</body></html>");
		writer.close();
	}
	public String getResult() {
		return filename;
	}

}
