package at.ac.fhcampuswien.fhmdb.api;

import at.ac.fhcampuswien.fhmdb.models.Genre;

import java.util.UUID;

public class MovieAPIRequestBuilder {
    public static final String DELIMITER = "&";
    private static final String URL = "https://prog2.fh-campuswien.ac.at/movies"; // https if certificates work

    public String query;
    public String genre;
    public String releaseYear;
    public String ratingFrom;
    public UUID id;

    public MovieAPIRequestBuilder query(String query){
        this.query = query;
        return this;
    }
    public MovieAPIRequestBuilder genre(String genre){
        this.genre = genre;
        return this;
    }
    public MovieAPIRequestBuilder releaseYear(String releaseYear){
        this.releaseYear = releaseYear;
        return this;
    }
    public MovieAPIRequestBuilder ratingFrom(String ratingFrom){
        this.ratingFrom = ratingFrom;
        return this;
    }
    public MovieAPIRequestBuilder id(UUID id){
        this.id = id;
        return this;
    }

    public String build() {
        StringBuilder url = new StringBuilder(URL);

        if (this.id != null) url.append("/").append(this.id).append(DELIMITER);

        url.append("?");

        // check all parameters and add them to the url
        if (this.query != null && !this.query.isEmpty() && !this.query.equals("null")) {
            url.append("query=").append(this.query).append(DELIMITER);
        }
        if (this.genre != null && !this.genre.equals("null")) {
            url.append("genre=").append(this.genre).append(DELIMITER);
        }
        if (this.releaseYear != null && !this.releaseYear.equals("null")) {
            url.append("releaseYear=").append(this.releaseYear).append(DELIMITER);
        }
        if (this.ratingFrom != null && !this.ratingFrom.equals("null")) {
            url.append("ratingFrom=").append(this.ratingFrom).append(DELIMITER);
        }

        return url.toString();
    }
}
