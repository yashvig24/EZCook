package com.andy.ezcook;

/**
 * Created by Andy on 3/24/2018.
 */

public class Recipe {
    private String name;
    private String imageUrl;
    private String youtubeURL;
    private String category;
    private String recipe;

    public Recipe(String name, String imageUrl, String youtubeURL, String category, String recipe) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.youtubeURL = youtubeURL;
        this.category = category;
        this.recipe = recipe;
    }

    public String getYoutubeURL() {
        return youtubeURL;
    }

    public void setYoutubeURL(String youtubeURL) {
        this.youtubeURL = youtubeURL;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
