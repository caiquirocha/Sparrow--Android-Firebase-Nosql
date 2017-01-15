package com.kodexlabs.sparrow;

public class Obj_story {

    private String Website, Founder, Image, Publiser, Story, Title, Id;

    Obj_story(){};

    Obj_story(String Website, String Founder, String Image, String Publiser, String Story, String Title, String Id){
        this.Website = Website;
        this.Founder = Founder;
        this.Image = Image;
        this.Publiser = Publiser;
        this.Story = Story;
        this.Title = Title;
        this.Id = Id;
    }

    //yha pe dedo hawasi sala


    public void setId(String id) {
        Id = id;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setFounder(String founder) {
        Founder = founder;
    }

    public void setPubliser(String publiser) {
        Publiser = publiser;
    }

    public void setStory(String story) {
        Story = story;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    //yha se lelo bhikari


    public String getId() {
        return Id;
    }

    public String getImage() {
        return Image;
    }

    public String getFounder() {
        return Founder;
    }

    public String getPubliser() {
        return Publiser;
    }

    public String getStory() {
        return Story;
    }

    public String getTitle() {
        return Title;
    }

    public String getWebsite() {
        return Website;
    }
}
