package com.Eventify.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "comment_id")
   private int comment_id;
   
   @ManyToOne
   @JoinColumn(name = "user_id")
   private User user;
   
   @ManyToOne
   @JoinColumn(name = "event_id")
   private Event event;
    
   @Column(name = "comment_text", nullable = false)
   private String comment_text;
    
   @Column(name = "rating")
   private int rating;
   
   // Constructor
   public Comment()
   {
   }
   
   public Comment(User user, Event event, String comment_text, int rating)
   {
      this.user = user;
      this.event = event;
      this.comment_text = comment_text;
      this.rating = rating;
   }
   
   // Setters and Getters
   public int getCommentId()
   {
      return comment_id;
   }
   
   public User getUser()
   {
      return user;
   }
   
   public Event getEvent()
   {
      return event;
   }
   
   public String getCommentText()
   {
      return comment_text;
   }
   
   public void setCommentText(String comment_text)
   {
      this.comment_text = comment_text;
   }
   
   public int getRating()
   {
      return rating;
   }
   
   public void setRating(int rating)
   {
      this.rating = rating;
   }
}