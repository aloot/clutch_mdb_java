package db.gui;

import java.util.Scanner;
import java.util.ArrayList;

public class AddMovie {

  public ArrayList<String> addMovieList = new ArrayList<String>();
  private String name       = "";
  private String genre      = "";
  private String genreInput = "";
  private String age        = "";
  private String company    = "";
  private String year       = "";
  private int yearInt       = -1;
  private int ageInt        = -1;
  private String synopsis   = "";
  private String director   = "";

  //private Character c = new Character();

  public ArrayList<String> addMovie() {

    Scanner in = new Scanner(System.in);

      System.out.print("\nTitle of movie: ");
      name = in.nextLine();
      do {
        if (name.trim().isEmpty()){
          System.out.print("\nTitle can not be empty, please enter a valid title: ");
          name = in.nextLine();
        }
      } while (name.trim().isEmpty());
      String newName = name.trim();
      addMovieList.add(newName);

      System.out.print("\nGenre of movie: ");
      genreInput = in.nextLine();
      genre = genreInput.toLowerCase();
      while (!genre.equals("action") && !genre.equals("drama") && !genre.equals("comedy") && !genre.equals("family") && !genre.equals("horror") && !genre.equals("thriller") && !genre.equals("musical") && !genre.equals("western") && !genre.equals("war") && !genre.equals("fantasy") && !genre.equals("adventure")) {
        System.out.println("\n[action]");
        System.out.println("[adventure]");
        System.out.println("[comdey]");
        System.out.println("[drama]");
        System.out.println("[family]");
        System.out.println("[fantasy]");
        System.out.println("[horror]");
        System.out.println("[musical]");
        System.out.println("[thriller]");
        System.out.println("[war]");
        System.out.println("[western]");
        System.out.println("\nIvalid input!");
        System.out.print("\nPlease choose any of the genres above: ");
        genreInput = in.nextLine();
        genre = genreInput.toLowerCase();
      }
      addMovieList.add(genre);

    /*  System.out.print("\nRecommended age for movie: ");
      age = in.nextLine();
      addMovieList.add(age); */

      for (;;) {
        System.out.print("\nAge rating for movie: ");
        String line = in.nextLine();
        try {
          ageInt = Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
          System.out.println("\nInvalid input! Not a valid number.");
          continue;
        }
        if (ageInt < 0 || ageInt > 18) {
          System.out.println("\nInvalid input! Out of range.");
          continue;
        }
        break;
      }
      String age = Integer.toString(ageInt);
      addMovieList.add(age);

      System.out.print("\nProduction company: ");
      company = in.nextLine();
      addMovieList.add(company);

      for (;;) {
        System.out.print("\nYear movie was produced: ");
        String line = in.nextLine();
        try {
          yearInt = Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
          System.out.println("\nInvalid input! Not a valid number.");
          continue;
        }
        if (yearInt < 1896 || yearInt > 2017) {
          System.out.println("\nInvalid input! Out of range.");
          continue;
        }
        break;
      }
      String year = Integer.toString(yearInt);
      addMovieList.add(year);

      System.out.print("\nSynopsis: ");
      synopsis = in.nextLine();
      addMovieList.add(synopsis);

      System.out.print("\nDirector of the movie: ");
      director = in.nextLine();
      addMovieList.add(director);



      /*while (true) {
        c.askForActor();
      }*/

      /*System.out.println("\nTitle: " + name + "\nGenre: " + genre +  "\nRecommended age: " + age + "\nProduction company: " + company + "\nRelease year: " + year + "\nDirector: " + director + "\nSynopsis: " + synopsis);*/
      return addMovieList;
    }
  }
