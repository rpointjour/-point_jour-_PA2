package pointjour3_PA2;

import java.util.Scanner;

public class problem_3 {

       public static void main(String[] args) {

             Scanner scnr = new Scanner(System.in);

             // Array of topics

             String[] topics = {"Games", "Health", "Money", "Travel", "Food"};

             // Array for ratings

             int [][] ratings = new int [topics.length][];

             int i;

             int j;

             int people;

             int rating;

             // Ratings array initialized to 0

             for( i=0;i<ratings.length;i++)		// Loop condition for ratings array

             {
            	 ratings[i] = new int[10];

                    for( j=0;j<ratings[i].length;j++)

                           ratings[i][j] = 0;
             }
             // User will input number of people rating

             System.out.print("Enter the number of people rating: ");

             people = scnr.nextInt();

             // Allow the user to rate each topic on a scale of 1-10

             for( i=0;i<people;i++)

             {

                    System.out.println("Rate each topic in the scale 1-10 for the below "+topics.length+" topics : ");

                    for(j=0;j<topics.length;j++)

                    {

                           System.out.print("Enter your rating for "+topics[j]+" : ");

                           rating = scnr.nextInt();

                           // Check the rating and re-prompt if invalid

                           while(rating < 1 || rating > 10)

                           {

                                 System.out.println("Rating should be between [1,10]");	// Display error message

                                 System.out.print("Enter your rating for "+topics[j]+" : ");

                                 rating = scnr.nextInt();

                           }

                          ratings[j][rating-1]++; // Increment the rating

                    }

             }

            //  Array for storing average rating, and taking integer average

             int avgRating[] = new int[topics.length];

             String highestPointIssue="" , lowestPointIssue="" ;

             int highestPointTotal = 0 , lowestPointTotal= 0;

             // Loop to calculate the average rating, as well as displaying lowest point total and highest point total

             for(i=0;i<ratings.length;i++)

             {

                    avgRating[i] = 0;

                    for(j=0;j<ratings[i].length;j++)

                           avgRating[i] += (ratings[i][j]*(j+1));

                   

                    if(i == 0) // Initialize variables to display average rating

                    {

                           highestPointTotal = avgRating[i];

                           lowestPointTotal= avgRating[i];

                           highestPointIssue = topics[i];

                           lowestPointIssue = topics[i];

                    }else

                    {

                           if(avgRating[i] > highestPointTotal)

                           {

                                 highestPointIssue = topics[i];

                                 highestPointTotal = avgRating[i];

                           }

                          

                           if(avgRating[i] < lowestPointTotal)

                           {

                                 lowestPointIssue = topics[i];

                                 lowestPointTotal= avgRating[i];

                           }

                    }

                   avgRating[i] = avgRating[i]/people;

             }

            // Display topics and its count of ratings. Also, average rating in a tabular format

             System.out.printf("\n%-20s","");

             for(i=0;i<10;i++)

                    System.out.printf("%-10d",(i+1));

             System.out.printf("%20s","Average Rating");

             System.out.println();

             for(i=0;i<ratings.length;i++)

             {

                    System.out.printf("\n%-20s",topics[i]);

                    for(j=0;j<ratings[i].length;j++)

                           System.out.printf("%-10d",ratings[i][j]);

                    System.out.printf("%20d",avgRating[i]);
             }

            // Display topics with highest and lowest point total

             System.out.println("\nHighest Point total : "+highestPointTotal+" Issue : "+highestPointIssue);

             System.out.println("Lowest Point total : "+lowestPointTotal+" Issue : "+lowestPointIssue);

             scnr.close();
       }

}
