package kr.dev.netflix.models;

public class RekFilmsData {

    private int filmImage;
    private String filmName;
   private String data;

    public RekFilmsData(int filmImage, String filmName, String data) {
        this.filmImage = filmImage;
        this.filmName = filmName;
        this.data = data;
    }

    public int getFilmImage() {
        return filmImage;
    }

    public void setFilmImage(int filmImage) {
        this.filmImage = filmImage;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
