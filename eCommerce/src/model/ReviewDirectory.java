/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tianrui Dong
 */


/**
 * Class representing a directory of reviews.
 */
public class ReviewDirectory {
    ArrayList<Review> allReviews; 

    public ReviewDirectory() {
        this.allReviews = new ArrayList<>();
    }
    
    public ArrayList<Review> getAllReviews() { 
        return allReviews;
    }

    public void setAllReviews(ArrayList<Review> allReviews) { 
        this.allReviews = allReviews;
    }
    
    public void addReview(Review newReview){ 
        this.allReviews.add(newReview);
    }
    
    public void removeReview(Review review){ 
        this.allReviews.remove(review);
    }

    @Override
    public String toString() {
        return "ReviewDirectory{" + "allReviews=" + allReviews + '}'; 
    }   
}
