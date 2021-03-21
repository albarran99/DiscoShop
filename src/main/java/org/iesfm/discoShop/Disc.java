package org.iesfm.discoShop;

import java.util.Objects;
import java.util.Set;

public class Disc implements Comparable<> {
    private String title;
    private String artist;
    private Set<String> genres;

    public Disc(String title, String artist, Set<String> genres) {
        this.title = title;
        this.artist = artist;
        this.genres = genres;
    }



    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disc)) return false;
        Disc disc = (Disc) o;
        return Objects.equals(title, disc.title) && Objects.equals(artist, disc.artist) && Objects.equals(genres, disc.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist, genres);
    }
}
