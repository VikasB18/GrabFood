# GrabFood Data Scraping

This project aims to scrape restaurant data from the GrabFood website using Java and Jsoup library.

## Overview

The project consists of two main components:

1. **GrabFoodScraperService**: This service class is responsible for scraping restaurant data from the GrabFood website. It utilizes Jsoup, a Java HTML parser library, to extract information such as restaurant name, cuisine, rating, offer, notice, and image link.

2. **GrabFoodController**: This controller class exposes REST endpoints for initiating the scraping process and saving the scraped data. It utilizes Spring Boot to handle HTTP requests and responses.

## Approach and Methodology

- **Scraping Process**: I employed Jsoup to connect to the GrabFood website and parse the HTML structure to extract relevant restaurant information. Each restaurant's data was encapsulated in a `Restaurant` object.

- **Data Storage**:Utilized JSON  format for storing the scraped data. Additionally.

## Challenges Faced

1. **Image Extraction**: Extracting restaurant images posed a challenge due to inconsistencies in the HTML structure across different restaurant listings. We addressed this by carefully inspecting the HTML and refining our selector methods.

2. **Restaurant ID Extraction**: The GrabFood website did not provide explicit restaurant IDs in the HTML, making it difficult to uniquely identify restaurants. We explored various approaches but ultimately faced limitations due to the website's structure.

## Usage

1. **Clone Repository**: Clone the repository to your local machine.

2. **Set Up Environment**: Ensure you have Java and Maven installed.

3. **Run Application**: Execute the Spring Boot application by running the main class (`GrabFoodApplication`) or using Maven (`mvn spring-boot:run`).

4. **Access Endpoints**: Use the following endpoints to interact with the application:
   - `GET /scrape`: Initiates the scraping process to fetch restaurant data.
   - `GET /save?filePath=<file_path>`: Saves the scraped data to a GZIP-compressed NDJSON file at the specified file path.

5. **View Results**: Check the specified file path to view the saved data in the `restaurants.ndjson.gz` file.

## Future Improvements

1. **Refinement of Image Extraction**: Implement more robust CSS selectors or XPath expressions to improve image extraction reliability.

2. **Restaurant ID Generation**: Explore methods for generating unique restaurant identifiers based on available attributes to facilitate better data tracking and management.

## Conclusion

Despite encountering challenges during the scraping process, My approach enabled me to successfully extract and save restaurant data from the GrabFood website. By addressing these challenges and considering potential improvements, I can enhance the accuracy and efficiency of our scraping solution for future iterations.
