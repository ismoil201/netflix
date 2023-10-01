package kr.dev.netflix.models;

public class SearchResult {
    int imgFilm;
    String name;
    String data;
    String time;
    String janr;

    public SearchResult(int imgFilm, String name, String data, String time, String janr) {
        this.imgFilm = imgFilm;
        this.name = name;
        this.data = data;
        this.time = time;
        this.janr = janr;
    }

    public int getImgFilm() {
        return imgFilm;
    }

    public void setImgFilm(int imgFilm) {
        this.imgFilm = imgFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getJanr() {
        return janr;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }
}
