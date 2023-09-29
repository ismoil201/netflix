package kr.dev.netflix.models;

public class FilmData {

    int image;
    String filmName;

    public FilmData(int image, String filmName) {
        this.image = image;
        this.filmName = filmName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }
}
