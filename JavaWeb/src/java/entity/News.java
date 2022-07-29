/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author USER
 */
public class News {
    private int idNews;
    private String idAdmin;
    private String description;
    private String daySubmit;
    private String title;
    private String img;

    public News() {
        
    }
    
    public News(int idNews, String idAdmin, String description, String daySubmit, String title, String img) {
        this.idNews = idNews;
        this.idAdmin = idAdmin;
        this.description = description;
        this.daySubmit = daySubmit;
        this.title = title;
        this.img = img;
    }

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDaySubmit() {
        return daySubmit;
    }

    public void setDaySubmit(String daySubmit) {
        this.daySubmit = daySubmit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    public String toString() {
        return this.title;
    }
}